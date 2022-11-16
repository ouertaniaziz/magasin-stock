package com.magasin.magasinstock.controller;

import com.magasin.magasinstock.entity.DetailleFacture;
import com.magasin.magasinstock.service.DetailleFacture.implDetailleFacture;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/detaillefacture")
public class DetailleFactureController {

    @Autowired
    implDetailleFacture servicedetailleFacture;
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public DetailleFacture save(@RequestBody DetailleFacture cli) throws Exception{
        DetailleFacture DetailleFactureResponse= (DetailleFacture) servicedetailleFacture.save(cli);
        return DetailleFactureResponse;
    }
    @RequestMapping(value = "/read", method = RequestMethod.GET)
    public List<DetailleFacture> getAll() throws Exception {
        return servicedetailleFacture.findAll();
    }
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public String delete(@PathVariable long id) {
        try {
            servicedetailleFacture.delete(id);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return "facture supprimé";
    }
    @RequestMapping(value = "/edit", method = RequestMethod.PUT)
    public String UpdateFacture(@RequestBody DetailleFacture f) {
        try {
            servicedetailleFacture.update(f);
        } catch (Exception err) {
            throw new RuntimeException(err);
        }
        return "facture modifié ";
    }
}
