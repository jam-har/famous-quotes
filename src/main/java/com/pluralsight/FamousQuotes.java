package com.pluralsight;

import java.util.Scanner;

public class FamousQuotes {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            String[] quotes = new String[10];
            quotes[0] = "The Inner Machinations of My Mind Are an Enigma.";
            quotes[1] = "Firmly Grasp It!";
            quotes[2] = "Goodbye everyone, I’ll remember you all in therapy.";
            quotes[3] = "You can’t fool me. I listen to public radio!";
            quotes[4] = "Always follow your heart unless your heart is bad with directions.";
            quotes[5] = "Give to the Children’s fund? What have the children ever done for me?";
            quotes[6] = "Did you smell it? That smell. A kind of smelly smell. The smelly smell that smells... smelly.";
            quotes[7] = "I order the food, you cook the food. The customer gets the food. We do that for 40 years, and then we die";
            quotes[8] = "Hello. You’ve reached the house of unrecognized talent.";
            quotes[9] = "I'll be there faster than a barefoot jackrabbit on a hot, greasy griddle, in the middle of August!";
            System.out.println("Please enter a number for a quote:");
            int selection = scanner.nextInt();
            System.out.println(quotes[selection]);
        } catch(Exception ex){
            System.out.println("An error has occurred.");
        }

    }
}
