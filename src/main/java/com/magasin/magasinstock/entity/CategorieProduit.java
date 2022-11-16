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
public class CategorieProduit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private  long idCategProd;
    private String codePRod;
    private  String libelleCategoProd;
    @OneToMany(cascade = CascadeType.ALL, mappedBy="categProd")
    private Set<Produit> produitSet;

}
