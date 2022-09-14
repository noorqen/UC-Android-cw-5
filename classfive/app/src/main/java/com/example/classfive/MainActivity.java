package com.example.classfive;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Movies>MovieList=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Movies m1 = new Movies("Monsters Inc." , 1, 36 , R.drawable.monster);
        Movies m2 = new Movies("Luca" , 1, 35 , R.drawable.luca);
        Movies m3 = new Movies("Tangled" , 1, 40 , R.drawable.tangled);
        Movies m4 = new Movies("Wall-E" , 1, 38 , R.drawable.walle);
        Movies m5 = new Movies("Ratatouille" , 1, 51 , R.drawable.rat);
        Movies m6 = new Movies("The Incredibles" , 1, 55 , R.drawable.incredibles);

        MovieList.add(m1);
        MovieList.add(m2);
        MovieList.add(m3);
        MovieList.add(m4);
        MovieList.add(m5);
        MovieList.add(m6);

        RecyclerView recycler = findViewById(R.id.rv);
        recycler.setHasFixedSize(true);
        RecyclerView.LayoutManager manager = new LinearLayoutManager(this);
        recycler.setLayoutManager(manager);

        ItemAdapter adapter = new ItemAdapter(MovieList, this);
        recycler.setAdapter(adapter);
    }
}