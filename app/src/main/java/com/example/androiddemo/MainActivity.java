package com.example.androiddemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btn1;
    private Button btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e("msg","onCreate");
        btn1=findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Activitybtn1.class);
                startActivity(intent);
            }
        });
        btn2=findViewById(R.id.btn2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,MainActivity2.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("msg","OnStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("msg","onStop");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("msg","onPause");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("msg","onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("msg","OnRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("msg","onResume");
    }
}