package com.magasin.magasinstock.entity;


import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private  long idProduit;
    private String codePrd;
    private String libellePrd;
    private float prix;
    @Temporal(TemporalType.DATE)
    private Date DateCreation;
    @Temporal(TemporalType.DATE)
    private  Date dateDernierModif;

    @OneToMany(cascade = CascadeType.ALL, mappedBy="produitDET")
    private Set<DetailleFacture> detailleProdFactureSet;


    @ManyToOne
    Stock stock;
    @ManyToOne
    CategorieProduit categProd;
}
