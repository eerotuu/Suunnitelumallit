/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.visitors;

import main.Car;
import main.states.CarState;

/**
 *
 * @author Eero
 */
public interface CarVisitor {
    public void visit(CarState state, Car c);
}
