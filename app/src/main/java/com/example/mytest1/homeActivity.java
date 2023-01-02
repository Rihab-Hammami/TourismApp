package com.example.mytest1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.SearchView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class homeActivity extends AppCompatActivity implements RecyclerInterface {

    RecyclerView placesRecycler;
    placesAdapter placesAd;
    SearchView searchView;
    private CardView card_djerba,card_tozeur,card_sousse,card_monastir;

    public homeActivity() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        searchView=findViewById(R.id.search);
        card_djerba=(CardView)findViewById(R.id.c_djerba);
        card_tozeur=(CardView)findViewById(R.id.c_tozeur);
        card_sousse=(CardView)findViewById(R.id.c_sousse);
        card_monastir=(CardView)findViewById(R.id.c_monastir);

        card_djerba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i;
                i=new Intent(homeActivity.this,djerbaActivity.class); startActivity(i);
            }
        });
        card_tozeur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i;
                i=new Intent(homeActivity.this,tozeurActivity.class); startActivity(i);
            }
        });
        card_sousse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i;
                i=new Intent(homeActivity.this,SousseActivity.class); startActivity(i);
            }
        });
        card_monastir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i;
                i=new Intent(homeActivity.this,MonastirActivity.class); startActivity(i);
            }
        });

   searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
       @Override
       public boolean onQueryTextSubmit(String query) {

           return false;
       }

       @Override
       public boolean onQueryTextChange(String newText) {
           filter(newText);
           return false;
       }
   });



        List<recomendedPlaceModel> placesList=new ArrayList<>();
        placesList.add(new recomendedPlaceModel("Sidi-Bou-Said",R.drawable.sidibou));
        placesList.add(new recomendedPlaceModel("Hammamet",R.drawable.hammamet));
        placesList.add(new recomendedPlaceModel("Bizerte",R.drawable.benzart));
        placesList.add(new recomendedPlaceModel("Sahara",R.drawable.sahra));
        placesList.add(new recomendedPlaceModel("Mdina",R.drawable.mdina));


        setPlacesRecycler(placesList);



    }

    private void filter(String newText) {
        List<recomendedPlaceModel> filteredList=new ArrayList<>();
        for (recomendedPlaceModel item: placesAd.placesList){
            if(item.getPlaceName().toLowerCase().contains(newText.toLowerCase())){
                filteredList.add(item);
            }

        }
        placesAd.filterList(filteredList);
    }

    private void setPlacesRecycler(List<recomendedPlaceModel> placesList){
        placesRecycler=findViewById(R.id.rcv_places);
        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false);
        placesRecycler.setLayoutManager(layoutManager);
        placesAd=new placesAdapter(this,placesList,this);
        placesRecycler.setAdapter(placesAd);
    }


    @Override
    public void onItelClick(int position) {

    }
}