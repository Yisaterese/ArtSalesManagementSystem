package com.example.artworksalessystem.services;

import com.example.artworksalessystem.data.model.ArtWork;
import com.example.artworksalessystem.dto.request.CreateArtRequest;
import org.springframework.stereotype.Service;

@Service
public interface ArtWorkServices {
    ArtWork createArtWork(CreateArtRequest createArtRequest);

    ArtWork findArtWorkByAId(String aId);
}
