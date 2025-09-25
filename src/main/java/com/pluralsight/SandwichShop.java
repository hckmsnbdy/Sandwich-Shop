package com.pluralsight;

/*
Prompt the user for the size of the sandwich (1 or 2):
a. 1: Regular: base price $5.45
b. 2: Large: base price $8.95
Prompt the user for their age:
a. Student (17 years old or younger) — receive a 10% discount
b. Seniors (65 years old or older) — receive a 20% discount
Display the cost of the sandwich to the screen
Step 2
1. Ensure all your changes are committed and pushed to GitHub
2. Send your repository URL to your Instructor

 */

import java.util.Scanner;

public class SandwichShop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();

        boolean regularSize = false;
        boolean largeSize = false;
        double regularSizePrice = 5.45;
        double largeSizePrice = 8.95;
        double student = 0.1;
        double senior = 0.2;
        double finalPrice = 0;
        if (size == 1){regularSize= true;}
        else if (size == 2) { largeSize = true;
        }
        int age = input.nextInt();
        if (age <= 17) {
            if (regularSize) {
                finalPrice = student * regularSizePrice;
            }
            if (age >= 65){finalPrice = senior * regularSizePrice;
        }
        }
    }
}