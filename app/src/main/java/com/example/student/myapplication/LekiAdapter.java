package com.example.student.myapplication;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by student on 2018-01-15.
 */

public class LekiAdapter extends RecyclerView.Adapter<LekiAdapter.ViewHolder> {

    private ArrayList<Leki> lekis = new ArrayList<>();
    private OnClickPleace listener;

    LekiAdapter(ArrayList<Leki> lekis , OnClickPleace listener)
    {
        this.lekis = lekis;
        this.listener = listener;
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View itemLayoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, null);

        return new ViewHolder(itemLayoutView, listener);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.setCost(lekis.get(position).getPrice());
        holder.setName(lekis.get(position).getName());
    }


    @Override
    public int getItemCount() {
        return lekis.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.lek)
        TextView name;

        @BindView(R.id.ustaw_dawke)
        TextView dawka;

        @BindView(R.id.wybierz)
        Button Wybrane;

        @OnClick(R.id.choose_btn)
        void onNameClick() {

                Wybrane.setText("wybrano");

        }
        private OnClickPleace listener;




        public ViewHolder(View itemView, OnClickPleace listener) {
            super(itemView);
            ButterKnife.bind(this,itemView);
            this.listener = listener;
            itemView.setOnClickListener(this::OnClick);
        }
        private void setName(String nazwa){name.setText(nazwa);}
        private void setCost(String cena) {dawka.setText(cena);}


        public void OnClick(View view)
        {
            listener.onClickPlace(view, getAdapterPosition());

        }
    }
}