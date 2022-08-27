package com.example.weatherapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.SimpleTimeZone;

public class WeatherRVAdapter extends RecyclerView.Adapter<WeatherRVAdapter.ViewHolder> {
private Context context;
private ArrayList<WeatherRVModel> weatherRVModelArrayList;

    public WeatherRVAdapter(Context context, ArrayList<WeatherRVModel> weatherRVModelArrayList) {
        this.context = context;
        this.weatherRVModelArrayList = weatherRVModelArrayList;
    }

    @NonNull
    @Override
    public WeatherRVAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.weather_rv_item,parent,false);
        return new ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull WeatherRVAdapter.ViewHolder holder, int position) {
        WeatherRVModel model=weatherRVModelArrayList.get(position);
        holder.temparatureTV.setText(model.getTemparature()+"°C");
        Picasso.get().load("https:".concat(model.getIcon())).into(holder.conditionIV);
        holder.windTV.setText(model.getWindSpeed()+"Km/h");
        SimpleDateFormat input =new SimpleDateFormat("YYYY-MM-DD HH:MM");
        SimpleDateFormat utput=new SimpleDateFormat("HH:MM AA");
try{

    }

    @Override
    public int getItemCount() {
        return 0;
    }

   public class ViewHolder extends RecyclerView.ViewHolder {
         private TextView windTV,temparatureTV,timeTV;
         private ImageView conditionIV;
       public ViewHolder(@NonNull View itemView) {
           super(itemView);
           windTV=itemView.findViewById(R.id.idTVWindSpeed);
      timeTV=itemView.findViewById(R.id.idTVTime);
           conditionIV=itemView.findViewById(R.id.idTVCondition);
       }
   }
}
