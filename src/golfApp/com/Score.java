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
public class Score implements Comparable {

    private User player;
    private Course course;
    private int strokes;
    private double index;

    public Score(User p, Course c, int s){
        setPlayer(p);
        setCourse(c);
        setStrokes(s);
        setIndex(getStrokes());
    }
   
    public User getPlayer() {
        return player;
    }

    public void setPlayer(User player) {
        this.player = player;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public int getStrokes() {
        return strokes;
    }

    public void setStrokes(int strokes) {
        this.strokes = strokes;
        setIndex(getStrokes());
    }

    public double getIndex() {
        return index;
    }

    public void setIndex(int strokes) {
        if(player.getGender().equals("male"))
            index = (strokes - course.getMensRating())  * 113/course.getMensSlope();
        else 
            index = (strokes - course.getWomansRating())  * 113/course.getWomansSlope();
    }
    
    public String toString(){
        return getStrokes() + " index: " + String.format("%.2f", getIndex());
    }

    @Override
    public int compareTo(Object o) {
       Score s = (Score)o;
       if(this.getIndex()<s.getIndex())
           return -1;
       else if(this.getIndex()>s.getIndex())
           return 1;
       
       return 0;
    }

}
