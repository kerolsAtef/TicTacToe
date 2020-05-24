package com.kerols2020.tictactoe.controller;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.kerols2020.tictactoe.R;
import com.kerols2020.tictactoe.model.TicTacToeGameAlgorithm;

public class MainActivity extends AppCompatActivity {

    TextView playerId , xScore,oScore;
    Button clear,cell_00,cell_01,cell_02,cell_10,cell_11,cell_12,cell_20,cell_21,cell_22;
    String game[][]=new String[3][3];
    TicTacToeGameAlgorithm ticTacToeGameAlgorithm;
    static int Px=0,Po=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cell_00=findViewById(R.id.B00);
        cell_01=findViewById(R.id.B01);
        cell_02=findViewById(R.id.B02);
        cell_10=findViewById(R.id.B10);
        cell_11=findViewById(R.id.B11);
        cell_12=findViewById(R.id.B12);
        cell_20=findViewById(R.id.B20);
        cell_21=findViewById(R.id.B21);
        cell_22=findViewById(R.id.B22);
        playerId=findViewById(R.id.playerId);
        ticTacToeGameAlgorithm=new TicTacToeGameAlgorithm();
        xScore=findViewById(R.id.playerXScore);
        oScore=findViewById(R.id.playerOScore);
        clear=findViewById(R.id.clear);

        writeDataAtfirst();
        cell_00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              String winner="";
               winner= ticTacToeGameAlgorithm.doAlgo(0,0,cell_00,playerId,game);
               if (winner=="X"||winner=="O")
               {
                   writeDataAtrEnd(winner);
                   Intent intent=new Intent(MainActivity.this, CongratulationsActivity.class);
                   intent.putExtra("winner",winner);
                   startActivity(intent);
                   finish();
               }
               else if (winner=="Draw")
               {
                   startActivity(new Intent(MainActivity.this, DrawActivity.class));
                   finish();
               }
            }
        });
        cell_01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String winner="";
                winner= ticTacToeGameAlgorithm.doAlgo(0,1,cell_01,playerId,game);
                if (winner=="X"||winner=="O")
                {
                    writeDataAtrEnd(winner);
                    Intent intent=new Intent(MainActivity.this, CongratulationsActivity.class);
                    intent.putExtra("winner",winner);
                    startActivity(intent);
                    finish();
                }
                else if (winner=="Draw")
                {
                    startActivity(new Intent(MainActivity.this, DrawActivity.class));
                    finish();
                }
            }
        });
        cell_02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String winner="";
                winner= ticTacToeGameAlgorithm.doAlgo(0,2,cell_02,playerId,game);
                if (winner=="X"||winner=="O")
                {
                    writeDataAtrEnd(winner);
                    Intent intent=new Intent(MainActivity.this, CongratulationsActivity.class);
                    intent.putExtra("winner",winner);
                    startActivity(intent);
                    finish();
                }
                else if (winner=="Draw")
                {
                    startActivity(new Intent(MainActivity.this, DrawActivity.class));
                    finish();
                }
            }

        });
        cell_10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String winner="";
                winner= ticTacToeGameAlgorithm.doAlgo(1,0,cell_10,playerId,game);
                if (winner=="X"||winner=="O")
                {
                    writeDataAtrEnd(winner);
                    Intent intent=new Intent(MainActivity.this, CongratulationsActivity.class);
                    intent.putExtra("winner",winner);
                    startActivity(intent);
                    finish();
                }
                else if (winner=="Draw")
                {
                    startActivity(new Intent(MainActivity.this, DrawActivity.class));
                    finish();
                }
            }
        });
        cell_11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String winner="";
                winner= ticTacToeGameAlgorithm.doAlgo(1,1,cell_11,playerId,game);
                if (winner=="X"||winner=="O")
                {
                    writeDataAtrEnd(winner);
                    Intent intent=new Intent(MainActivity.this, CongratulationsActivity.class);
                    intent.putExtra("winner",winner);
                    startActivity(intent);
                    finish();
                }
                else if (winner=="Draw")
                {
                    startActivity(new Intent(MainActivity.this, DrawActivity.class));
                    finish();
                }
            }
        });
        cell_12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String winner="";
                winner= ticTacToeGameAlgorithm.doAlgo(1,2,cell_12,playerId,game);
                if (winner=="X"||winner=="O")
                {
                    writeDataAtrEnd(winner);
                    Intent intent=new Intent(MainActivity.this, CongratulationsActivity.class);
                    intent.putExtra("winner",winner);
                    startActivity(intent);
                    finish();
                }
                else if (winner=="Draw")
                {
                    startActivity(new Intent(MainActivity.this, DrawActivity.class));
                    finish();
                }
            }
        });
        cell_20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String winner="";
                winner= ticTacToeGameAlgorithm.doAlgo(2,0,cell_20,playerId,game);
                if (winner=="X"||winner=="O")
                {
                    writeDataAtrEnd(winner);
                    Intent intent=new Intent(MainActivity.this, CongratulationsActivity.class);
                    intent.putExtra("winner",winner);
                    startActivity(intent);
                    finish();
                }
                else if (winner=="Draw")
                {
                    startActivity(new Intent(MainActivity.this, DrawActivity.class));
                    finish();
                }
            }
        });
        cell_21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String winner="";
                winner= ticTacToeGameAlgorithm.doAlgo(2,1,cell_21,playerId,game);
                if (winner=="X"||winner=="O")
                {
                    writeDataAtrEnd(winner);
                    Intent intent=new Intent(MainActivity.this, CongratulationsActivity.class);
                    intent.putExtra("winner",winner);
                    startActivity(intent);
                    finish();
                }
                else if (winner=="Draw")
                {
                    startActivity(new Intent(MainActivity.this, DrawActivity.class));
                    finish();
                }
            }
        });
        cell_22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String winner="";
                winner= ticTacToeGameAlgorithm.doAlgo(2,2,cell_22,playerId,game);
                if (winner=="X"||winner=="O")
                {
                    writeDataAtrEnd(winner);
                    Intent intent=new Intent(MainActivity.this, CongratulationsActivity.class);
                    intent.putExtra("winner",winner);
                    startActivity(intent);
                    finish();
                }
                else if (winner=="Draw")
                {

                    startActivity(new Intent(MainActivity.this, DrawActivity.class));
                    finish();
                }
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Px=0;
                Po=0;
                xScore.setText(String.valueOf(Px));
                oScore.setText(String.valueOf(Po));
            }
        });

    }
   void writeDataAtrEnd(String Winner)
   {
       if (Winner=="X")
       {
           Px++;
           xScore.setText(String.valueOf(Px));
       }
       else if (Winner=="O")
       {
           Po++;
           oScore.setText(String.valueOf(Po));
       }

   }
   void writeDataAtfirst()
   {
       xScore.setText(String.valueOf(Px));
       oScore.setText(String.valueOf(Po));
   }

}
