/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.simple.faculte.commande.rest;

import com.simple.faculte.commande.bean.Commande;
import com.simple.faculte.commande.model.service.CommandeService;
import com.simple.faculte.commande.rest.converter.AbstractConverter;
import com.simple.faculte.commande.rest.converter.CommandeConverter;
import com.simple.faculte.commande.rest.vo.CommandeVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author mohcine
 */
@RestController
@RequestMapping("/faculte-commande/commandes")
public class CommandeRest {
    @Autowired
    private CommandeService commandeService;
    @Autowired
    @Qualifier("commandeConverter")
    private AbstractConverter<Commande,CommandeVo> commandeConverter;
    
    @PostMapping("/")
    public CommandeVo saveCommande(@RequestBody CommandeVo commandeVo) {
        Commande myCommande=commandeConverter.toItem(commandeVo);
        Commande commande=commandeService.saveCommande(myCommande);
        return  commandeConverter.toVo(commande);
    } 
    @GetMapping("/reference/{reference}")
    public CommandeVo findByReference(@PathVariable String reference) {
        return new CommandeConverter().toVo(commandeService.findByReference(reference));
    }
    

    public CommandeService getCommandeService() {
        return commandeService;
    }

    public void setCommandeService(CommandeService commandeService) {
        this.commandeService = commandeService;
    }

    public AbstractConverter<Commande, CommandeVo> getCommandeConverter() {
        return commandeConverter;
    }

    public void setCommandeConverter(AbstractConverter<Commande, CommandeVo> commandeConverter) {
        this.commandeConverter = commandeConverter;
    }
    
}
