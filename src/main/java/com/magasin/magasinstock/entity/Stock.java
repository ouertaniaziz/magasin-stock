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
public class Stock {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private  long idStock;
    private Integer qte;
    private Integer qteMIn;
    private String libelleStock;

    @OneToMany(cascade = CascadeType.ALL, mappedBy="stock")
    private Set<Produit> produitSet;

}
