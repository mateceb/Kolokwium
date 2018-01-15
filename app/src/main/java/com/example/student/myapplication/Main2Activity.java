package com.example.student.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

import butterknife.ButterKnife;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ButterKnife.bind(this);

        ArrayList<Leki> lekis = new ArrayList<>();
        {
            lekis.add(new Leki("apap","100 mg"));
            lekis.add(new Leki("paracetamol","80 mg"));
            lekis.add(new Leki("flegamina","120 mg"));
            lekis.add(new Leki("gripex","100 mg"));
        }
















    }
}
