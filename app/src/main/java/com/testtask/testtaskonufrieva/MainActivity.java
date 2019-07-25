package com.testtask.testtaskonufrieva;

import android.app.DatePickerDialog;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.format.DateUtils;
import android.view.View;

import android.widget.DatePicker;
import android.widget.ImageButton;
import android.widget.ScrollView;
import android.widget.TableRow;
import android.widget.TextView;


import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    public String seqNumberFromSun;
    private Calendar calendar;
    private TextView tvDate;
    private TextView nbuDate;
    DatePickerDialog.OnDateSetListener d = new DatePickerDialog.OnDateSetListener() {
        public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
            calendar.set(Calendar.YEAR, year);
            calendar.set(Calendar.MONTH, monthOfYear);
            calendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
            setInitialDate();
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvDate = (TextView) findViewById(R.id.tvDate);
        nbuDate = (TextView) findViewById(R.id.nbuDate);
        calendar = Calendar.getInstance();

        final ImageButton button = (ImageButton) findViewById(R.id.buttonCPB);
        final ImageButton buttonNBU = (ImageButton) findViewById(R.id.buttonNBU);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new DatePickerDialog(MainActivity.this, d,
                        calendar.get(Calendar.YEAR),
                        calendar.get(Calendar.MONTH),
                        calendar.get(Calendar.DAY_OF_MONTH))
                        .show();
            }
        });
        buttonNBU.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new DatePickerDialog(MainActivity.this, d,
                        calendar.get(Calendar.YEAR),
                        calendar.get(Calendar.MONTH),
                        calendar.get(Calendar.DAY_OF_MONTH))
                        .show();
            }
        });

    }

    private void setInitialDate() {

        tvDate.setText(DateUtils.formatDateTime(this,
                calendar.getTimeInMillis(),
                DateUtils.FORMAT_SHOW_DATE | DateUtils.FORMAT_SHOW_YEAR
        ));
        seqNumberFromSun = (String) tvDate.getText();
        inputCours(seqNumberFromSun);
        nbuDate.setText(DateUtils.formatDateTime(this,
                calendar.getTimeInMillis(),
                DateUtils.FORMAT_SHOW_DATE | DateUtils.FORMAT_SHOW_YEAR
        ));
    }

    public void inputCours(String seqNumberFromSun) {
        String cours = "";
        switch (seqNumberFromSun) {
            case "24 июля 2019 г.":
                cours = "26.300";
                break;
            case "23 июля 2019 г.":
                cours = "27.467";
                break;
            case "22 июля 2019 г.":
                cours = "28.198";
                break;
            case "21 июля 2019 г.":
                cours = "24.605";
                break;
            case "20 июля 2019 г.":
                cours = "25.432";
                break;
            case "19 июля 2019 г.":
                cours = "23.381";
                break;
            case "18 июля 2019 г.":
                cours = "28.648";
                break;
            case "17 июля 2019 г.":
                cours = "26.000";
                break;
            default:
                break;
        }


        TextView textView1 = findViewById(R.id.t1);
        textView1.setText(cours);
        TextView textView2 = findViewById(R.id.t2);
        textView2.setText(cours);
        TextView textView3 = findViewById(R.id.t3);
        textView3.setText(cours);
        TextView textView4 = findViewById(R.id.t4);
        textView4.setText(cours);
        TextView textView5 = findViewById(R.id.t5);
        textView5.setText(cours);
        TextView textView6 = findViewById(R.id.t6);
        textView6.setText(cours);


        TextView textView7 = findViewById(R.id.t7);
        textView7.setText(cours);
        TextView textView8 = findViewById(R.id.t8);
        textView8.setText(cours);
        TextView textView9 = findViewById(R.id.t9);
        textView9.setText(cours);
        TextView textView10 = findViewById(R.id.t10);
        textView10.setText(cours);
        TextView textView11 = findViewById(R.id.t11);
        textView11.setText(cours);
        TextView textView12 = findViewById(R.id.t12);
        textView12.setText(cours);
        TextView textView13 = findViewById(R.id.t13);
        textView13.setText(cours);
        TextView textView14 = findViewById(R.id.t14);
        textView14.setText(cours);
        TextView textView15 = findViewById(R.id.t15);
        textView15.setText(cours);
        TextView textView16 = findViewById(R.id.t16);
        textView16.setText(cours);
    }

    public void lightUSD(View v) {
        ScrollView sv = (ScrollView) findViewById(R.id.scrl);
        sv.scrollTo(0, 0);
        TableRow tableRow;
        tableRow = findViewById(R.id.USDTableRow);
        tableRow.setBackgroundColor(0xFFFFFFFF);
        tableRow = findViewById(R.id.EURTableRow);
        tableRow.setBackgroundColor(0xFFFFFFFF);
        tableRow = findViewById(R.id.scrollUSD);
        tableRow.setBackgroundColor(0xFFFFFFFF);
        tableRow = findViewById(R.id.RUBTableRow);
        tableRow.setBackgroundColor(0xFFFFFFFF);
        tableRow = findViewById(R.id.scrollEUR);
        tableRow.setBackgroundColor(0xFFFFFFFF);
        tableRow = findViewById(R.id.scrollRUB);
        tableRow.setBackgroundColor(0xFFFFFFFF);


        tableRow = findViewById(R.id.USDTableRow);
        tableRow.setBackgroundColor(0xFF00FF00);
        tableRow = findViewById(R.id.scrollUSD);
        tableRow.setBackgroundColor(0xFF00FF00);

        sv.scrollTo(0, 180);
    }

    public void lightEUR(View v) {
        ScrollView sv = (ScrollView) findViewById(R.id.scrl);
        sv.scrollTo(0, 0);
        TableRow tableRow;
        tableRow = findViewById(R.id.USDTableRow);
        tableRow.setBackgroundColor(0xFFFFFFFF);
        tableRow = findViewById(R.id.EURTableRow);
        tableRow.setBackgroundColor(0xFFFFFFFF);
        tableRow = findViewById(R.id.scrollUSD);
        tableRow.setBackgroundColor(0xFFFFFFFF);
        tableRow = findViewById(R.id.RUBTableRow);
        tableRow.setBackgroundColor(0xFFFFFFFF);
        tableRow = findViewById(R.id.scrollEUR);
        tableRow.setBackgroundColor(0xFFFFFFFF);
        tableRow = findViewById(R.id.scrollRUB);
        tableRow.setBackgroundColor(0xFFFFFFFF);


        tableRow = findViewById(R.id.EURTableRow);
        tableRow.setBackgroundColor(0xFF00FF00);
        tableRow = findViewById(R.id.scrollEUR);
        tableRow.setBackgroundColor(0xFF00FF00);

        sv.scrollTo(0, 90);
    }

    public void lightRUB(View v) {
        ScrollView sv = (ScrollView) findViewById(R.id.scrl);

        TableRow tableRow;
        tableRow = findViewById(R.id.USDTableRow);
        tableRow.setBackgroundColor(0xFFFFFFFF);
        tableRow = findViewById(R.id.EURTableRow);
        tableRow.setBackgroundColor(0xFFFFFFFF);
        tableRow = findViewById(R.id.scrollUSD);
        tableRow.setBackgroundColor(0xFFFFFFFF);
        tableRow = findViewById(R.id.RUBTableRow);
        tableRow.setBackgroundColor(0xFFFFFFFF);
        tableRow = findViewById(R.id.scrollEUR);
        tableRow.setBackgroundColor(0xFFFFFFFF);
        tableRow = findViewById(R.id.scrollRUB);
        tableRow.setBackgroundColor(0xFFFFFFFF);

        tableRow = findViewById(R.id.RUBTableRow);
        tableRow.setBackgroundColor(0xFF00FF00);
        tableRow = findViewById(R.id.scrollRUB);
        tableRow.setBackgroundColor(0xFF00FF00);

        sv.scrollTo(0, 0);
    }

}
