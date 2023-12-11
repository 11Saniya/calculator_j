package Calci;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter First number");
            double a = sc.nextDouble();
            System.out.println("Enter second number");
            double b = sc.nextDouble();
            System.out.println("Enter\n1) addition\n2) substraction\n3) multiplication\n4) Division");
            int choices = sc.nextInt();
            Calculator c = new Calculator();
            switch (choices) {
                case 1:
                    System.out.println("Addition of two numbers= " + c.addition(a, b));
                    break;
                case 2:
                    System.out.println("substration of two numbers= " + c.sub(a, b));
                    break;
                case 3:
                    System.out.println("multiplaction of two numbers= " + c.mul(a, b));
                    break;
                case 4:
                    System.out.println("division of two numbers= " + c.division(a, b));
                    break;
                default:
                    System.out.println("Not a valid number");
            }
        }
    }
}