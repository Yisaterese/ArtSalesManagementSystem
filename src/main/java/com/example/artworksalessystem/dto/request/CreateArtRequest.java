package com.example.artworksalessystem.dto.request;

import com.example.artworksalessystem.data.model.Dimension;
import com.example.artworksalessystem.dto.utility.ArtCategory;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
public class CreateArtRequest {
    private String  artisteEmail;
    private String artWorkTitle;
    private ArtCategory artCategory;
    private LocalDate dateCreated;
    private String description;
    private String imageFilePath;
    private Dimension dimension;
    private String AId;
}
