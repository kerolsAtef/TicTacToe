package com.kerols2020.tictactoe.model;

import android.app.Activity;
import android.content.Intent;
import android.widget.Button;
import android.widget.TextView;

import com.kerols2020.tictactoe.controller.CongratulationsActivity;
import com.kerols2020.tictactoe.controller.MainActivity;

public class TicTacToeGameAlgorithm {




    private Boolean checkWinOfX(String G[][], String playerid) {


        if (checkRows(G, playerid))
            return true;
        if (checkColumns(G, playerid))
            return true;
        if (checkDiagonals(G, playerid))
            return true;
        else
            return false;

    }


    private Boolean checkDiagonals(String G[][], String playerid) {
        Boolean flag = false;
        if (G[0][0] == playerid && G[1][1] == playerid && G[2][2] == playerid) {
            flag = true;
        }
        if (G[0][2] == playerid && G[1][1] == playerid && G[2][0] == playerid) {
            flag = true;
        }
        return flag;
    }

   private Boolean checkRows(String G[][], String playerid) {
        Boolean flag = false;
        if (G[0][0] == playerid && G[0][1] == playerid && G[0][2] == playerid) {
            flag = true;
        }
        if (G[1][0] == playerid && G[1][1] == playerid && G[1][2] == playerid) {
            flag = true;
        }
        if (G[2][0] == playerid && G[2][1] == playerid && G[2][2] == playerid) {
            flag = true;
        }
        return flag;
    }

   private Boolean checkColumns(String G[][], String playerid) {
        Boolean flag = false;

        if (G[0][0] == playerid && G[1][0] == playerid && G[2][0] == playerid) {
            flag = true;
        }
        if (G[0][1] == playerid && G[1][1] == playerid && G[2][1] == playerid) {
            flag = true;
        }
        if (G[0][2] == playerid && G[1][2] == playerid && G[2][2] == playerid) {
            flag = true;
        }
        return flag;
    }

    public String doAlgo(int r,int c,Button button,TextView textView,String G[][])
    {
        String winner ="none";


        if (textView.getText().toString()=="X")
        {

            G[r][c]="X";
            int count_of_occupied_cells=checkDrawable(G);
            button.setText("X");
            if (checkWinOfX(G,"X"))
            {
                winner="X";
            }
            else if (count_of_occupied_cells==9)
            {
              winner ="Draw";
            }

            textView.setText("O");
            button.setClickable(false);

        }
        else
        {
            G[r][c]="O";
            int count_of_occupied_cells=checkDrawable(G);
            button.setText("O");
            if (checkWinOfX(G,"O"))
            {
                winner="O";
            }
            else if (count_of_occupied_cells==9)
            {
                winner ="Draw";
            }
            textView.setText("X");
            button.setClickable(false);

        }
        return winner;
    }

    private int checkDrawable(String G[][])
    {
        int flag=0;
        for (int x=0;x<3;x++)
        {
            for (int y=0;y<3;y++)
            {
               if (G[x][y]!=null)
               {
                   flag++;
               }

            }
        }
        return flag;
    }



}
