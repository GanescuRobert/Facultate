/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ac.menu;

import com.ac.Board.Board;
import com.ac.plugins.Interfaces.IPluginsAppPlugin;
import com.ac.plugins.Interfaces.IShape;
import com.ac.plugins.PluginManager;
import java.util.ArrayList;
import java.util.Scanner;

/**2
 *
 * @author catalin
 */
public class ApplicationMenu{
    
    private PluginManager pluginMan;
    private Menu mainM = null;
    private Menu shapeM = null;
    private Board board = null;
   
    public ApplicationMenu(PluginManager pluginMan, Board board)
    {
        this.pluginMan = pluginMan;        
        this.board = board;
    }
    
    private void loadMain(){
        ArrayList<IMenuItem> mainItems = new ArrayList();
      
        mainItems.add(new MenuItem("New Shape",1,(parameters)->{
                    shapeM.execute();      
                    }));     
        mainItems.add(new MenuItem("Remove Shape",2,(parameters)->{
                      board.removeShape();
                    }));
        mainItems.add(new MenuItem("Show board",3,(parameters)->{
                      board.printShapes();
                    }));
        mainM = new Menu("Main", -1, mainItems);
    }
    
    public void load()
    {
        pluginMan.loadPlugins("/plugins");
        ArrayList<IMenuItem> menuItems = new ArrayList();
        
        int shortCut = 1;
        var plugins = pluginMan.getPlugins();
        
        for (int i = 0 ; i < plugins.size(); i++)
        {      
           var currentPlugin = plugins.get(i); 
           MenuItem currentItem = new MenuItem(plugins.get(i).getDisplayText(), shortCut++, (parameters)->{
               IShape shape = currentPlugin.getShape();
               board.addShape(shape);
           });
           menuItems.add(currentItem);
       
        }
       shapeM=new Menu("Add new shape",1,menuItems);
       this.loadMain();
     
      
       
    }
    
    public void execute()
    {
        mainM.execute();
    }
    
}
