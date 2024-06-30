package com.example.artworksalessystem.data.repository;

import com.example.artworksalessystem.data.model.ArtWork;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArtWorkRepository extends JpaRepository<ArtWork, Long> {

    ArtWork findArtWorkByArtWorkSerialNumber(String aId);
}
