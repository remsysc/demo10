package com.rem;

import java.util.Scanner;

public class PaySlip {

    String employee_name = "";
    float employee_salary = 0;
    int employee_days = 0;
    int allowance = 0;
    float gross_pay = 0;
    float net_pay = 0;

    public static void CalculatePaySlip() {

        PaySlip person = new PaySlip();

        System.out.println("Welcome To Black Mesa Corporation !!");
        System.out.print("Enter Employee's name: ");

        Scanner scan = new Scanner(System.in);
        person.employee_name = scan.nextLine();
        System.out.println("Enter salary per day: ");
        person.employee_salary = scan.nextFloat();
        System.out.println("Enter number of days present: ");
        person.employee_days = scan.nextInt();

        person.allowance = person.employee_days * 1000;
        person.gross_pay = (person.employee_salary * person.employee_days) + person.allowance;
        person.net_pay = (float) TaxDeduction(person.gross_pay);

        PrintPaySlip(person);

    }

    public static void PrintPaySlip(PaySlip person) {

        System.out.println("Generating Payslip:\n.\n.\n.");
        System.out.println("Black Mesa Employee: ");
        System.out.println("Name: " + person.employee_name + "\nBasic Salary: " + person.employee_salary
                + "\nNumber of Days Present: " + person.employee_days + "\nTotal Allowance: " + person.allowance
                + "\nGross Pay: " + person.gross_pay + "\nNet Pay: " + person.net_pay);

        System.out.println(".\n.\n.\nEnd");

    }

    public static double TaxDeduction(float gross_pay) {

        if (gross_pay > 5000) {
            return gross_pay * 0.6;
        }

        if (gross_pay <= 10000) {
            return gross_pay * 0.1;
        } else if (gross_pay <= 20000 && gross_pay > 10000) {
            return gross_pay * 0.2;
        } else if (gross_pay <= 30000 && gross_pay > 20000) {
            return gross_pay * 0.3;
        } else if (gross_pay <= 40000 && gross_pay > 30000) {
            return gross_pay * 0.4;
        } else if (gross_pay <= 50000 && gross_pay > 40000) {
            return gross_pay * 0.5;
        }

        return 0.0;
    }
}
