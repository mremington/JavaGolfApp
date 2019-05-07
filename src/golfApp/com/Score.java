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
public class Score {
    private User player;
    private Course course;
    private int strokes;
    private double index;
    
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
	}
	public double getIndex() {
		return index;
	}
	public void setIndex(double index) {
		this.index = index;
	}
    
    
}
