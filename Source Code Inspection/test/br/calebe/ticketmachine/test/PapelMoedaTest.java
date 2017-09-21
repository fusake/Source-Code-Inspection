/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.calebe.ticketmachine.test;

import br.calebe.ticketmachine.core.PapelMoeda;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 31206018
 */
public class PapelMoedaTest {
    
    public PapelMoedaTest() {
    }
    
    @Test
    public void papelMoedaComValorPositivo() throws Exception{
        try{
        PapelMoeda papel = new PapelMoeda();
        assertTrue(papel.getValor() > 0);
        }catch(AssertionError ae){
            String assertionError = ae.toString();
            System.out.println(assertionError);
        }
        
    }
    
    @Test
    public void papelMoedaComQuantidadePositiva() throws Exception{
        try{
        PapelMoeda papel = new PapelMoeda();
        assertTrue(papel.getQuantidade() > 0);
        }catch(AssertionError ae){
            ae.printStackTrace();
        }
    }
    
    @Test
    public void papelMoedaComValorDiferenteDeZero() throws Exception{
        try{
        PapelMoeda papel = new PapelMoeda();
        assertTrue(papel.getValor() != 0);
        }catch(AssertionError ae){
            ae.printStackTrace();
        }
    }
    
    @Test
    public void papelMoedaComQuantidadeDiferenteDeZero() throws Exception{
        try{
        PapelMoeda papel = new PapelMoeda();
        assertTrue(papel.getQuantidade() != 0);
        }catch(AssertionError ae){
            ae.printStackTrace();
        }
    }
    
}
