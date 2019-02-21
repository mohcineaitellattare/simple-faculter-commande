/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.simple.faculte.commande.rest.proxy;

import org.springframework.cloud.openfeign.FeignClient;

/**
 *
 * @author mohcine
 */
@FeignClient(name = "sample-faculte-besoin",url = "localhost:8099")
public interface ExpressionBesoinProxy {
    
}
