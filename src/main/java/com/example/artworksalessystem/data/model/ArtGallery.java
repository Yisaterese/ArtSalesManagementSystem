package com.example.artworksalessystem.data.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import java.util.ArrayList;
import java.util.List;
@Setter
@Getter
@Entity
@Table(name = "galleries")
public class ArtGallery {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long gallery_id;
    @NotBlank(message= "Gallery name must not be empty")
    private String name;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "contactInfo_id")
    private ContactInfo contactInfo;
    @OneToMany(cascade = CascadeType.ALL)
    private List<GalleryInventory> galleryInventory = new ArrayList<>();
    @OneToMany(cascade = CascadeType.ALL)
    private List<ArtWork> artWorks = new ArrayList<>();



}
