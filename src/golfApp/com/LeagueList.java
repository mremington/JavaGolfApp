/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package golfApp.com;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author michael.remington
 */
public class LeagueList implements CRUD {

    private ArrayList<League> leagues = new ArrayList<League>();
    private String fileContent;
    private ArrayList<User> users = new ArrayList<User>();
    private User leagueRep = new User();

    //load data from the school.dat file and fill the schools arraylist
    public LeagueList() throws FileNotFoundException {
        Scanner reader = new Scanner(new File("src/golfApp/com/leagues.dat"));
        Scanner line = new Scanner("");
        while (reader.hasNext()) {
            String str = reader.nextLine();
            line = new Scanner(str);
            leagues.add(new League(line.next(), line.next(), line.next(), getRep(line.next()),line.next(),line.next(),line.next()));
        }
        reader.close();
        line.close();

    }

    public User getRep(String repName) {
        for (User u : users) {
            if (repName.equals(u.getName())) {
                return u;
            }
        }
        return new User();
    }

    //read the existing school data, create a new school object if it is new, write all school data to file
    @Override
    public void create() throws FileNotFoundException, IOException {

        read();

        Scanner input = new Scanner(System.in);
        System.out.println("Enter new League information");
        System.out.println("How many leagues do you want to add?");
        int numLeagues = input.nextInt();
        input.nextLine();
        boolean isNew = true;
        while (numLeagues > 0 && isNew) {
            System.out.println("Enter the new league name: ");
            String name = input.nextLine();

            for (League s : getLeagues()) {
                if (s.getName().equals(name)) {
                    isNew = false;
                }
            }
            if (isNew) {
                League newLeague = new League(name, "#", "#",getRep("coach"),"div","#","#");
                getLeagues().add(newLeague);
                fileContent += newLeague.toString() + "\n";
                numLeagues--;
            } else {
                System.out.println("That League is already listed in data");
            }

        }
        //input.close();

        FileWriter fileWriter = new FileWriter("src/golfApp/com/leagues.dat");
        fileWriter.write(fileContent);
        fileWriter.close();
    }

    //read all data from the school.dat file assign the data to filecontent string, print all data to the console
    @Override
    public void read() {

        fileContent = "";
        Collections.sort(getLeagues());
        for (League l : getLeagues()) {
            fileContent += l.toString() + "\n";
        }

        System.out.println(fileContent);
    }

    //display all data, ask for a school to update, assign school data to a temp school object, 
    //remove the old school object from the list, update the temp school information, 
    //add the temp object back to the list
    @Override
    public void update() throws FileNotFoundException, IOException {
        read();

        League temp = new League("", "", "");
        String newLeagueName = "";
        String newLeaguePhone = "";
        String newLeagueAddress = "";
        String response = "";

        Scanner input = new Scanner(System.in);
        System.out.println("Update League information");
        System.out.println("Which league would you like to update?");
        String leagueName = input.nextLine();

        for (int i = getLeagues().size() - 1; i >= 0; i--) {
            if (getLeagues().get(i).getName().equals(leagueName)) {
                temp = new League(getLeagues().get(i).getName(), 
                        getLeagues().get(i).getPhone(), 
                        getLeagues().get(i).getAddress(),
                        getLeagues().get(i).getRepresentative(),
                        getLeagues().get(i).getConference(),
                        getLeagues().get(i).getSection(),
                        getLeagues().get(i).getRegion());
                
                getLeagues().remove(i);
            }
        }
        System.out.println(temp.toString());

        while (!response.equals("q")) {
            System.out.println("What do you want to update? /n "
                    + "1) Name, "
                    + "2) Phone Number, "
                    + "3) Address "
                    + "4) League Rep "
                    + "5) Conference "
                    + "6) Section "
                    + "7) Region ");
            response = input.nextLine();
            if (response.equals("1")) {
                System.out.println("Enter the name for the league?");
                newLeagueName = input.nextLine();
                temp.setName(leagueName);
            }
            if (response.equals("2")) {
                System.out.println("Enter the phone number for the league?");
                newLeaguePhone = input.nextLine();
                temp.setPhone(newLeaguePhone);
            }
            if (response.equals("3")) {
                System.out.println("Enter the address for the league?");
                newLeagueAddress = input.nextLine();
                temp.setAddress(newLeagueAddress);
            }
        }

        getLeagues().add(temp);
        fileContent = "";
        Collections.sort(getLeagues());
        for (League l : getLeagues()) {
            fileContent += l.toString() + "\n";
        }
        FileWriter fileWriter = new FileWriter("src/golfApp/com/leagues.dat");
        fileWriter.write(fileContent);
        fileWriter.close();

    }

    //remove the entered school from the list
    @Override
    public void delete() throws FileNotFoundException {

        Scanner input = new Scanner(System.in);
        System.out.println("Delete a school from the data");
        System.out.println("Which school would you like to delete?");
        String leagueName = input.nextLine();

        for (int i = getLeagues().size() - 1; i >= 0; i--) {
            if (getLeagues().get(i).getName().equals(leagueName)) {
                getLeagues().remove(i);
            }
        }

        System.out.println(leagueName + " has been deleted");
        System.out.println("***********************");
        read();

    }

    /**
     * @return the schools
     */
    public ArrayList<League> getLeagues() {
        return leagues;
    }

    /**
     * @param schools the schools to set
     */
    public void setLeagues(ArrayList<League> leagues) {
        this.leagues = leagues;
    }

}
