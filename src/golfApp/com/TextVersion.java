/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package golfApp.com;

import java.util.Arrays;
import java.util.Date;

/**
 *
 * @author michael.remington
 */
public class TextVersion {

    public static void main(String[] args) {

        School school = new School("defaultSchool", "defaultPH", "defaultAddress");

        User player = new User("playerName", "dfPhone", "dfAddress", "player", "playerUn", "playerPw", "playerEmail", school, "male");

        Course course = new Course("defaultName", "defaultPH", "defaultAddress", 36, 36, 122, 35.7, 133, 38.9);

        Score score = new Score(player, course, 40);

        //test one player output
        System.out.println("Default Player Test: " + player.displayInfo() + " had a score of " + score);
        System.out.println("\n\n");

        //test team output
        System.out.println("**************Default Team Test ************");

        User[] team = new User[6];
        Score[] scores = new Score[6];
        for (int i = 0; i < team.length; i++) {
            team[i] = new User("player" + i, "#", "#", "player", "un", "pw", "email", school, "male");
            scores[i] = new Score(team[i], course, 36 + i);
        }

        for (User p : team) {
            for (Score s : scores) {
                if (p.equals(s.getPlayer())) {
                    System.out.println(p.displayInfo() + " had a score of " + s);
                }
            }
        }

        //test match output
        School home = new School("CCA", "#", "#");
        School away = new School("TP", "#", "#");

        User[] homeTeam = new User[6];
        Score[] homeScores = new Score[6];
        for (int i = 0; i < homeScores.length; i++) {
            homeTeam[i] = new User("player" + i, "#", "#", "player", "un", "pw", "email", home, "male");
            homeScores[i] = new Score(homeTeam[i], course, 36 + i);
        }

        User[] awayTeam = new User[6];
        Score[] awayScores = new Score[6];
        for (int i = 0; i < awayScores.length; i++) {
            awayTeam[i] = new User("player" + i, "#", "#", "player", "un", "pw", "email", away, "male");
            awayScores[i] = new Score(awayTeam[i], course, 37 + i);
        }

        Match testMatch = new Match(home, away, "League", course, new Date(), homeTeam, homeScores, awayTeam, awayScores);
        System.out.println("\n\n");

        //test team output
        System.out.println("**************Default Match Test ************");
        System.out.println("Home Team: " + home.getName());
        for (User p : homeTeam) {
            for (Score s : homeScores) {
                if (p.equals(s.getPlayer())) {
                    System.out.println(p.displayInfo() + " had a score of " + s);
                }
            }
        }
        System.out.println("Away Team: " + away.getName());
        for (User p : awayTeam) {
            for (Score s : awayScores) {
                if (p.equals(s.getPlayer())) {
                    System.out.println(p.displayInfo() + " had a score of " + s);
                }
            }
        }

        System.out.println(testMatch.getResult());
        System.out.println("The Medalist for the Match: " + testMatch.getMedalist().getName());

        //team rank
        homeScores[3].setStrokes(32);
        Arrays.sort(homeScores);
        System.out.println(Arrays.toString(homeScores));
        double homeTeamIndex = 0;
        double homeTeamIndexSum = 0;
        for (int i = 0; i < 5; i++) {
            homeTeamIndexSum += homeScores[i].getIndex();
        }
        homeTeamIndex = homeTeamIndexSum / 5;
        System.out.println("Home Team Index: " + String.format("%.2f", homeTeamIndex));

        Arrays.sort(awayScores);
        double awayTeamIndex = 0;
        double awayTeamIndexSum = 0;
        for (int i = 0; i < 5; i++) {
            awayTeamIndexSum += awayScores[i].getIndex();
        }
        awayTeamIndex = awayTeamIndexSum / 5;
        System.out.println("Away Team Index: " + String.format("%.2f", awayTeamIndex));
        
        //individual rank
        Score[] allScores = new Score[homeScores.length+awayScores.length];
        int counter = 0;
        for(Score s:homeScores){
            allScores[counter] = s;
            counter++;
        }
        for(Score s:awayScores){
            allScores[counter] = s;
            counter++;
        }
        Arrays.sort(allScores);
        int rank = 1;
        for(Score s:allScores){
            System.out.println(rank +") "+ s.getPlayer().getSchoolID().getName() +" "+ s.getPlayer().getName() +" "+ String.format("%.2f",s.getIndex()));
            rank++;
        }

    }

}
