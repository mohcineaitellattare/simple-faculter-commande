/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.simple.faculte.commande.model.service;

import com.simple.faculte.commande.bean.Commande;
import com.simple.faculte.commande.bean.CommandeItem;
import java.util.List;

/**
 *
 * @author mohcine
 */
public interface CommandeItemService {
    
    public int saveCommandeItems(Commande commande,List<CommandeItem> commandeItems);
    public List<CommandeItem> findByCommande(Commande commande);

}
