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
public class Operateur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private  long idOperateur;
    private String nom;
    private  String prenom;
    private  String password;

    @OneToMany(cascade =CascadeType.ALL)
    private Set<Facture> factureOperateur;
}
