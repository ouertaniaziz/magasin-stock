package com.magasin.magasinstock.controller;


import com.magasin.magasinstock.entity.Facture;
import com.magasin.magasinstock.service.facture.implServiceFacture;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/facture")
public class factureController {
    @Autowired
    implServiceFacture serviceFacture;
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public Facture save(@RequestBody Facture cli) throws Exception{
        Facture factureResponse= (Facture) serviceFacture.save(cli);
        return factureResponse;
    }
    @RequestMapping(value = "/read", method = RequestMethod.GET)
    public List<Facture> getAll() throws Exception {
       return serviceFacture.findAll();
    }
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public String delete(@PathVariable long id) {
        try {
            serviceFacture.delete(id);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return "facture supprimé";
    }
    @RequestMapping(value = "/edit", method = RequestMethod.PUT)
    public String UpdateFacture(@RequestBody Facture f) {
        try {
          serviceFacture.update(f);
            } catch (Exception err) {
            throw new RuntimeException(err);
        }
        return "facture modifié ";
    }
}
