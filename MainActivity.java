package com.example.jayhind.gridviewdemoapp;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements homeAdapter.homeListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView rv;
        rv=findViewById(R.id.rv);
        Context context;
        context=this;
//        rv.setLayoutManager(new LinearLayoutManager(context));
        rv.setLayoutManager(new GridLayoutManager(context,2));
        ArrayList<Integer> al = new ArrayList<>();
        al.add(R.drawable.chrysanthemum);
        al.add(R.drawable.chrysanthemum);
        al.add(R.drawable.chrysanthemum);
        al.add(R.drawable.chrysanthemum);
        homeAdapter hAdapter=new homeAdapter(al,this);
        rv.setAdapter(hAdapter);

    }

    @Override
    public void onUserClick(int position) {

    }
}
