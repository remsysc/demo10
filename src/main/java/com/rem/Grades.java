package com.rem;

import java.util.Scanner;

public class Grades {

    String student_name = "";
    double read101 = 0;
    double mat101 = 0;
    double ccs100 = 0;
    double ccs101 = 0;
    double gwa = 0;

    public static void CalculateGrade() {

        Grades student = new Grades();
        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        student.student_name = scan.next();
        System.out.print("Enter your grade in READ101: ");
        student.read101 = scan.nextDouble();
        System.out.print("Enter your grade in MAT101: ");
        student.mat101 = scan.nextDouble();
        System.out.print("Enter your grade in CCS100 ");
        student.ccs100 = scan.nextDouble();
        System.out.print("Enter your grade in CCS101: ");
        student.ccs101 = scan.nextDouble();
        PrintGrade(student);
    }

    public static void PrintGrade(Grades person) {

        System.out.println("Student Name: " + person.student_name + "\nREAD101: " + person.read101 + "\nMATH101: "
                + person.mat101 + "\nCCS100: " + person.ccs100 + "\nCCS101 : " + person.ccs101);

        person.gwa = (person.read101 + person.mat101 + person.ccs100 + person.ccs101) / 4;
        System.out.println("Youre GWA is " + person.gwa);

    }
}
