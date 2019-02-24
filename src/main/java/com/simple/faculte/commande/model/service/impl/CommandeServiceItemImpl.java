/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.simple.faculte.commande.model.service.impl;

import com.simple.faculte.commande.bean.Commande;
import com.simple.faculte.commande.bean.CommandeItem;
import com.simple.faculte.commande.model.dao.CommandeItemDao;
import com.simple.faculte.commande.model.service.CommandeItemService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author mohcine
 */
@Service
public class CommandeServiceItemImpl implements CommandeItemService{
    @Autowired
    private CommandeItemDao commandeItemDao;
    @Override
    public int saveCommandeItems(Commande commande, List<CommandeItem> commandeItems) {
         if (commandeItems==null || commandeItems.isEmpty()) {
            return -1;
        }else{
             for (CommandeItem commandeItem : commandeItems) {
                 commandeItem.setCommande(commande);
                 commandeItemDao.save(commandeItem);
             }
             return 1;
         }
    }

    @Override
    public List<CommandeItem> findByCommandeReference(String reference) {
        return commandeItemDao.findByCommandeReference(reference);
    }

    public CommandeItemDao getCommandeItemDao() {
        return commandeItemDao;
    }

    public void setCommandeItemDao(CommandeItemDao commandeItemDao) {
        this.commandeItemDao = commandeItemDao;
    }
    
    
}
