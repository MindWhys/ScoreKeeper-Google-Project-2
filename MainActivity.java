package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView diceRolledOne;
    TextView diceRolledTwo;
    TextView diceRolledThree;
    TextView diceRolledFour;
    TextView diceRolledFive;
    TextView diceRolledSix;
    int pointsFor1 = 0;
    int pointsFor2 = 0;
    int pointsFor3 = 0;
    int pointsFor4 = 0;
    int pointsFor5 = 0;
    int pointsFor6 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_portrait);
        diceRolledOne = findViewById(R.id.die_1_point);
        diceRolledTwo = findViewById(R.id.die_2_point);
        diceRolledThree = findViewById(R.id.die_3_point);
        diceRolledFour = findViewById(R.id.die_4_point);
        diceRolledFive = findViewById(R.id.die_5_point);
        diceRolledSix = findViewById(R.id.die_6_point);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("pointsFor1", pointsFor1);
        outState.putInt("pointsFor2", pointsFor2);
        outState.putInt("pointsFor3", pointsFor3);
        outState.putInt("pointsFor4", pointsFor4);
        outState.putInt("pointsFor5", pointsFor5);
        outState.putInt("pointsFor6", pointsFor6);
    }

    @Override public void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        pointsFor1 = savedInstanceState.getInt("pointsFor1");
        pointsFor2 = savedInstanceState.getInt("pointsFor2");
        pointsFor3 = savedInstanceState.getInt("pointsFor3");
        pointsFor4 = savedInstanceState.getInt("pointsFor4");
        pointsFor5 = savedInstanceState.getInt("pointsFor5");
        pointsFor6 = savedInstanceState.getInt("pointsFor6");
    }

    public void addOnePoint1(View v) {
        pointsFor1 = pointsFor1 + 1;
        displayFor1(pointsFor1);
    }

    public void subtractOnePoint1(View v) {
        pointsFor1 = pointsFor1 - 1;
        displayFor1(pointsFor1);
    }

    public void displayFor1(int point) {
        TextView pointView = (TextView) findViewById(R.id.die_1_point);
        pointView.setText(String.valueOf(point));
    }

    public void addOnePoint2(View v) {
        pointsFor2 = pointsFor2 + 1;
        displayFor2(pointsFor2);
    }

    public void subtractOnePoint2(View v) {
        pointsFor2 = pointsFor2 - 1;
        displayFor2(pointsFor2);
    }

    public void displayFor2(int point) {
        TextView pointView = (TextView) findViewById(R.id.die_2_point);
        pointView.setText(String.valueOf(point));
    }

    public void addOnePoint3(View v) {
        pointsFor3 = pointsFor3 + 1;
        displayFor3(pointsFor3);
    }

    public void subtractOnePoint3(View v) {
        pointsFor3 = pointsFor3 - 1;
        displayFor3(pointsFor3);
    }

    public void displayFor3(int point) {
        TextView pointView = (TextView) findViewById(R.id.die_3_point);
        pointView.setText(String.valueOf(point));
    }

    public void addOnePoint4(View v) {
        pointsFor4 = pointsFor4 + 1;
        displayFor4(pointsFor4);
    }

    public void subtractOnePoint4(View v) {
        pointsFor4 = pointsFor4 - 1;
        displayFor4(pointsFor4);
    }

    public void displayFor4(int point) {
        TextView pointView = findViewById(R.id.die_4_point);
        pointView.setText(String.valueOf(point));
    }

    public void addOnePoint5(View v) {
        pointsFor5 = pointsFor5 + 1;
        displayFor5(pointsFor5);
    }

    public void subtractOnePoint5(View v) {
        pointsFor5 = pointsFor5 - 1;
        displayFor5(pointsFor5);
    }

    public void displayFor5(int point) {
        TextView pointView = (TextView) findViewById(R.id.die_5_point);
        pointView.setText(String.valueOf(point));
    }

    public void addOnePoint6(View v) {
        pointsFor6 = pointsFor6 + 1;
        displayFor6(pointsFor6);
    }

    public void subtractOnePoint6(View v) {
        pointsFor6 = pointsFor6 - 1;
        displayFor6(pointsFor6);
    }

    public void displayFor6(int point) {
        TextView pointView = (TextView) findViewById(R.id.die_6_point);
        pointView.setText(String.valueOf(point));
    }

    public void resetPoints(View v) {
        pointsFor1 = 0;
        pointsFor2 = 0;
        pointsFor3 = 0;
        pointsFor4 = 0;
        pointsFor5 = 0;
        pointsFor6 = 0;
        displayFor1(pointsFor1);
        displayFor2(pointsFor2);
        displayFor3(pointsFor3);
        displayFor4(pointsFor4);
        displayFor5(pointsFor5);
        displayFor6(pointsFor6);
    }
}
