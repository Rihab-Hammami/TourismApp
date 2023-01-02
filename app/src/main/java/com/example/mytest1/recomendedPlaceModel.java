package com.example.mytest1;

public class recomendedPlaceModel {
    String placeName;
    Integer imageUrl;


    public Integer getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(Integer imageUrl) {
        this.imageUrl = imageUrl;
    }

    public recomendedPlaceModel(String placeName, Integer imageUrl) {
        this.placeName = placeName;
        this.imageUrl=imageUrl;
    }

    public String getPlaceName() {
        return placeName;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }
}
