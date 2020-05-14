/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ac.rectangleplugin;

import com.ac.plugins.Interfaces.IShape;
import java.awt.Point;
import java.util.Scanner;

/**
 *
 * @author catalin
 */
public class Rectangle implements IShape {

    String name="Rectangle";
    double area;
    double perimeter;
    Point center;
    double bigSide;
    double smallSide;
    
    Scanner sc = new Scanner(System.in);
    
   
    @Override
    public void draw() {
        System.out.println("This is a Rectangle");
    }

    @Override
    public void read() {
       int x,y;
       System.out.println("Read rectangle");
       System.out.print("\nEnter center coordoante: ");
       System.out.print("\nX= "); x = sc.nextInt();
       System.out.print("\nY= "); y = sc.nextInt();
       System.out.print("\nEnter the big Side: ");
       System.out.print("\nBig Side= "); bigSide = sc.nextDouble();
       System.out.print("\nEnter the small Side: ");
       System.out.print("\nSmall Side= "); smallSide = sc.nextDouble();
       center= new Point(x,y);
    }
    
    @Override
    public void printDetails(){
        System.out.print("****************************\n");
        System.out.println("Name: "+ name);
        System.out.println("Area: "+ area);
        System.out.println("Perimeter: "+ perimeter);
        System.out.println("Center:\tx= "+ center.x+ "\ty= "+ center.y);
        System.out.println("Big Side: "+ bigSide);
        System.out.println("Small Side: "+ smallSide);
        System.out.print("****************************\n");
    }
    public double calculateArea(){
       
        return (bigSide* smallSide);
    }
      
    public double calculatePerimeter(){
       return 2*(smallSide+ bigSide);
    }
     
    @Override
    public void calculateAP(){
       area=calculateArea();
       perimeter=calculatePerimeter();
    }
}
