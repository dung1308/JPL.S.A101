/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fa.training.main;

import fa.training.entities.Ford;
import fa.training.entities.Sedan;
import fa.training.entities.Truck;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class MyOwnAutoShop {


    //int speed = 20;
    //double regularPrice =2000;
    //String color = "Blue";
    //int year = 20;
    //int manufacturerDiscount = 2000;
    //int length=10;
    //int weight=20;
    

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Ford> listFord = new ArrayList();
        ArrayList<Sedan> listSedan = new ArrayList();
        ArrayList<Truck> listTruck = new ArrayList();
        System.out.println("Speed:");
        int speed = sc.nextInt();
        System.out.println("regularPrice:");
        double regularPrice = sc.nextDouble();
        System.out.println("Color:");
        String color = sc.next();
        int choice;
        do{
            System.out.println("Choose type of car");
            System.out.println("1.Ford");
            System.out.println("2.Sedan");
            System.out.println("3.Truck");
            choice = sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Year:");
                    int year = sc.nextInt();
                    System.out.println("manufacturerDiscount:");
                    int manufacturerDiscount = sc.nextInt();
                    Ford ford = new Ford(speed,regularPrice,color,year,manufacturerDiscount);
                    listFord.add(ford);
                    break;
                case 2:
                    System.out.println("Length:");
                    int length = sc.nextInt();
                    Sedan sedan = new Sedan(speed,regularPrice,color,length);
                    listSedan.add(sedan);
                    break;
                case 3:
                    System.out.println("Weight");
                    int weight = sc.nextInt();
                    Truck truck = new Truck(speed,regularPrice,color,weight);
                    listTruck.add(truck);
                    break;
                default:
                    for(Ford x:listFord){
                        System.out.println(x);
                    }
                    for(Sedan y :listSedan){
                        System.out.println(y);
                    }
                    for(Truck z : listTruck){
                        System.out.println(z);
                    }
                    break;
            }
        }while(choice<=3);
    }
}
