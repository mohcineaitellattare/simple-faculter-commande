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
public class CommandeVo {
     private Long id;
    private String reference;
    private String total;
    private String totalPaiement;
    private String dateCommande;
    private FournisseurVo fournisseurVo;
    private List<CommandeItemVo> commandeItemVos;
    private List<PaiementVo> paiementVos;

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

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getTotalPaiement() {
        return totalPaiement;
    }

    public void setTotalPaiement(String totalPaiement) {
        this.totalPaiement = totalPaiement;
    }

    public String getDateCommande() {
        return dateCommande;
    }

    public void setDateCommande(String dateCommande) {
        this.dateCommande = dateCommande;
    }

    public FournisseurVo getFournisseurVo() {
        return fournisseurVo;
    }

    public void setFournisseurVo(FournisseurVo fournisseurVo) {
        this.fournisseurVo = fournisseurVo;
    }
    
    public List<CommandeItemVo> getCommandeItemVos() {
        return commandeItemVos;
    }

    public void setCommandeItemVos(List<CommandeItemVo> commandeItemVos) {
        this.commandeItemVos = commandeItemVos;
    }

    public List<PaiementVo> getPaiementVos() {
        return paiementVos;
    }

    public void setPaiementVos(List<PaiementVo> paiementVos) {
        this.paiementVos = paiementVos;
    }

    

   
   
    
    
}
