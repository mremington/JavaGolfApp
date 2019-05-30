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
public class School extends BasicInfo implements Comparable {

    private String mascotName;
    private File mascotImage;
    private Color mainColor;
    private Color secondaryColor;
    private String Division;
    private League league;
    
    public School(){
        super("","","");
    }

    public School(String n, String ph, String add) {
        super(n, ph, add);
    }

    @Override
    public boolean displayInfo() {
        return true;
    }

    /**
     * @return the mascotName
     */
    public String getMascotName() {
        return mascotName;
    }

    /**
     * @param mascotName the mascotName to set
     */
    public void setMascotName(String mascotName) {
        this.mascotName = mascotName;
    }

    /**
     * @return the mascotImage
     */
    public File getMascotImage() {
        return mascotImage;
    }

    /**
     * @param mascotImage the mascotImage to set
     */
    public void setMascotImage(File mascotImage) {
        this.mascotImage = mascotImage;
    }

    /**
     * @return the mainColor
     */
    public Color getMainColor() {
        return mainColor;
    }

    /**
     * @param mainColor the mainColor to set
     */
    public void setMainColor(Color mainColor) {
        this.mainColor = mainColor;
    }

    /**
     * @return the secondaryColor
     */
    public Color getSecondaryColor() {
        return secondaryColor;
    }

    /**
     * @param secondaryColor the secondaryColor to set
     */
    public void setSecondaryColor(Color secondaryColor) {
        this.secondaryColor = secondaryColor;
    }

    /**
     * @return the Division
     */
    public String getDivision() {
        return Division;
    }

    /**
     * @param Division the Division to set
     */
    public void setDivision(String Division) {
        this.Division = Division;
    }

    /**
     * @return the league
     */
    public League getLeague() {
        return league;
    }

    /**
     * @param league the league to set
     */
    public void setLeague(League league) {
        this.league = league;
    }
    
    public String toString(){
        return getName() +" "+ getPhone() +" "+ getAddress();
    }

    @Override
    public int compareTo(Object o) {
        School s = (School)o;
       if(this.getName().compareTo(s.getName())<0)
           return -1;
       if(this.getName().compareTo(s.getName())>0)
           return 1;
       
       return 0;
    }
}
