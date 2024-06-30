package com.example.artworksalessystem.dto.request;

import com.example.artworksalessystem.data.model.ContactInfo;
import lombok.Data;

import java.time.LocalDate;

@Data
public class RegisterArtistResponse {
    private String id;
    private String name;
    private String biography;
    private LocalDate dateOfBirth;
    private ContactInfo contactInfo;
}
