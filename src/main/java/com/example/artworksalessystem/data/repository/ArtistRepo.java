package com.example.artworksalessystem.data.repository;

import com.example.artworksalessystem.data.model.Artist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ArtistRepo extends JpaRepository<Artist, Long> {
}
