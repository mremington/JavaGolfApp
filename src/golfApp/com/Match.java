/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package golfApp.com;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

/**
 *
 * @author michael.remington
 */
public class Match {

    private School homeTeam;
    private School awayTeam;
    private String matchType;
    private Course course;
    private Date date;
    private User[] homePlayers;
    private Score[] homeScores;
    private User[] awayPlayers;
    private Score[] awayScores;
    private User medalist;
    private String result;

    public Match(School h, School a, String type, Course c, Date d, User[] hplayers, Score[] hscores, User[] aplayers, Score[] ascores) {
        setHomeTeam(h);
        setAwayTeam(a);
        setMatchType(type);
        setCourse(c);
        setDate(d);
        setHomePlayers(hplayers);
        setHomeScores(hscores);
        setAwayPlayers(aplayers);
        setAwayScores(ascores);

        medalist = getHomePlayers()[3];
        int bestScore = getHomeScores()[3].getStrokes();
        for (User p : getHomePlayers()) {
            for (Score s : getHomeScores()) {
                if (p.equals(s.getPlayer()) && s.getStrokes() < bestScore) {
                    bestScore = s.getStrokes();
                    medalist = p;
                }
            }
        }
        for (User p : getAwayPlayers()) {
            for (Score s : getAwayScores()) {
                if (p.equals(s.getPlayer()) && s.getStrokes() < bestScore) {
                    bestScore = s.getStrokes();
                    medalist = p;
                }
            }
        }

        compareScores().getName();

    }

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

    public String getMatchType() {
        return matchType;
    }

    public void setMatchType(String matchType) {
        this.matchType = matchType;
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
        this.result = "The winner of the match is: " + result;
    }

    public School compareScores() {

        int homeScore = 0;
        int awayScore = 0;

        for (Score s : getHomeScores()) {
            homeScore += s.getStrokes();
        }

        for (Score s : getAwayScores()) {
            awayScore += s.getStrokes();
        }

        if (homeScore < awayScore) {
            setResult(homeTeam.getName() + " with a score of " + homeScore + " to " + awayScore);
            return homeTeam;
        } else {
            setResult(awayTeam.getName() + " with a score of " + awayScore + " to " + homeScore);
            return awayTeam;
        }

    }

    /**
     * @return the homePlayers
     */
    public User[] getHomePlayers() {
        return homePlayers;
    }

    /**
     * @param homePlayers the homePlayers to set
     */
    public void setHomePlayers(User[] homePlayers) {
        this.homePlayers = homePlayers;
    }

    /**
     * @return the homeScores
     */
    public Score[] getHomeScores() {
        return homeScores;
    }

    /**
     * @param homeScores the homeScores to set
     */
    public void setHomeScores(Score[] homeScores) {
        this.homeScores = homeScores;
    }

    /**
     * @return the awayPlayers
     */
    public User[] getAwayPlayers() {
        return awayPlayers;
    }

    /**
     * @param awayPlayers the awayPlayers to set
     */
    public void setAwayPlayers(User[] awayPlayers) {
        this.awayPlayers = awayPlayers;
    }

    /**
     * @return the awayScores
     */
    public Score[] getAwayScores() {
        return awayScores;
    }

    /**
     * @param awayScores the awayScores to set
     */
    public void setAwayScores(Score[] awayScores) {
        this.awayScores = awayScores;
    }
}
