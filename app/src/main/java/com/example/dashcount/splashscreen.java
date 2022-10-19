package com.example.dashcount;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ProgressBar;

public class splashscreen extends AppCompatActivity {
private Handler handler;
private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);
        progressBar = (ProgressBar) findViewById(R.id.progressBar);

        new Thread(new Runnable() {
            @Override
            public void run() {
                doWork();
                startApp();
                finish();
            }
        }).start();


    }

    private void startApp() {
        Intent intent = new Intent(splashscreen.this,MainActivity.class);
        startActivity(intent);
    }

    private void doWork() {
        for (int progress = 0; progress < 100; progress += 10) {
            try {
                Thread.sleep(250);
                progressBar.setProgress(progress);
            } catch (Exception e) {
                e.printStackTrace();
            }

        }


    }


    }