/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import java.util.ArrayList;

/**
 *
 * @author Rick Wosyka
 */
public class Roll {
    
    private ArrayList<Die> dice;
    private int modifier;
    
    public Roll(){
        dice = new ArrayList<>();
    }
    
    public void addDice(int count, int sides) {
        for (int i = 0; i < count; i++) {
            Die die = new Die(sides);
            dice.add(die);
        }
    }
    
    public void setModifier(int mod) {
        this.modifier = mod;
    }
    
    public int rollAll() {
        int result = modifier;
        for (Die die : dice) {
            result = result + die.roll();
        }
        return result;
    }
    
    public double getAverage() {
        double average = modifier;
        for (Die die : dice) {
            average = average + die.getAverage();
        }
        return average;
    }
    
    public int getMinimum() {
        return dice.size() + modifier;
    }
    
    public int getMaximum() {
        int max = modifier;
        for (Die die : dice) {
            max = max + die.getSides();
        }
        return max;
    }
    
}
