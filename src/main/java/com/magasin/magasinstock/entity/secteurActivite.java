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
public class secteurActivite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private  long idSecteur;
    private String codeSecteur;
    private String libelleSecteur;


    @ManyToMany(mappedBy="secteurActiviteSet", cascade = CascadeType.ALL)
    private Set<Fournisseur>fournisseurSet;
}
