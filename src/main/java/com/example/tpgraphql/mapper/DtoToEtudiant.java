package com.example.tpgraphql.mapper;

import com.example.tpgraphql.dto.EtudiantDTO;
import com.example.tpgraphql.entities.Etudiant;
import com.example.tpgraphql.entities.Genre;
import com.example.tpgraphql.repositories.CentreRepository;
import com.example.tpgraphql.entities.Centre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DtoToEtudiant {
    @Autowired
    CentreRepository centreRepository;

    public void toEtudiant(Etudiant et, EtudiantDTO dto) {
        Centre centre = centreRepository.findById(dto.centreId()).orElse(null);
        if (dto != null) {
            et.setNom(dto.nom());
            et.setPrenom(dto.prenom());
            if (dto.genre() != null) {
                et.setGenre(Genre.valueOf(dto.genre()));
            }
            et.setCentre(centre);
        }
    }
}

