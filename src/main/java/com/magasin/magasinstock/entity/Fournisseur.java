package com.magasin.magasinstock.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Fournisseur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private  long idFournniseur;
    private String codeFOurnisseur;
    private String libelleFournisseur;
    private categorieFournisseur CategorieFournisseur;

    @OneToMany(cascade = CascadeType.ALL, mappedBy="fournisseur")
    private Set<Facture> factureSet;

    @OneToOne
    private detailleFournisseur detailleFournisseur;

    @ManyToMany(cascade = CascadeType.ALL)
    private Set<secteurActivite> secteurActiviteSet;
}
