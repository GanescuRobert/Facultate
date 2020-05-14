/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ac.squareplugin;
import com.ac.plugins.Interfaces.IPluginsAppPlugin;
import com.ac.plugins.Interfaces.IShape;
/**
 *
 * @author catalin
 */
public class SquarePlugin implements IPluginsAppPlugin {

    @Override
    public String getUniqueNameText() {
        return "SquarePlugin";
    }

    @Override
    public String getDisplayText() {
        return "Square";
    }

    @Override
    public IShape getShape() {
        return new Square();
    }
    
}
