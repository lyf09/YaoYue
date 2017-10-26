package com.example.administrator.yaoyue.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.administrator.yaoyue.R;

import javax.sql.DataSource;

/**
 * Created by Administrator on 2017/10/26.
 */

public class LoginActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Button button = (Button)findViewById(R.id.sign);

        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent = new Intent(LoginActivity.this,MainActivity.class);
               startActivity(intent);
                
                //异步请求
                Call<List<Repo>> call = DataSource.getUserService().login(userid,userpassword);
                call.enqueue(new Callback<List<Repo>>() {
                    @Override
                    public void onResponse(Call<List<Repo>> call, Response<List<Repo>> response) {
                        // Get result bean from response.body()
                        List<Repo>  repos = response.body();
                        if(repos.getResultcode()  >=1){
                            AfterLogin(response);
                        }else if(repos.getResultcode() == 0){
                            Toast.makeText(LoginActivity.this,"login Fail!!!",Toast.LENGTH_SHORT).show();
                            CircularAnim.show(login).go();
                            dialog.dismiss();
                            return;
                        }
                    }

                    @Override
                    public void onFailure(Call<List<Repo>> call, Throwable t) {
                        Toast.makeText(LoginActivity.this,"Net Connection Fail!!!",Toast.LENGTH_SHORT).show();
                    }
                });


            }
        });
    }
}
