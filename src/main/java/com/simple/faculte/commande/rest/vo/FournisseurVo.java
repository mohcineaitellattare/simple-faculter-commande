/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.simple.faculte.commande.rest.vo;

import java.util.List;

/**
 *
 * @author mohcine
 */
public class FournisseurVo {
    
     private Long id;
    private String reference;
    private String libelle;
    private String raisonSocial;
    private List<CommandeVo> commandeVos;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getRaisonSocial() {
        return raisonSocial;
    }

    public void setRaisonSocial(String raisonSocial) {
        this.raisonSocial = raisonSocial;
    }

    public List<CommandeVo> getCommandeVos() {
        return commandeVos;
    }

    public void setCommandeVos(List<CommandeVo> commandeVos) {
        this.commandeVos = commandeVos;
    }
    
    
}
