package com.rem;

import java.util.Scanner;

import static com.rem.Grades.CalculateGrade;
import static com.rem.PaySlip.CalculatePaySlip;

public class Main {

    public static void main(String[] args) {

        while (true) {

            System.out.println("< ------------| Welcome! |------------ >");
            System.out.println("1. Payslip\n2. Grades\n3. Do While Loop (Example)\n4. For Loop (example)");
            System.out.print(">> ");

            Scanner scan = new Scanner(System.in);
            int user_input = scan.nextInt();

            switch (user_input) {
                case 1 ->
                    CalculatePaySlip();
                case 2 ->
                    CalculateGrade();
                case 3 ->
                    do_while();
                case 4 ->
                    for_loop();
                default -> {
                    System.out.println("Invalid Input.");
                    continue;
                }
            }
            scan.close();

            break;
        }

    }

    public static void do_while() {
        System.out.print("Enter a number: ");

        Scanner scan = new Scanner(System.in);
        int user_input = scan.nextInt();

        System.out.println("Printing number backwards!");
        do {
            System.out.println(user_input);
            user_input--;

        } while (user_input >= 0);

    }

    public static void for_loop() {
        System.out.print("Enter a number: ");

        Scanner scan = new Scanner(System.in);
        int user_input = scan.nextInt();

        System.out.println("Meowing ...");
        for (int i = 0; i < user_input; i++) {

            System.out.println("Meow Meow!");
        }

    }

}
