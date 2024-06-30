package com.example.artworksalessystem.data.model;

import com.example.artworksalessystem.dto.utility.ArtCategory;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Setter
@Getter
@Entity
public class ArtWork {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String artWorkTitle;
    @Enumerated(EnumType.STRING)
    private ArtCategory artCategory;
    private BigDecimal price;
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    private LocalDate dateCreated;
    private String description;
    private String imageFilePath;
    private String artWorkSerialNumber;
    @ManyToOne
    @JoinColumn(name = "artGallery_id")
    private ArtGallery artGallery;
    @OneToOne
    private Dimension dimension;
}
