/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package golfApp.com;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author michael.remington
 */
public class TextVersionWriteToFiles {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        SchoolList schoolInfo = new SchoolList();
        UserList userInfo = new UserList();

        String response = "";
        Scanner input = new Scanner(System.in);
        System.out.println("High School Golf Scoring Application");
        System.out.println("Enter 1) School Menu, 2) User Menu or \"Quit\" to exit");
        response = input.nextLine();
        while (!response.equals("Quit")) {
            if (response.equals("1")) {
                while (!response.equals("q")) {
                    System.out.println("School Information Menu");
                    System.out.println("Enter c) Create, r)Read, u)update, d)delete, q)quit");
                    response = input.nextLine();
                    if (response.equals("c")) {
                        schoolInfo.create();
                    }
                    if (response.equals("r")) {
                        schoolInfo.read();
                    }
                    if (response.equals("u")) {
                        schoolInfo.update();
                    }
                    if (response.equals("d")) {
                        schoolInfo.delete();
                    }
                }
            } else if (response.equals("2")) {
                while (!response.equals("q")) {
                    System.out.println("User Information Menu");
                    System.out.println("Enter c) Create, r)Read, u)update, d)delete, q)quit");
                    response = input.nextLine();
                    if (response.equals("c")) {
                        userInfo.create();
                    }
                    if (response.equals("r")) {
                        userInfo.read();
                    }
                    if (response.equals("u")) {
                        userInfo.update();
                    }
                    if (response.equals("d")) {
                        userInfo.delete();
                    }
                }
            }
            else{
                System.out.println("Enter a response from the Applicaiton Menu");
                System.out.println("Enter 1) School Menu, 2) User Menu or \"Quit\" to exit");
                response = input.nextLine();
            }
        }

        System.out.println("Have a nice day");

    }

}
