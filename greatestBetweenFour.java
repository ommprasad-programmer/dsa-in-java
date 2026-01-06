
package javadsa.Functions;

import java.util.Scanner;

public class greatestBetweenFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    System.out.println("Enter a : ");
    double a = sc.nextInt();
    System.out.println("Enter b : ");
    double b = sc.nextInt();
    System.out.println("Enter c : ");
    double c = sc.nextInt();
    System.out.println("Enter d : ");
    double d = sc.nextInt();
    
    System.out.println( Math.max((Math.max(a,b)), (Math.max(c,d))));
        
    }
    
}