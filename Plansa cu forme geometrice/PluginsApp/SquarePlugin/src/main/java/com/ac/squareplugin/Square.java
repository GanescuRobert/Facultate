/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ac.squareplugin;

import com.ac.plugins.Interfaces.IShape;
import java.awt.Point;
import java.util.Scanner;

/**
 *
 * @author catalin
 */
public class Square implements IShape {

    String name="Square";
    double area;
    double perimeter;
    Point center=new Point();
    int side;

    Scanner sc = new Scanner(System.in);
    
    @Override
    public void draw() {
        System.out.println("This is a Square");
    }

    @Override
    public void read() {
      
       System.out.println("Read square");
       System.out.print("\nEnter center coordoante:");
       System.out.print("\nX= "); center.x = sc.nextInt();
       System.out.print("\nY= "); center.y = sc.nextInt();
       System.out.print("\nEnter the side: ");
       System.out.print("\nSide= "); side = sc.nextInt();
       
    }
   
    @Override
    public void printDetails(){
        System.out.print("****************************\n");
        System.out.println("Name: "+ name);
        System.out.println("Area: "+ area);
        System.out.println("Perimeter: "+ perimeter);
        System.out.println("Center:\tx= "+ center.x+ "\ty= "+ center.y);
        System.out.println("Side: "+ side);
        System.out.print("****************************\n");
    }
    public double calculateArea(){
       
        return side*side;
    }
      
    public double calculatePerimeter(){
       return 4*side; 
    }
     
    @Override
    public void calculateAP(){
       area=calculateArea();
       perimeter=calculatePerimeter();
    }   
    @Override
    public Point getFurtherPoint(){
        return new Point((int)(center.x+side/2),(int)(center.y +side/2));
    }
}
