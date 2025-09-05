package com.example.loltipos.repository;

import com.example.loltipos.model.Campeao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CampeaoRepository extends JpaRepository<Campeao, Long> {
}