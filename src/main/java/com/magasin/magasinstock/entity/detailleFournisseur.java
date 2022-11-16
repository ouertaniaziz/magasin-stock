package com.magasin.magasinstock.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.xml.crypto.Data;
import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class detailleFournisseur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private  long idDetailleFourn;
    private Date dateDebutCollaboration;
    private  String adresse;
    private String matricule;

    @OneToOne(mappedBy = "detailleFournisseur")
    private Fournisseur fournisseur;
}
