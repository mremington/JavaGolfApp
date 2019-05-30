/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package golfApp.com;

/**
 *
 * @author michael.remington
 */
public class Course extends BasicInfo {

    private String teeBox;
    private int frontNinePar;
    private int backNinePar;
    private double mensSlope;
    private double mensRating;
    private double womansSlope;
    private double womansRating;

    public Course(String n, String ph, String add) {
        super(n, ph, add);
    }
    
    public Course(String n, String ph, String add, int f9par, int b9par, double ms, double mr, double ws, double wr) {
        super(n, ph, add);
        setFrontNinePar(f9par);
        setBackNinePar(b9par);
        setMensSlope(ms);
        setMensRating(mr);
        setWomansSlope(ws);
        setWomansRating(wr);
    }

    public String getTeeBox() {
        return teeBox;
    }

    public void setTeeBox(String teeBox) {
        this.teeBox = teeBox;
    }

    public int getFrontNinePar() {
        return frontNinePar;
    }

    public void setFrontNinePar(int frontNinePar) {
        this.frontNinePar = frontNinePar;
    }

    public int getBackNinePar() {
        return backNinePar;
    }

    public void setBackNinePar(int backNinePar) {
        this.backNinePar = backNinePar;
    }

    public double getMensSlope() {
        return mensSlope;
    }

    public void setMensSlope(double mensSlope) {
        this.mensSlope = mensSlope;
    }

    public double getMensRating() {
        return mensRating;
    }

    public void setMensRating(double mensRating) {
        this.mensRating = mensRating;
    }

    public double getWomansSlope() {
        return womansSlope;
    }

    public void setWomansSlope(double womansSlope) {
        this.womansSlope = womansSlope;
    }

    public double getWomansRating() {
        return womansRating;
    }

    public void setWomansRating(double womansRating) {
        this.womansRating = womansRating;
    }

    @Override
    public boolean displayInfo() {
        return true;
    }
}
