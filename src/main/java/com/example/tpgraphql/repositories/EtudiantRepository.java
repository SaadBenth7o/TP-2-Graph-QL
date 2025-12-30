package com.example.tpgraphql.repositories;

import com.example.tpgraphql.entities.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EtudiantRepository extends JpaRepository<Etudiant, Long> {
}

