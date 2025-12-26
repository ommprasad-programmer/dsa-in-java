package javadsa;

import java.util.Scanner;

public class sides_of_triangle_or_not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sides of triangle: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        if (a+b > c && b+c>a && c+a > b) {
              System.out.println("Given sides can make a triangle");           
        }
        else System.out.println("Given side cant form a triangle");
       
    }
}
