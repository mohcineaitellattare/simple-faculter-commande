/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.simple.faculte.commande.rest.converter;

import com.simple.faculte.commande.bean.Paiement;
import com.simple.faculte.commande.common.util.DateUtil;
import com.simple.faculte.commande.common.util.NumberUtil;
import com.simple.faculte.commande.rest.vo.PaiementVo;
import org.springframework.stereotype.Component;

/**
 *
 * @author mohcine
 */
@Component
public class PaiementConverter extends AbstractConverter<Paiement, PaiementVo>{

    @Override
    public Paiement toItem(PaiementVo vo) {
         if (vo==null) {
            return null;
        }else{
             Paiement item=new Paiement();
             item.setId(vo.getId());
             item.setType(vo.getType());
             item.setMontant(NumberUtil.toDecimal(vo.getMontant()));
             item.setCommande(new CommandeConverter().toItem(vo.getCommandeVo()));
             item.setDatePaiement(DateUtil.parse(vo.getDatePaiement()));
             return item;
         }
    }

    @Override
    public PaiementVo toVo(Paiement item) {
        if (item==null) {
             return null;
        }else{
           PaiementVo vo=new PaiementVo();
           vo.setId(item.getId());
           vo.setType(item.getType());
           vo.setMontant(NumberUtil.toString(item.getMontant()));
           vo.setCommandeVo(new CommandeConverter().toVo(item.getCommande()));
           vo.setDatePaiement(DateUtil.formateDate(item.getDatePaiement()));
           return vo;
        }
    }

    
    
}
