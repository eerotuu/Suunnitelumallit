/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.visitors;

import main.Car;
import main.states.CarDrifting;
import main.states.CarState;

/**
 *
 * @author Eero
 */
public class BonusVisitor implements CarVisitor {

    @Override
    public void visit(CarState state, Car c) {
        state.addBonus(c);
    }  
}
