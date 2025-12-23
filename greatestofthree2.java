package javadsa;

import java.util.Scanner;

public class greatestofthree2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number ");
        double a = sc.nextDouble();
        System.out.println("Enter second number ");
        double b = sc.nextDouble();
        System.out.println("Enter Third Number");
        double c = sc.nextDouble();

        if (a >= b) {
            if (a >= c)
                System.out.println(a + "is greatest number");
            else
                System.out.println(c + "is Greatest number");
        } else {
            if (b >= c)
                System.out.println(b + "is greatest number");
            else
                System.out.println(c + "is Greatest number");
        }
    }

}
