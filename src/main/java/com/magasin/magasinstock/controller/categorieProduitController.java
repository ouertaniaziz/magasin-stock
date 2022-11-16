package com.magasin.magasinstock.controller;



import com.magasin.magasinstock.entity.CategorieProduit;
import com.magasin.magasinstock.entity.CategorieProduit;
import com.magasin.magasinstock.service.categorieProduit.implCategorieProd;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/categorieProduit")
public class categorieProduitController {

    @Autowired
    implCategorieProd serviceCatProd;
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public CategorieProduit save(@RequestBody CategorieProduit cli) throws Exception{
        CategorieProduit CategorieProduitResponse= (CategorieProduit) serviceCatProd.save(cli);
        return CategorieProduitResponse;
    }
    @RequestMapping(value = "/read", method = RequestMethod.GET)
    public List<CategorieProduit> getAll() throws Exception {
        return serviceCatProd.findAll();
    }
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public String delete(@PathVariable long id) {
        try {
            serviceCatProd.delete(id);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return "CategorieProduit supprimé";
    }
    @RequestMapping(value = "/edit", method = RequestMethod.PUT)
    public String UpdateCategorieProduit(@RequestBody CategorieProduit f) {
        try {
            serviceCatProd.update(f);
        } catch (Exception err) {
            throw new RuntimeException(err);
        }
        return "CategorieProduit modifié ";
    }
}
