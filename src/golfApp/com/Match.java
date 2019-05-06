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
    private Score[] scores;
    private User medalist;
    private String result;

    @Override
    public int calculateScores() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int compareScores() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
