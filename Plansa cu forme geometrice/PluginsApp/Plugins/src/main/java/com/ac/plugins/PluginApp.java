/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ac.plugins;

import com.ac.Board.Board;
import com.ac.menu.ApplicationMenu;
import com.ac.plugins.Interfaces.IShape;

/**
 *
 * @author catalin
 */
public class PluginApp {
    
    public static void main(String[] args)
    {
        PluginManager pluginMan = new PluginManager();
        Board board = new Board();
        
        ApplicationMenu menu = new ApplicationMenu(pluginMan, board);
        
        menu.load();
        menu.execute();        
    }
    
}
