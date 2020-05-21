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
    private Point further=new Point(0,0);
    Scanner sc = new Scanner(System.in);
    
    public void updateFutherBoard(IShape tempSh){      
       var a = tempSh.getFurtherPoint();
        further.x=Math.max(further.x,tempSh.getFurtherPoint().x);
        further.y=Math.max(further.y,tempSh.getFurtherPoint().y);  
    }
    
    public void addShape(IShape tempShape){
        tempShape.read();
        tempShape.calculateAP();//area and perimeter
        updateFutherBoard(tempShape);
        shapes.add(tempShape);
        System.out.print("\n**********************************\n");
        System.out.print("The shape you just added:\n");
        System.out.print("Further point of board x= "+ further.x+ " y= "+ further.y+ "\n");
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
     public void editShape(){
        if(!shapes.isEmpty()){
            int index;
            this.printShapes();
            System.out.print("Enter index shape you want to edit: ");
            System.out.print("Index= ");  index= sc.nextInt();
            shapes.get(index).read();
        }
    }
    
}
