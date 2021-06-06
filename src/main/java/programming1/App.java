/*
Create a program that prompts for your weight, gender, total alcohol consumed (in ounces), and the amount of time since your last drink. Calculate your blood alcohol content (BAC) using this formula

BAC = (A × 5.14 / W × r) − .015 × H
where



Enter a 1 is you are male or a 2 if you are female: 1
How many ounces of alcohol did you have? 3
What is your weight, in pounds? 175
How many hours has it been since your last drink? 1

Your BAC is 0.049323
It is legal for you to drive.
 */

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Dilly Jacques
 */


package programming1;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner in =new Scanner(System.in);
        int A=0;
        double r=0;
        int W=0,H=0;

        boolean isNumr;
        do {
            System.out.print("Enter a 1 is you are male or a 2 if you are female: ");
            if (in.hasNextInt()) {
                r = in.nextInt();
                r = r == 1 ? .73 : .66;
                isNumr = true;
            } else {
                System.out.println("INVALID INPUT!!");
                isNumr = false;
                in.next();
            }
        }while(!(isNumr));

        isNumr = false;

        do {
            System.out.print("How many ounces of alcohol did you have? ");
            if (in.hasNextInt()) {
                A = in.nextInt();
                isNumr = true;
            } else {
                System.out.println("INVALID INPUT!!");
                isNumr = false;
                in.next();
            }
        }while(!(isNumr));

        isNumr = false;

        do {
            System.out.print("What is your weight, in pounds? ");
            if (in.hasNextInt()) {
                W = in.nextInt();
                isNumr = true;
            } else {
                System.out.println("INVALID INPUT!!");
                isNumr = false;
                in.next();
            }
        }while(!(isNumr));

        isNumr = false;

        do {
            System.out.print("How many hours has it been since your last drink? ");
            if (in.hasNextInt()) {
                H= in.nextInt();
                isNumr = true;
            } else {
                System.out.println("INVALID INPUT!!");
                isNumr = false;
                in.next();
            }
        }while(!(isNumr));

        isNumr = false;


        double BAC = (A * 5.14 / W * r) - .015 * H;

        System.out.printf("Your BAC is %.6f\n",BAC);

        if(BAC>=.08){
            System.out.println("It is not legal for you to drive.");

        }
        else{
            System.out.println("It is legal for you to drive.");

        }

    }
}
