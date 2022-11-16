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
public class Facture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private  long idFacture;
    private float montantRemise;
    private float montantFacture;
    @Temporal(TemporalType.DATE)
    private Date dateCreationFacture;
    @Temporal(TemporalType.DATE)
    private  Date dateDernierModification;
    private boolean archive;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "factureREG")
    private Set<Reglement> reglementSet;

    @OneToMany(cascade = CascadeType.ALL, mappedBy="factureDET")
    private Set<DetailleFacture> detailleFactureSet;

    @ManyToOne
    Fournisseur fournisseur;
}
