package com.example.classfive;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ItemAdapter extends RecyclerView.Adapter {

    ArrayList<Movies> MovieList=new ArrayList<>();
    Context context;

    public ItemAdapter(ArrayList<Movies> movieList, Context context) {
        MovieList = movieList;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_item, parent, false);
        ViewHolder vh = new ViewHolder(view);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ((ViewHolder)holder).textname.setText(MovieList.get(position).getMovieName());
        ((ViewHolder)holder).textduration.setText(MovieList.get(position).getMovieHrs() + "hr " + MovieList.get(position).getMovieMints() + "mins");
        ((ViewHolder)holder).img.setImageResource(MovieList.get(position).getMovieImg());


    }

    @Override
    public int getItemCount() {
        return MovieList.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder{

        ImageView img;
        TextView textname, textduration;
        View v;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            v = itemView;
            img = v.findViewById(R.id.imageView);
            textname = v.findViewById(R.id.textViewname);
            textduration = v.findViewById(R.id.textViewduration);

        }
    }
}
