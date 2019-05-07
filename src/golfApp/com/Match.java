/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package golfApp.com;

import java.util.Date;

/**
 *
 * @author michael.remington
 */
public class Match implements Calculatable{
    private School homeTeam;
    private School awayTeam;
    private String[] matchTypes;
    private Course course;
    private Date date;
    private User[] players;
    private Score[] scores;
    private User medalist;
    private String result;
    
    

    public School getHomeTeam() {
		return homeTeam;
	}

	public void setHomeTeam(School homeTeam) {
		this.homeTeam = homeTeam;
	}

	public School getAwayTeam() {
		return awayTeam;
	}

	public void setAwayTeam(School awayTeam) {
		this.awayTeam = awayTeam;
	}

	public String[] getMatchTypes() {
		return matchTypes;
	}

	public void setMatchTypes(String[] matchTypes) {
		this.matchTypes = matchTypes;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public User[] getPlayers() {
		return players;
	}

	public void setPlayers(User[] players) {
		this.players = players;
	}

	public Score[] getScores() {
		return scores;
	}

	public void setScores(Score[] scores) {
		this.scores = scores;
	}

	public User getMedalist() {
		return medalist;
	}

	public void setMedalist(User medalist) {
		this.medalist = medalist;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	@Override
    public int calculateScores() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int compareScores() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
