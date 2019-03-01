/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.simple.faculte.commande.rest;

import com.simple.faculte.commande.bean.Fournisseur;
import com.simple.faculte.commande.model.service.FournisseurService;
import com.simple.faculte.commande.rest.converter.AbstractConverter;
import com.simple.faculte.commande.rest.vo.FournisseurVo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author mohcine
 */
@RestController
@CrossOrigin(origins = {"http://localhost:4200"})
@RequestMapping("/faculte-commande/fournisseurs")
public class FournisseurRest {

    @Autowired
   private FournisseurService fournisseurService;
    
    @Autowired
    @Qualifier("fournisseurConverter")
    private AbstractConverter<Fournisseur, FournisseurVo> fournisseurConverter;
    
    @GetMapping("/reference/{reference}")
    public Fournisseur findByReference(String reference) {
        return fournisseurService.findByReference(reference);
    }
    
    @GetMapping("/finAll")
    public List<FournisseurVo> findAllFournisseur() {
        return fournisseurConverter.toVo(fournisseurService.findAllFournisseur());
    }

    public FournisseurService getFournisseurService() {
        return fournisseurService;
    }

    public void setFournisseurService(FournisseurService fournisseurService) {
        this.fournisseurService = fournisseurService;
    }

    public AbstractConverter<Fournisseur, FournisseurVo> getFournisseurConverter() {
        return fournisseurConverter;
    }

    public void setFournisseurConverter(AbstractConverter<Fournisseur, FournisseurVo> fournisseurConverter) {
        this.fournisseurConverter = fournisseurConverter;
    }
    
    
}
