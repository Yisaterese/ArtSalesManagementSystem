package com.example.artworksalessystem.dto.request;

import com.example.artworksalessystem.data.model.Artist;
import com.example.artworksalessystem.dto.utility.ArtCategory;
import com.example.artworksalessystem.data.model.Dimension;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
public class AddArtWorkRequest {
    private Artist artist;
    private String artWorkTitle;
    private ArtCategory artCategory;
    private BigDecimal price;
    private LocalDate dateCreated;
    private String description;
    private String imageFilePath;
    private Dimension dimension;
    private String AId;
}
