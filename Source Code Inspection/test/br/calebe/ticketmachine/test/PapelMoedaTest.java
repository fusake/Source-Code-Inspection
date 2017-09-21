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
    public void papelMoedaComValorNegativoTest() {
        PapelMoeda papel = new PapelMoeda();
        assertEquals(-5, papel.getValor(), 0.00001);
        
    }
    
    @Test
    public void papelMoedaComQuantidadeNegativa() {
        PapelMoeda papel = new PapelMoeda();
        assertEquals(-1, papel.getQuantidade(), 0.00001);
    }
    
    @Test
    public void papelMoedaComValorZerado() {
        PapelMoeda papel = new PapelMoeda();
        assertEquals(0, papel.getValor(), 0.0001);
    }
    
    @Test
    public void papelMoedaComQuantidadeZerada() {
        PapelMoeda papel = new PapelMoeda();
        assertEquals(0, papel.getQuantidade(), 0.0001);
    }
    
}
