package javadsa;

import java.util.Scanner;

// take a number from user take test it if the number is integer or not 
public class if_else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        double n = sc.nextDouble(); // let n = 3.14
        double x = (int)n ; // x becomes 3
        if(n-x== 0)  System.out.println("number is integer");
        else System.out.println("Number is not integer");
       
    }
}
