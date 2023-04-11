package com.gyan.ConditionalStatements.Intermediate;

import java.util.Scanner;

public class CGPA {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of semester: ");
        int n = in.nextInt();
        double sum = 0;
        for (int i = 1; i <= n ; i++) {
            System.out.print("Enter cgpa of " + i + " semester: ");
            double marks = in.nextDouble();
            sum += marks;
        }
        double cgpapercentage = (sum)/ n;
        System.out.print("Your average cgpa is: " + cgpapercentage);
    }
}
