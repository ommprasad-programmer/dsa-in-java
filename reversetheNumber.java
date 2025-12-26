package javadsa;

import java.util.Scanner;

public class reversetheNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        int count = 0 ;
        
        while(n != 0){
            int b;
         count *=10;
         count += (n%10);
         n=n/10;
           
            
        }
         System.out.println("Reverse of the number is : " + count);
       

    }
    
}
