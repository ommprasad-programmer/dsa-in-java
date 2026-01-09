package javadsa.Functions;

import java.util.Scanner;

public class swap {
    public static void swap(int a , int b) {
        int temp;
        temp = a;
        a=b;
        b=temp;
        System.out.println("First number is" + a);
        System.out.println("Second number is" + b);
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first num : ");
        int x = sc.nextInt();
        System.out.println("Enter second num : ");
        int y = sc.nextInt();
        
        swap(x, y);
}
}
