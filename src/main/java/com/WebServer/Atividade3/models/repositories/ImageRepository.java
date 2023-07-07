package com.WebServer.Atividade3.models.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.WebServer.Atividade3.models.entities.Image;

public interface ImageRepository extends JpaRepository<Image, Long> {
}
