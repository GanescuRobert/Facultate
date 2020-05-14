/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ac.circleplugin;

import com.ac.plugins.Interfaces.IShape;
import java.awt.Point;
import java.util.Scanner;

/**
 *
 * @author catalin
 */

public class Circle implements IShape {
    String name="Circle";
    double area;
    double perimeter;
    Point center;
    double radius;
    
    Scanner sc = new Scanner(System.in);
     
    
    @Override
    public void draw() {
        System.out.println("This is a circle");
    }

    @Override
    public void read() {
       int x,y;
       System.out.println("Read circle");
       System.out.print("\nEnter center coordoante: ");
       System.out.print("\nX= "); x= sc.nextInt();
       System.out.print("\nY= "); y= sc.nextInt();
       System.out.print("\nEnter the radius: ");
       System.out.print("\nRadius= "); radius = sc.nextDouble();
       center= new Point(x,y);
    }
    
    @Override
    public void printDetails(){
        System.out.print("****************************\n");
        System.out.println("Name: "+ name);
        System.out.println("Area: "+ area);
        System.out.println("Perimeter: "+ perimeter);
        System.out.println("Center:\tx= "+ center.x+ "\ty= "+ center.y);
        System.out.println("Radius: "+ radius);
        System.out.print("****************************\n");
    }
    public double calculateArea(){
       
        return Math.PI * (radius * radius);
    }
      
    public double calculatePerimeter(){
        return 2 * Math.PI * radius;
    }
     
    @Override
    public void calculateAP(){
       area=calculateArea();
       perimeter=calculatePerimeter();
    }
}
