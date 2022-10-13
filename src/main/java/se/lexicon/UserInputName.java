package se.lexicon;

import java.util.Scanner;

public class UserInputName {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Hello!");
        System.out.println("Enter your name below so I know who you are");
        String name;
        name = sc.next();

        System.out.println("Welcome " + name);


    }
}
