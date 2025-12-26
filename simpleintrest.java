package javadsa;

import java.util.Scanner;

public class simpleintrest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Principal amount: ");
        double p = sc.nextDouble();
        System.out.println("Enter intrest Rate : ");
        double r = sc.nextDouble();
        System.out.println("Enter time : ");
        double t = sc.nextDouble();
        double Simple_intrest = p*r*t*0.01;
        System.out.println(Simple_intrest);
    }
}
