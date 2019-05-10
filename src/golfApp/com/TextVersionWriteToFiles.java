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
        
        String response = "";
        Scanner input = new Scanner(System.in);
        System.out.println("High School Golf Scoring Application");
        System.out.println("Enter 1 to access School menu or q to quit");
        response = input.nextLine();

        while (!response.equals("q")) {
            System.out.println("School Information Menu");
            System.out.println("Enter c) Create, r)Read, u)update, d)delete, q)quit");
            response = input.nextLine();
            if(response.equals("c")){
                schoolInfo.create();
            }
            if(response.equals("r")){
                schoolInfo.read();
            }
            if(response.equals("u")){
                schoolInfo.update();
            }
            if(response.equals("d")){
                schoolInfo.delete();
            }
        }

    }

}