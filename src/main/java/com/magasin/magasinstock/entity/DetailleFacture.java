package com.magasin.magasinstock.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class DetailleFacture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private  long idDetailleFac;
    private  Integer qteCommande;
    private float prixTotal;
    private Integer pourcentageRemise;
    private float montantRemise;

    @ManyToOne
    Facture factureDET;

    @ManyToOne
    Produit produitDET;

}
