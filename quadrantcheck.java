package javadsa;

import java.util.Scanner;

public class quadrantcheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x co-ordinate: ");
        double x = sc.nextDouble();
         System.out.println("Enter y co-ordinate: ");
        double y = sc.nextDouble();
         System.out.println("The point is ("+x+","+y+")");
       if (x > 0 && y > 0)
    System.out.println("The point (" + x + "," + y + ") is in First Quadrant");

else if (x < 0 && y > 0)
    System.out.println("The point (" + x + "," + y + ") is in Second Quadrant");

else if (x < 0 && y < 0)
    System.out.println("The point (" + x + "," + y + ") is in Third Quadrant");

else if (x > 0 && y < 0)
    System.out.println("The point (" + x + "," + y + ") is in Fourth Quadrant");

else if (x != 0 && y == 0)
    System.out.println("The point (" + x + "," + y + ") is on X-axis");

else if (x == 0 && y != 0)
    System.out.println("The point (" + x + "," + y + ") is on Y-axis");

else
    System.out.println("The point (" + x + "," + y + ") is at Origin");

    }
}
