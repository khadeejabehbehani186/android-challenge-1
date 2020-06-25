package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    boolean Xturn = true ;
     TextView turn ;
     int[] Xarry  = new int [9] ;
     int[] Oarry = new int [9] ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button zero = findViewById(R.id.button0);
       final  Button one = findViewById(R.id.button1);
       final  Button two = findViewById(R.id.button2);
       final  Button three = findViewById(R.id.button3);
       final Button four  = findViewById(R.id.button4);
       final Button five = findViewById(R.id.button5);
       final Button six = findViewById(R.id.button6);
      final  Button seven = findViewById(R.id.button7);
      final  Button eight = findViewById(R.id.button8);
      turn = findViewById(R.id.textView);

        Button rest = findViewById(R.id.button16);

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
                if (Xturn)
                    Xarry[0] = 1;
                checkXwin();
                zero.setText("X")
            }
        }
                else {
        }
        Oarry[0] = 1;
                checkOwin();
                    zero.setText("O");
            }
        }

            private void checkOwin() {
            }

            private void checkXwin() {
            });
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Xturn) {
        Xarry[1] = 1;
                    checkXwin();;
                    one.setText("X");
                }
                else {
        Oarry[1] = 1;
                    checkOwin();
                    one.setText("O");
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Xturn) {
        Xarry[2] = 1;
                    checkXwin();
                    two.setText("X");
                }
                else{
        Oarry[2] = 1;
                    checkOwin();
                    two.setText("O");
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Xturn){
        Xarry[3] = 1;
                    checkXwin();
                    three.setText("X");
                else {
        Oarry[3] = 1;
                        checkOwin();
                    three.setText("O");
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Xturn){
        Xarry[4] = 1;
                    checkXwin();
                    four.setText("X");
                else {
        Oarry[4] = 1;
                        checkOwin();
                    four.setText("O");
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Xturn){
        Xarry[5] = 1;
                    checkXwin();
                    five.setText("X");
                else {
        Oarry[5] = 1;
                        checkOwin();
                    five.setText("O");
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Xturn){
        Xarry[6] = 1;
                    checkXwin();
                    six.setText("X");
                else{
        Oarry[6] = 1;
                        checkOwin();
                    six.setText("O");
                    }
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Xturn) {
        Xarry[7] = 1;
                    checkXwin();
                    seven.setText("X");
                else{
        Oarry[7] = 1;
                        checkOwin();
                    seven.setText("O");
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Xturn) {
        Xarry[8] = 1;
                    checkXwin();
                    eight.setText("X");
                else {
        Oarry[8] = 1;
                        checkOwin();
                    eight.setText("O");
            }
        });
    }
    public void checkXwin () {
                Xturn = false ;
                turn.setText("O TURN");
                if (Xarry[0]== 1 && Xarry [1]==1 && Xarry [2]==1)
    }
    Toast.makeText(MainActivity.this,"X WON",Toast.LENGTH_SHORT).show();
        {

        }
     else    if (Xarry[3]== 1 && Xarry [4]==1 && Xarry [5]==1)
        Toast.makeText(MainActivity.this,"X WON",Toast.LENGTH_SHORT).show();
        {
        else    if (Xarry[6]== 1 && Xarry [7]==1 && Xarry [8]==1)
        Toast.makeText(MainActivity.this,"X WON",Toast.LENGTH_SHORT).show();
        }
        {
        else    if (Xarry[0]== 1 && Xarry [3]==1 && Xarry [6]==1)
        Toast.makeText(MainActivity.this,"X WON",Toast.LENGTH_SHORT).show();
        }
        else    if (Xarry[1]== 1 && Xarry [4]==1 && Xarry [7]==1)
        Toast.makeText(MainActivity.this,"X WON",Toast.LENGTH_SHORT).show();
        {
        else    if (Xarry[2]== 1 && Xarry [5]==1 && Xarry [8]==1)
        Toast.makeText(MainActivity.this,"X WON",Toast.LENGTH_SHORT).show();
        {
        else    if (Xarry[0]== 1 && Xarry [4]==1 && Xarry [8]==1)
        Toast.makeText(MainActivity.this,"X WON",Toast.LENGTH_SHORT).show();
        }
        else    if (Xarry[2]== 1 && Xarry [4]==1 && Xarry [6]==1)
        Toast.makeText(MainActivity.this,"X WON",Toast.LENGTH_SHORT).show();
        }
        }
    public void checkOwin () {
                Xturn = true ;
        turn.setText("X TURN");

    }
}