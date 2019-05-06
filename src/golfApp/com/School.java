/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package golfApp.com;

import java.awt.Color;
import java.io.File;

/**
 *
 * @author michael.remington
 */
public class School extends BasicInfo {
    
    private String mascotName;
    private File mascotImage;
    private Color mainColor;
    private Color secondaryColor;
    private String Division;
    private League league;

    @Override
    public String displayInfo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
