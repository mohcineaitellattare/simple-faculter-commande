/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.simple.faculte.commande.model.service.impl;

import com.simple.faculte.commande.bean.Commande;
import com.simple.faculte.commande.bean.CommandeItem;
import com.simple.faculte.commande.bean.Fournisseur;
import com.simple.faculte.commande.model.dao.CommandeDao;
import com.simple.faculte.commande.model.service.CommandeItemService;
import com.simple.faculte.commande.model.service.CommandeService;
import com.simple.faculte.commande.model.service.FournisseurService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author mohcine
 */
@Service
public class CommandeServiceImpl implements CommandeService {

    @Autowired
    private CommandeDao commandeDao;
    @Autowired
    CommandeItemService commandeItemService;

    @Autowired
    FournisseurService fournisseurService;

    @Override
    public Commande saveCommande(Commande commande) {
        Fournisseur fournisseur = fournisseurService.findByReference(commande.getFournisseur().getReference());
        System.out.println("hhhhhhhhhhhh"+fournisseur.getLibelle());
        if (fournisseur == null) {
            return null;
        }
            calculerTotal(commande, commande.getCommandeItems());
            commande.setFournisseur(fournisseur);
            commandeDao.save(commande);
            commandeItemService.saveCommandeItems(commande, commande.getCommandeItems());
            return commande;
        
    }

    @Override
    public Commande findByReference(String reference) {
        return commandeDao.findByReference(reference);
    }

    private void calculerTotal(Commande commande, List<CommandeItem> commandeItems) {
        double total = 0;
        if (commandeItems != null || !commandeItems.isEmpty()) {
            for (CommandeItem commandeItem : commandeItems) {
                total = total + (commandeItem.getPrix() * commandeItem.getQte());
            }
        }
        commande.setTotal(total);
    }

    @Override
    public List<Commande> findAllCommande() {
        return commandeDao.findAll();
    }

    public CommandeItemService getCommandeItemService() {
        return commandeItemService;
    }

    public void setCommandeItemService(CommandeItemService commandeItemService) {
        this.commandeItemService = commandeItemService;
    }

    public CommandeDao getCommandeDao() {
        return commandeDao;
    }

    public void setCommandeDao(CommandeDao commandeDao) {
        this.commandeDao = commandeDao;
    }

    public FournisseurService getFournisseurService() {
        return fournisseurService;
    }

    public void setFournisseurService(FournisseurService fournisseurService) {
        this.fournisseurService = fournisseurService;
    }

}
