package com.example.artworksalessystem.services;

import com.example.artworksalessystem.data.model.ArtWork;
import com.example.artworksalessystem.data.model.Artist;
import com.example.artworksalessystem.data.repository.ArtistRepo;
import com.example.artworksalessystem.dto.request.RegisterArtistRequest;
import com.example.artworksalessystem.dto.request.RegisterArtistResponse;
import com.example.artworksalessystem.exception.ArtWorkNotFoundException;
import com.example.artworksalessystem.exception.ArtistAlreadyExistsException;
import org.springframework.beans.factory.annotation.Autowired;

import static com.example.artworksalessystem.dto.utility.Mapper.mapRegisterArtistResponse;

public class ArtistServicesImpl implements ArtistServices {
    @Autowired
    ArtistRepo artistRepo;
    @Autowired
    ArtWorkServices artWorkService;

    @Override
    public RegisterArtistResponse registerArtist(RegisterArtistRequest artistRequest) {
        validateEmail(artistRequest);
        Artist newArtist = new Artist();
        newArtist.setName(artistRequest.getName());
        newArtist.setBiography(artistRequest.getBiography());
        newArtist.setContactInfo(artistRequest.getContactInfo());
        newArtist.setPassword(artistRequest.getPassword());
        artistRepo.save(newArtist);
        return mapRegisterArtistResponse(newArtist);
    }

    private void validateEmail(RegisterArtistRequest artistRequest) {
        artistRepo.findAll()
                .forEach(artist -> {if (artist.getContactInfo()
                .getEmail().equals(artistRequest.getContactInfo().getEmail())) throw new ArtistAlreadyExistsException("Artist with the name " + artistRequest.getName() + " already exists");});
    }

//    @Override
//    public AddArtWorkResponse addArtWork(CreateArtRequest addArtWorkRequest) {
////        ArtWork newArtWork = artWorkService.createArtWork(addArtWorkRequest);
//        validateArtWork(newArtWork);
//        Artist foundArtist = artistRepo.findArtistByEmail(newArtWork.getEmail());
//        if (!foundArtist.getContactInfo().getEmail().equals(addArtWorkRequest.getArtisteEmail()))throw new ArtistNotFoundException("Artist not found");
//        foundArtist.getArtWorks().add(newArtWork);
      //  return mapAddArtWorkResponse("Art work with "+newArtWork.getAId()+"Art work identity added successfully");
//    }

    private static void validateArtWork(ArtWork newArtWork) {
        if (newArtWork == null) throw new ArtWorkNotFoundException("Art work not found");
    }
}