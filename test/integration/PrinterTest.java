/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integration;

import model.Reciept;

import org.junit.Test;


/**
 *
 * @author Aldin
 */
public class PrinterTest {
    

    /**
     * Test of printReciept method, of class Printer.
     */
    @Test
    public void testPrintReciept() {
        System.out.println("printReciept");
        int cost = 150;
        Printer instance = new Printer();
        instance.printReciept(cost);
        
    }
    
}
