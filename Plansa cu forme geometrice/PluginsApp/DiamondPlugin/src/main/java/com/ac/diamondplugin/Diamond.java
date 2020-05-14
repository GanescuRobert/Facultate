/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ac.diamondplugin;

import com.ac.plugins.Interfaces.IShape;
import java.awt.Point;
import java.util.Scanner;

/**
 *
 * @author catalin
 */
public class Diamond implements IShape {
    String name="Diamond";
    double area;
    double perimeter;
    Point center;
    double bigDiagonal;
    double smallDiagonal;
    
    Scanner sc = new Scanner(System.in);
        
    @Override
    public void draw() {
        System.out.println("This is a Diamond");
    }

    @Override
    public void read() {
       int x,y;
       System.out.println("Read diamond");
       System.out.print("\nEnter center coordoante: ");
       System.out.print("\nX= "); x = sc.nextInt();
       System.out.print("\nY= "); y = sc.nextInt();
       System.out.print("\nEnter the big diagonal: ");
       System.out.print("\nBig diagonal= "); bigDiagonal = sc.nextDouble();
       System.out.print("\nEnter the small diagonal: ");
       System.out.print("\nSmall diagonal= "); smallDiagonal = sc.nextDouble();
       center= new Point(x,y);
    }
    
    @Override
    public void printDetails(){
        System.out.print("****************************\n");
        System.out.println("Name: "+ name);
        System.out.println("Area: "+ area);
        System.out.println("Perimeter: "+ perimeter);
        System.out.println("Center:\tx= "+ center.x+ "\ty= "+ center.y);
        System.out.println("Big diagonal: "+ bigDiagonal);
        System.out.println("Small diagonal: "+ smallDiagonal);
        System.out.print("****************************\n");
    }
    public double calculateArea(){
       
        return (bigDiagonal * smallDiagonal)/2;
    }
      
    public double calculatePerimeter(){
       return Math.sqrt(Math.pow(smallDiagonal/2,2)*Math.pow(bigDiagonal/2,2));   
    }
     
    @Override
    public void calculateAP(){
       area=calculateArea();
       perimeter=calculatePerimeter();
    }
    
}
