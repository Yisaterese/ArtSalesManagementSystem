package com.example.artworksalessystem.data.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class GalleryInventory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long id;
    @ManyToOne
    private ArtWork artWork;
}
