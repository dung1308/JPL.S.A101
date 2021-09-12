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
public class Truck extends Car{
    public int weight;
    //public int speed;
    //public double regularPrice;
    //public String color;

    public Truck(int speed, double regularPrice, String color,int weight) {
        super(speed, regularPrice, color);
        this.weight = weight;
    }

    @Override
    double getSalePrice() {
        if(weight>2000){
            regularPrice= regularPrice*10/100;
        }else{
            regularPrice= regularPrice*20/100;
        }
        return regularPrice;
    }

    @Override
    public String toString() {
        return "Truck{" + "salesPrice: "+this.getSalePrice() + '}';
    }
    
}
