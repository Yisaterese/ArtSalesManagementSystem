package com.example.artworksalessystem.services;

import com.example.artworksalessystem.dto.request.RegisterGalleryRequest;
import com.example.artworksalessystem.dto.utility.response.RegisterGalleryResponse;
import org.springframework.stereotype.Service;

@Service
public interface ArtGalleryServices {
    RegisterGalleryResponse createAccount(RegisterGalleryRequest galleryRequest);
}
