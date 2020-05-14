/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ac.circleplugin;
import com.ac.plugins.Interfaces.IPluginsAppPlugin;
import com.ac.plugins.Interfaces.IShape;
/**
 *
 * @author catalin
 */
public class CirclePlugin implements IPluginsAppPlugin {

    @Override
    public String getUniqueNameText() {
        return "CirclePlugin";
    }

    @Override
    public String getDisplayText() {
        return "Circle";
    }

    @Override
    public IShape getShape() {
        return new Circle();
    }
    
}
