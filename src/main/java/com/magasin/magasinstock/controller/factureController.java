package com.magasin.magasinstock.controller;


import com.magasin.magasinstock.service.facture.implServiceFacture;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/facture")
public class factureController {
    @Autowired
    implServiceFacture serviceFacture;

}
