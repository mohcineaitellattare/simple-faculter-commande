/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.simple.faculte.commande.model.dao;

import com.simple.faculte.commande.bean.Paiement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author mohcine
 */
@Repository
public interface PaiementDao extends JpaRepository<Paiement, Long>{
    
}
