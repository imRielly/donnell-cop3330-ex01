/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Rielly Donnell
 */

package oop;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.print("What is your name? ");
        Scanner nameIn = new Scanner(System.in);
        String name = nameIn.nextLine();
        System.out.println("Hello, " + name + ", nice to meet you!");
    }
}
