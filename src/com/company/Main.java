package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
       final int n = (int)(Math.random() *100) + 1;
    Scanner sc = new Scanner(System.in);
    boolean correctguess = false;
    double guess;
    while (!correctguess) {
        System.out.println("What is your guess?");
        guess = sc.nextDouble();
        if ((int)guess == n) {
            System.out.println("Correct Guess");
            correctguess = true;
        }else if (guess > n){
            System.out.println("Guess is too high!");
        }else if (guess < n){
            System.out.println("Guess is too low!");
        }

        }

    }
}
