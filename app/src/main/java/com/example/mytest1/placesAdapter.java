package com.example.mytest1;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class placesAdapter extends RecyclerView.Adapter<placesAdapter.placesViewHolder> {

    private final RecyclerInterface recyclerInterface;
    Context context;
   List<recomendedPlaceModel> placesList;


    public placesAdapter(Context context, List<recomendedPlaceModel> placesList,RecyclerInterface recyclerInterface) {
        this.context = context;
        this.placesList = placesList;
        this.recyclerInterface=recyclerInterface;
    }

    @Override
    public placesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
      View view= LayoutInflater.from(context).inflate(R.layout.item_file,parent,false);
        return new placesViewHolder(view,recyclerInterface);
    }

    @Override
    public void onBindViewHolder(@NonNull placesAdapter.placesViewHolder holder, int position) {
        final recomendedPlaceModel data_position= placesList.get(position);
     holder.PlaceName.setText(placesList.get(position).getPlaceName());
     holder.imagePlace.setImageResource(placesList.get(position).getImageUrl());

     holder.itemView.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             Intent i=new Intent(context, DetailsActivity.class);
             //context.startActivity(i);
            // Toast.makeText(context,"item clicked",Toast.LENGTH_SHORT).show();
             i.putExtra("PlaceName",data_position.getPlaceName());
             i.putExtra("image",data_position.getImageUrl());
             v.getContext().startActivity(i);
         }
     });

    }

    @Override
    public int getItemCount() {
        return placesList.size();
    }
    public void filterList(List<recomendedPlaceModel>filteredList){
       placesList=filteredList;
       notifyDataSetChanged();
    }

    public static class placesViewHolder extends RecyclerView.ViewHolder{
        ImageView imagePlace;
        TextView PlaceName;
        LinearLayout linename;
        public placesViewHolder(View itemView, RecyclerInterface recyclerInterface){
            super(itemView);
            imagePlace=itemView.findViewById(R.id.imgjam);
            PlaceName=itemView.findViewById(R.id.place_name);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Object recyclerViewInterface = null;
                    if(recyclerViewInterface !=null){
                      int pos=getAdapterPosition();

                      if(pos!=RecyclerView.NO_POSITION){
                          recyclerInterface.onItelClick(pos);

                      }
                    }
                }
            });
        }
    }
}

