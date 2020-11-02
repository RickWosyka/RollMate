/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import java.util.Random;

/**
 *
 * @author Rick Wosyka
 */
public class Die {
    
    private final int sides;
    
    public Die(int sides) {
        this.sides = sides;
    }
    
    public int roll() {
        Random rn = new Random(System.currentTimeMillis());
        int result = rn.nextInt(sides - 1) + 1;
        return result;
    }
    
    public double getAverage() {
        return (1 + sides) / 2;
    }
    
    public int getSides() {
        return this.sides;
    }
}
