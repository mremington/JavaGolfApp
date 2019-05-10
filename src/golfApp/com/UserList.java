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
public class UserList implements CRUD {

    private ArrayList<User> users = new ArrayList<User>();
    private String fileContent;

    //load data from the school.dat file and fill the schools arraylist
    public UserList() throws FileNotFoundException {
        
        SchoolList schools = new SchoolList();
        ArrayList<School> schoolList = schools.getSchools();
        School usersSchool = new School();
        
        Scanner reader = new Scanner(new File("src/golfApp/com/users.dat"));
        Scanner line = new Scanner("");
        while (reader.hasNext()) {
            String str = reader.nextLine();
            line = new Scanner(str);
            String name = line.next();
            String phone = line.next();
            String address = line.next();
            String type = line.next();
            String un = line.next();
            String pw = line.next();
            String email = line.next();
            String school = line.next();
            String gender = line.next();
            
            for(School s:schoolList){
                if(school.equals(s.getName())){
                    usersSchool = s;
                }
            }
            
            users.add(new User(name,phone,address,type,un,pw,email,usersSchool, gender));
            //line.nextLine();
        }
        reader.close();
        line.close();
    }

    //read the existing school data, create a new school object if it is new, write all school data to file
    @Override
    public void create() throws FileNotFoundException, IOException {

        read();

        Scanner input = new Scanner(System.in);
        System.out.println("Enter new User information");
        System.out.println("How many Users do you want to add?");
        int numSchools = input.nextInt();
        input.nextLine();
        boolean isNew = true;
        while (numSchools > 0 && isNew) {
            System.out.println("Enter the new User name: ");
            String name = input.nextLine();

            for (User s : getUsers()) {
                if (s.getName().equals(name)) {
                    isNew = false;
                }
            }
            if (isNew) {
                User newUser = new User();
                getUsers().add(newUser);
                fileContent += newUser.toString() + "\n";
                numSchools--;
            } else {
                System.out.println("That User is already listed in data");
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
        Collections.sort(getUsers());
        for (User s : getUsers()) {
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

        User temp = new User();
        String newSchoolName = "";
        String newSchoolPhone = "";
        String newSchoolAddress = "";
        String response = "";

        Scanner input = new Scanner(System.in);
        System.out.println("Update User information");
        System.out.println("Which User would you like to update?");
        String schoolName = input.nextLine();

        for (int i = getUsers().size() - 1; i >= 0; i--) {
            if (getUsers().get(i).getName().equals(schoolName)) {
                temp = new User();
                getUsers().remove(i);
            }
        }
        System.out.println(temp.toString());

        while (!response.equals("q")) {
            System.out.println("What do you want to update? /n "
                    + "1) Name, "
                    + "2) Phone Number, "
                    + "3) Address "
                    + "4) Type"
                    + "5) User Name"
                    + "6) Password"
                    + "7) Email"
                    + "8) School"
                    + "9) Gender"
                    + "q) quit");
            response = input.nextLine();
            if (response.equals("1")) {
                System.out.println("Enter the name for the User?");
                newSchoolName = input.nextLine();
                temp.setName(schoolName);
            }
            if (response.equals("2")) {
                System.out.println("Enter the phone number for the User?");
                newSchoolPhone = input.nextLine();
                temp.setPhone(newSchoolPhone);
            }
            if (response.equals("3")) {
                System.out.println("Enter the address for the User?");
                newSchoolAddress = input.nextLine();
                temp.setAddress(newSchoolAddress);
            }
        }

        getUsers().add(temp);
        fileContent = "";
        Collections.sort(getUsers());
        for (User s : getUsers()) {
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
        System.out.println("Delete a User from the data");
        System.out.println("Which User would you like to delete?");
        String userName = input.nextLine();

        for (int i = getUsers().size() - 1; i >= 0; i--) {
            if (getUsers().get(i).getName().equals(userName)) {
                getUsers().remove(i);
            }
        }

        System.out.println(userName + " has been deleted");
        System.out.println("***********************");
        read();

    }

    /**
     * @return the users
     */
    public ArrayList<User> getUsers() {
        return users;
    }

    /**
     * @param users the users to set
     */
    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }

}
