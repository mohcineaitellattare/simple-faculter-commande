/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.simple.faculte.commande.model.service.impl;

import com.simple.faculte.commande.bean.Fournisseur;
import com.simple.faculte.commande.model.dao.FournisseurDao;
import com.simple.faculte.commande.model.service.FournisseurService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author mohcine
 */
@Service
public class FourniseurServiceImpl implements FournisseurService {

    @Autowired
    private FournisseurDao fournisseurDao;

    @Override
    public Fournisseur findByReference(String reference) {
        return fournisseurDao.findByReference(reference);
    }

    public FournisseurDao getFournisseurDao() {
        return fournisseurDao;
    }

    public void setFournisseurDao(FournisseurDao fournisseurDao) {
        this.fournisseurDao = fournisseurDao;
    }

    @Override
    public List<Fournisseur> findAllFournisseur() {
        return fournisseurDao.findAll();
    }

}
