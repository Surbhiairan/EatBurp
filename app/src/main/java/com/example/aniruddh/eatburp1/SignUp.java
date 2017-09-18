package com.example.aniruddh.eatburp1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SignUp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        final Intent i= new Intent(this, MainActivity.class);

        Thread timer = new Thread(){

            public void run(){
                try{
                    sleep(4000);
                }
                catch(Exception e){
                    e.printStackTrace();
                }
                finally{
                    startActivity(i);
                    finish();;
                }
            }
        };
        timer.start();
    }
}
