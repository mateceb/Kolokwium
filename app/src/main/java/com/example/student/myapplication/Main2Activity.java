package com.example.student.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Main2Activity extends AppCompatActivity {
    @BindView(R.id.recycler)
    RecyclerView recView;
    String lekiText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ButterKnife.bind(this);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recView.setLayoutManager(layoutManager);

        final ArrayList<Leki> lekis = new ArrayList<>();
        {
            lekis.add(new Leki("apap","100 mg"));
            lekis.add(new Leki("paracetamol","80 mg"));
            lekis.add(new Leki("flegamina","120 mg"));
            lekis.add(new Leki("gripex","100 mg"));
        }

        OnClickPleace listener = (view, position) -> {

            lekiText = lekis.get(position).getName();
            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
            Bundle bundle = new Bundle();
            bundle.putString("CoffeeName", lekiText);
            intent.putExtras(bundle);
            startActivity(intent);
        };

        LekiAdapter lekiAdapter = new LekiAdapter(lekis , listener);
        recView.setAdapter(lekiAdapter);





    }
}
