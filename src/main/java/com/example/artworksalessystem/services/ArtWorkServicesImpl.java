package com.example.artworksalessystem.services;

import com.example.artworksalessystem.data.model.ArtWork;
import com.example.artworksalessystem.data.repository.ArtWorkRepository;
import com.example.artworksalessystem.dto.request.CreateArtRequest;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;

public class ArtWorkServicesImpl implements ArtWorkServices{
    @Autowired
    ArtWorkRepository artWorkRepo;

    @Override
    public ArtWork createArtWork(CreateArtRequest createArtRequest) {
        //artWorkRepo.findAll().forEach(artWork -> {if(artWork.getAId().equals(createArtRequest.getAId()))throw new ArKWorkAlreadyExistException("Artwork with the artwork id "+createArtRequest.getAId()+" already exists");});
        ArtWork artWork = new ArtWork();
        artWork.setArtWorkTitle(createArtRequest.getArtWorkTitle());
       // artWork.setEmail(createArtRequest.getArtisteEmail());
        artWork.setArtCategory(createArtRequest.getArtCategory());
        artWork.setDateCreated(LocalDate.now());
        artWork.setDescription(createArtRequest.getDescription());
        artWork.setDimension(createArtRequest.getDimension());
        artWork.setImageFilePath(createArtRequest.getImageFilePath());
        artWorkRepo.save(artWork);
        return artWork;
    }

    @Override
    public ArtWork findArtWorkByAId(String aId) {
        return artWorkRepo.findArtWorkByArtWorkSerialNumber(aId);
    }


}
