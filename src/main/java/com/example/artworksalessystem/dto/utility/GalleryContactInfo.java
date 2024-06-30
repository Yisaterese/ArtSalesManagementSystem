package com.example.artworksalessystem.dto.utility;

import com.example.artworksalessystem.data.model.Address;
import lombok.Data;

@Data
public class GalleryContactInfo {
    private String galleryEmail;
    private String phoneNumber;
    private Address address;

}
