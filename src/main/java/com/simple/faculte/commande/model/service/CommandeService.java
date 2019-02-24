/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.simple.faculte.commande.model.service;

import com.simple.faculte.commande.bean.Commande;
import java.util.List;

/**
 *
 * @author mohcine
 */
public interface CommandeService {
    
    public Commande saveCommande(Commande commande);
    public Commande findByReference(String reference);
    public List<Commande> findAll();

}
