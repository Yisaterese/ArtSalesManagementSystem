package com.example.artworksalessystem.dto.utility;

import com.example.artworksalessystem.data.model.Artist;
import com.example.artworksalessystem.dto.request.RegisterArtistResponse;
import com.example.artworksalessystem.dto.utility.response.AddArtWorkResponse;

public class Mapper {

    public static RegisterArtistResponse mapRegisterArtistResponse(Artist artist){
        RegisterArtistResponse response = new RegisterArtistResponse();
        response.setName(artist.getName());
        response.setBiography(artist.getBiography());
        response.setContactInfo(artist.getContactInfo());
        response.setDateOfBirth(artist.getDateOfBirth());
        return response;
    }

    public static AddArtWorkResponse mapAddArtWorkResponse(String message){
        AddArtWorkResponse addArtWorkResponse = new AddArtWorkResponse();
        addArtWorkResponse.setMessage(message);
        return addArtWorkResponse;
    }
}
