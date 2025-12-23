package javadsa;

import java.util.Scanner;

public class big_number_between_three {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number : ");
        double a = sc.nextDouble();

        System.out.println("Enter second number : ");
        double b = sc.nextDouble();

        System.out.println("Enter third number : ");
        double c = sc.nextDouble();

        if (a > b && a > c) {
            System.out.println("First number is greater");
        } 
        else if (b > a && b > c) {
            System.out.println("Second number is greater");
        } 
        else if (c > a && c > b) {
            System.out.println("Third number is greater");
        } 
        else {
            System.out.println("Two or more numbers are equal");
        }

        sc.close();
    }
}
