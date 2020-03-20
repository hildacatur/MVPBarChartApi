package com.example.mvpapi.view;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;

import com.example.mvpapi.R;
import com.example.mvpapi.model.Data;
import com.example.mvpapi.model.ResponseApi;
import com.example.mvpapi.model.Senin;
import com.example.mvpapi.presenter.MainPresenter;
import com.example.mvpapi.presenter.MainPresenterImpl;
import com.example.mvpapi.presenter.MainView;
import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.utils.ColorTemplate;
import com.google.gson.Gson;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements MainView {

    MainPresenter mainPresenter;

//    ArrayList<BarEntry> entries;
//    ArrayList<BarEntry> finalEntries;
    BarChart chart;
//    BarDataSet dataSet;
//    ArrayList<BarEntry> completed = new ArrayList<>();
//    ArrayList<BarDataSet> dataSets;
    Senin senin = new Senin();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainPresenter = new MainPresenterImpl(this, this);
        mainPresenter.dataMainPresenter();
        chart = (BarChart) findViewById(R.id.barChart);
    }

//    @Override
////    public void dataMainView(Object toJson) {
//    public void dataMainView(ResponseApi toJson) {
//        Log.d("", "respon " + toJson);
//
//
//
//
//        }

    @Override
    public void dataMainView(Object toJson) {
        Log.d("", "dataChart" + toJson);

        ArrayList<BarEntry> entries = new ArrayList<>();
        senin.getValue();
        System.out.println("haloo  " + senin.getValue() + " , " + senin.getColor() + " , " + senin.getGrowth() + ")" );

//        entries.add(new BarEntry )

//        completed.add(toJson.)
//        BarDataSet completeData = new BarDataSet(completed, "Completed Issue");
//        completeData.setColor(Color.rgb(0, 155, 0));
//        dataSets = new ArrayList<>();
//        dataSets.add(completeData);
    }
}
