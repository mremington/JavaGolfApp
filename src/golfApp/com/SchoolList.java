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
public class SchoolList implements CRUD {

    private ArrayList<School> schools = new ArrayList<School>();
    private String fileContent;

    //load data from the school.dat file and fill the schools arraylist
    public SchoolList() throws FileNotFoundException {
        Scanner reader = new Scanner(new File("src/golfApp/com/schools.dat"));
        Scanner line = new Scanner("");
        while (reader.hasNext()) {
            String str = reader.nextLine();
            line = new Scanner(str);
            schools.add(new School(line.next(), line.next(), line.next()));
        }
       reader.close();
       line.close();
       
    }

    //read the existing school data, create a new school object if it is new, write all school data to file
    @Override
    public void create() throws FileNotFoundException, IOException {

        read();

        Scanner input = new Scanner(System.in);
        System.out.println("Enter new School information");
        System.out.println("How many schools do you want to add?");
        int numSchools = input.nextInt();
        input.nextLine();
        boolean isNew = true;
        while (numSchools > 0 && isNew) {
            System.out.println("Enter the new school name: ");
            String name = input.nextLine();

            for (School s : getSchools()) {
                if (s.getName().equals(name)) {
                    isNew = false;
                }
            }
            if (isNew) {
                School newSchool = new School(name, "#", "#");
                getSchools().add(newSchool);
                fileContent += newSchool.toString() + "\n";
                numSchools--;
            } else {
                System.out.println("That School is already listed in data");
            }

        }
        //input.close();

        FileWriter fileWriter = new FileWriter("src/golfApp/com/schools.dat");
        fileWriter.write(fileContent);
        fileWriter.close();
    }

    //read all data from the school.dat file assign the data to filecontent string, print all data to the console
    @Override
    public void read() {

        fileContent = "";
        Collections.sort(getSchools());
        for (School s : getSchools()) {
            fileContent += s.toString() + "\n";
        }

        System.out.println(fileContent);
    }

    //display all data, ask for a school to update, assign school data to a temp school object, 
    //remove the old school object from the list, update the temp school information, 
    //add the temp object back to the list
    @Override
    public void update() throws FileNotFoundException, IOException {
        read();

        School temp = new School("", "", "");
        String newSchoolName = "";
        String newSchoolPhone = "";
        String newSchoolAddress = "";
        String response = "";

        Scanner input = new Scanner(System.in);
        System.out.println("Update School information");
        System.out.println("Which school would you like to update?");
        String schoolName = input.nextLine();

        for (int i = getSchools().size() - 1; i >= 0; i--) {
            if (getSchools().get(i).getName().equals(schoolName)) {
                temp = new School(getSchools().get(i).getName(), getSchools().get(i).getPhone(), getSchools().get(i).getAddress());
                getSchools().remove(i);
            }
        }
        System.out.println(temp.toString());

        while (!response.equals("q")) {
            System.out.println("What do you want to update? /n 1) Name, 2) Phone Number, 3) Address q) quit");
            response = input.nextLine();
            if (response.equals("1")) {
                System.out.println("Enter the name for the school?");
                newSchoolName = input.nextLine();
                temp.setName(schoolName);
            }
            if (response.equals("2")) {
                System.out.println("Enter the phone number for the school?");
                newSchoolPhone = input.nextLine();
                temp.setPhone(newSchoolPhone);
            }
            if (response.equals("3")) {
                System.out.println("Enter the address for the school?");
                newSchoolAddress = input.nextLine();
                temp.setAddress(newSchoolAddress);
            }
        }

        getSchools().add(temp);
        fileContent = "";
        Collections.sort(getSchools());
        for (School s : getSchools()) {
            fileContent += s.toString() + "\n";
        }
        FileWriter fileWriter = new FileWriter("src/golfApp/com/schools.dat");
        fileWriter.write(fileContent);
        fileWriter.close();

    }

    //remove the entered school from the list
    @Override
    public void delete() throws FileNotFoundException {

        Scanner input = new Scanner(System.in);
        System.out.println("Delete a school from the data");
        System.out.println("Which school would you like to delete?");
        String schoolName = input.nextLine();

        for (int i = getSchools().size() - 1; i >= 0; i--) {
            if (getSchools().get(i).getName().equals(schoolName)) {
                getSchools().remove(i);
            }
        }

        System.out.println(schoolName + " has been deleted");
        System.out.println("***********************");
        read();

    }

    /**
     * @return the schools
     */
    public ArrayList<School> getSchools() {
        return schools;
    }

    /**
     * @param schools the schools to set
     */
    public void setSchools(ArrayList<School> schools) {
        this.schools = schools;
    }

}
