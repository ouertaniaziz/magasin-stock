package com.magasin.magasinstock.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Reglement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private  long idReglement;
    private float montantPaye;
    private float montantResto;
    private boolean payee;

    @Temporal(TemporalType.DATE)
    private Date dateReglement;

    @ManyToOne
     Facture factureREG;

}
