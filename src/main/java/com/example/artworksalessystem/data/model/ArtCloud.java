package com.example.artworksalessystem.data.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
@Setter
@Getter
@Entity
public class ArtCloud {
    @Id
    private Long Id;
    @OneToMany(cascade = CascadeType.ALL)
    private List<ArtGallery> artGalleries = new ArrayList<>();
}