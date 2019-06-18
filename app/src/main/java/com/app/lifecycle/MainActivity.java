package com.app.lifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("message", "onCreate State");
        Toast.makeText(this, "onCreate State", Toast.LENGTH_SHORT).show();
    }

    protected void onStart(){
        super.onStart();

        Log.d("message", "onStart State");
        Toast.makeText(this, "onStart State", Toast.LENGTH_SHORT).show();
    }

    protected void onStop(){
        super.onStop();

        Log.d("message", "onStop State");
        Toast.makeText(this, "onStop State", Toast.LENGTH_SHORT).show();
    }

    protected void onPause(){
        super.onPause();

        Log.d("message", "onPause State");
        Toast.makeText(this, "onPause State", Toast.LENGTH_SHORT).show();
    }

    protected void onResume(){
        super.onResume();

        Log.d("message", "onResume State");
        Toast.makeText(this, "onResume State", Toast.LENGTH_SHORT).show();
    }

    protected void onDestroy(){
        super.onDestroy();

        Log.d("message", "onDestroy State");
        Toast.makeText(this, "onDestroy State", Toast.LENGTH_SHORT).show();
    }
}
