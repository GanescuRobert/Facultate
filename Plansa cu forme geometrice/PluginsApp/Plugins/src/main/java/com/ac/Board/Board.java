package com.ac.Board;

import com.ac.plugins.Interfaces.IShape;
import java.awt.Point;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author robyb
 */
public class Board {
    private  ArrayList<IShape> shapes = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    
    public void addShape(IShape tempShape){
        tempShape.read();
        tempShape.calculateAP();//area and perimeter
        shapes.add(tempShape);
        
        System.out.print("The shape you just added:\n");
        tempShape.printDetails();
    }
   
    public void removeShape(){
        if(shapes.isEmpty()){
            System.out.print("*****************\n");
            System.out.print("Board is empty\n");
            System.out.print("*****************\n");
        }
        else{
            int index;
            this.printShapes();
            System.out.print("Enter index shape you want to remove: ");
            System.out.print("Index= "); index= sc.nextInt();
            shapes.remove(index);
        }
    }    
    public void printShapes(){
        if(shapes.isEmpty()){
            System.out.print("*****************\n");
            System.out.print("Board is empty\n");
            System.out.print("*****************\n");
        }
        else{
            String textIndex="Index ";
            int index=0;
            for(var tempShape: shapes){
                System.out.print("\n"+textIndex + index++ + "\n");
                
                tempShape.printDetails();
            }
        }
    }
}
