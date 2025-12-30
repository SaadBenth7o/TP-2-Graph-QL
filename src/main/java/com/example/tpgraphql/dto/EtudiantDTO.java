package com.example.tpgraphql.dto;

public record EtudiantDTO(
        String nom,
        String prenom,
        String genre,
        Long centreId
) {
}

