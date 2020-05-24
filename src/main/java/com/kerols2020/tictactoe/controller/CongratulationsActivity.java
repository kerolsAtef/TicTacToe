package com.kerols2020.tictactoe.controller;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.kerols2020.tictactoe.R;

public class CongratulationsActivity extends AppCompatActivity {

    TextView playerId;
    String WinnerName="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_congratulations);

        Bundle extras = getIntent().getExtras();


        if (extras != null) {
         WinnerName=extras.getString("winner");
        }
        playerId=findViewById(R.id.PID);
        playerId.setText(WinnerName);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(CongratulationsActivity.this,MainActivity.class));
        finish();
    }
}
