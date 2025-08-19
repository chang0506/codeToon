package com.example.codeToon.repository;

import com.example.codeToon.entity.EpisodeImage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EpisodeImageRepository extends JpaRepository<EpisodeImage, Long> {
}
