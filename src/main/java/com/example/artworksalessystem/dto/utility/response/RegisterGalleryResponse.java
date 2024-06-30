package com.example.artworksalessystem.dto.utility.response;

import com.example.artworksalessystem.data.model.ContactInfo;
import lombok.Data;

@Data
public class RegisterGalleryResponse {
    private String name;
    private String password;
    private ContactInfo contactInfo;
}
