/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.components;

/**
 *
 * @author Eero
 */
public class NIC extends AbstractComponent{
    
    public NIC(int aPrice) {
        super(aPrice);
    }
    
    @Override
    public String toString() {
        return "Network-Interface Controller - " + super.mPrice + "€";
    }
}
