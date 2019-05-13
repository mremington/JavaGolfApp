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
    private SchoolList schools = new SchoolList();
    private ArrayList<School> schoolList = schools.getSchools();
    private School usersSchool = new School();

    //load data from the school.dat file and fill the schools arraylist
    public UserList() throws FileNotFoundException {

        Scanner readUsers = new Scanner(new File("src/golfApp/com/users.dat"));
        Scanner userInfo = new Scanner("");
        while (readUsers.hasNext()) {
            String str = readUsers.nextLine();
            //System.out.println(str);
            userInfo = new Scanner(str);
            if (userInfo.hasNext()) {
                users.add(new User(userInfo.next(), userInfo.next(), userInfo.next(), userInfo.next(), userInfo.next(), userInfo.next(), userInfo.next(), getSchool(userInfo.next()), userInfo.next()));
            }
        }
        readUsers.close();
        userInfo.close();

    }

    public School getSchool(String schoolName) {
        for (School s : schoolList) {
            if (schoolName.equals(s.getName())) {
                return s;
            }
        }
        return new School();
    }

    //read the existing school data, create a new school object if it is new, write all school data to file
    @Override
    public void create() throws FileNotFoundException, IOException {

        read();

        Scanner input = new Scanner(System.in);
        System.out.println("Enter new User information");
        System.out.println("How many Users do you want to add?");
        int numUsers = input.nextInt();
        input.nextLine();
        Scanner line = new Scanner("");
        boolean isNew = true;
        while (numUsers > 0 && isNew) {
            System.out.println("Enter the new User name, phone, address, type, userName, password, email, school, gender separated by spaces: ");
            String str = input.nextLine();
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

            for (User s : getUsers()) {
                if (s.getName().equals(name)) {
                    isNew = false;
                }
            }
            if (isNew) {
                usersSchool = getSchool(school);
                User newUser = new User(name, phone, address, type, un, pw, email, usersSchool, gender);
                getUsers().add(newUser);
                fileContent += newUser.toString() + "\n";
                numUsers--;
            } else {
                System.out.println("That User is already listed in data");
            }

        }

        FileWriter fileWriter = new FileWriter("src/golfApp/com/users.dat");
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
        String newUserName = "";
        String newUserPhone = "";
        String newUserAddress = "";
        String newUserType = "";
        String newUserUN = "";
        String newUserPW = "";
        String newUserEmail = "";
        String newUserSchool = "";
        String newUserGender = "";
        String response = "";

        Scanner input = new Scanner(System.in);
        System.out.println("Update User information");
        System.out.println("Which User would you like to update?");
        String userName = input.nextLine();

        for (int i = getUsers().size() - 1; i >= 0; i--) {
            if (getUsers().get(i).getName().equals(userName)) {
                temp = new User(getUsers().get(i).getName(), 
                        getUsers().get(i).getPhone(), 
                        getUsers().get(i).getAddress(), 
                        getUsers().get(i).getUserType(), 
                        getUsers().get(i).getUserName(), 
                        getUsers().get(i).getPassword(), 
                        getUsers().get(i).getEmail(), 
                        getUsers().get(i).getSchoolID(), 
                        getUsers().get(i).getGender());
                getUsers().remove(i);
            }
        }
        System.out.println(temp.toString());

        while (!response.equals("q")) {
            System.out.println("What do you want to update? /n "
                    + "1) Name, "
                    + "2) Phone Number, "
                    + "3) Address "
                    + "4) Type "
                    + "5) User Name "
                    + "6) Password "
                    + "7) Email "
                    + "8) School "
                    + "9) Gender "
                    + "q) quit ");
            response = input.nextLine();
            if (response.equals("1")) {
                System.out.println("Enter the name for the User?");
                newUserName = input.nextLine();
                temp.setName(userName);
            }
            if (response.equals("2")) {
                System.out.println("Enter the phone number for the User?");
                newUserPhone = input.nextLine();
                temp.setPhone(newUserPhone);
            }
            if (response.equals("3")) {
                System.out.println("Enter the address for the User?");
                newUserAddress = input.nextLine();
                temp.setAddress(newUserAddress);
            }
            if (response.equals("4")) {
                System.out.println("Enter the Type for the User?");
                newUserType = input.nextLine();
                temp.setUserType(newUserType);
            }
            if (response.equals("5")) {
                System.out.println("Enter the User Name for the User?");
                newUserUN = input.nextLine();
                temp.setUserName(newUserUN);
            }
            if (response.equals("6")) {
                System.out.println("Enter the Password for the User?");
                newUserPW = input.nextLine();
                temp.setPassword(newUserPW);
            }
            if (response.equals("7")) {
                System.out.println("Enter the Email for the User?");
                newUserEmail = input.nextLine();
                temp.setEmail(newUserEmail);
            }
            if (response.equals("8")) {
                System.out.println("Enter the School for the User?");
                newUserSchool = input.nextLine();
                temp.setSchoolID(getSchool(newUserSchool));
            }
            if (response.equals("9")) {
                System.out.println("Enter the Gender for the User?");
                newUserGender = input.nextLine();
                temp.setGender(newUserGender);
            }
        }

        getUsers().add(temp);
        fileContent = "";
        Collections.sort(getUsers());
        for (User s : getUsers()) {
            fileContent += s.toString() + "\n";
        }
        FileWriter fileWriter = new FileWriter("src/golfApp/com/users.dat");
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
