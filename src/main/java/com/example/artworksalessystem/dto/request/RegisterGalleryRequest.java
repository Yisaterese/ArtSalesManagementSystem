package com.example.artworksalessystem.dto.request;

import com.example.artworksalessystem.dto.utility.GalleryContactInfo;
import com.example.artworksalessystem.dto.utility.GalleryProfile;
import lombok.Data;

@Data
public class RegisterGalleryRequest {
    private String galleryName;
    private GalleryContactInfo galleryInfo;
    private GalleryProfile profile;
}

