/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fa.training.entities;

/**
 *
 * @author ASUS
 */
public class Sedan extends Car{
    public int length;

    public Sedan(int speed, double regularPrice, String color, int length) {
        super(speed, regularPrice, color);
        this.length = length;
    }

    @Override
    double getSalePrice() {
        if(length>20){
            regularPrice =regularPrice*5/100;
        }else{
            regularPrice =regularPrice*10/100;
        }
        return regularPrice;
    }

    @Override
    public String toString() {
        return "Sedan{" + "salesPrice: "+this.getSalePrice() + '}';
    }
    
}
