package com.ndfplay;

import java.awt.*;
import java.text.NumberFormat;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        //int[] numbers = new int[5];
        /*int[] numbers = {2,3,4,5,6,7};
        numbers[0] = 1;
        numbers[1] = 2;
        System.out.println(numbers.length);
        System.out.println(Arrays.toString(numbers));

        int[][] numbers = { {1,2,3}, {4,5,6} };
        numbers[0][0] = 7;
        System.out.println(Arrays.deepToString(numbers));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Name: ");
        String name = scanner.nextLine().trim().replaceAll(" +"," ");

        System.out.println(name);



        Scanner scanner = new Scanner(System.in);
        System.out.print("Principal: ");
        double principal = scanner.nextDouble();
        System.out.print("Rate P.A: ");
        double rate = scanner.nextDouble() / (100 * 12);
        System.out.print("Years: ");
        double numberOfPayments = scanner.nextDouble() * 12;

        double repayment = principal * (rate * Math.pow((1+rate),numberOfPayments)/ (Math.pow((1 + rate),numberOfPayments)-1));
        String money = NumberFormat.getCurrencyInstance(Locale.UK).format(repayment);
        System.out.println("Repayment: "+ money);
        System.out.println("Repayment: "+ repayment);
        int x = 1;
        int y = 1;
        System.out.println(x >= y);
        int income= 120_000;
        String state = income > 100_000 ? "Rich" : "Poor";
        System.out.println(state);


        String role = "modrator";
        switch (role) {
            case "admin":
                System.out.println("youse an Admin");
                System.out.println("still an admin");
                break;

            case "moderator":
                System.out.println("youse a mod");

            default:
                System.out.println("We don't know what you are");
                break;
        }
        System.out.println("DONE");


        Scanner scanner = new Scanner(System.in);
        System.out.print("Number: ");
        byte number = scanner.nextByte();
        if (number % 5 == 0 ) System.out.print("Fizz");
        if (number % 3 == 0 ) System.out.print("Buzz");
        if (number % 5 != 0 && number % 3 != 0 ) System.out.println(number);
        else System.out.println("");

         */
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
        }

    }
}