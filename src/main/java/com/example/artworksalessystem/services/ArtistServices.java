package com.example.artworksalessystem.services;

import com.example.artworksalessystem.dto.request.AddArtWorkRequest;
import com.example.artworksalessystem.dto.request.CreateArtRequest;
import com.example.artworksalessystem.dto.request.RegisterArtistRequest;
import com.example.artworksalessystem.dto.request.RegisterArtistResponse;
import com.example.artworksalessystem.dto.utility.response.AddArtWorkResponse;
import org.springframework.stereotype.Repository;

@Repository
public interface ArtistServices  {

    RegisterArtistResponse registerArtist(RegisterArtistRequest artistRequest);
    //  AddArtWorkResponse addArtWork(CreateArtRequest addArtWorkRequest);
}
