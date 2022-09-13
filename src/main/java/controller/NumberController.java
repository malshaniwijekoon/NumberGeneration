package controller;

import service.INumberService;
import service.NumberService;

import java.io.IOException;
import java.util.Scanner;  // Import the Scanner class

public class NumberController {
    INumberService numberService = new NumberService();

    public static void main(String args[]) throws IOException {
        NumberController numberController = new NumberController();
        numberController.numberGenerate();
        //numberController.checkPattern();
        //numberController.checkCategory();
        System.out.println("End");
    }

    public void numberGenerate() throws IOException {
        int a,b,c,d,e,f,g;
        for(a=0;a<=9;a++){
            for(b=0;b<=9;b++){
                for(c=0;c<=9;c++){
                    for(d=0;d<=9;d++){
                        for(e=0;e<=9;e++){
                            for(f=0;f<=9;f++){
                                for(g=0;g<=9;g++){
                                    numberService.numberCategory(a,b,c,d,e,f,g);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public void checkPattern() throws IOException {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter Number");

        String number = myObj.nextLine();  // Read user input
        System.out.println("Number is: " + number);  // Output user input

        String input = number;
        char[] arr = new char[input.length()]; // Creating array of string length

        // Copy character by character into array
        for (int i = 0; i < input.length(); i++)
        {
            arr[i] = input.charAt(i);
        }
        numberService.numberCategory(Integer.parseInt(String.valueOf(arr[3])), Integer.parseInt(String.valueOf(arr[4])), Integer.parseInt(String.valueOf(arr[5])), Integer.parseInt(String.valueOf(arr[6])), Integer.parseInt(String.valueOf(arr[7])), Integer.parseInt(String.valueOf(arr[8])), Integer.parseInt(String.valueOf(arr[9])));
    }

    public void checkCategory() throws IOException {
        INumberService numberService = new NumberService();
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter Pattern Using X Y Z with prefix ?: ");

        String pattern = myObj.nextLine();  // Read user input
        System.out.println("Pattern is: " + pattern);

        String input = pattern;
        char[] arr = new char[input.length()]; // Creating array of string length

        // Copy character by character into array
        for (int i = 0; i < input.length(); i++)
        {
            arr[i] = input.charAt(i);
        }
        numberService.patternCategory(Character.toString(arr[3]), Character.toString(arr[4]), Character.toString(arr[5]), Character.toString(arr[6]), Character.toString(arr[7]), Character.toString(arr[8]), Character.toString(arr[9]));
    }
}