package javadsa;

import java.util.Scanner;

public class sumOfdigitofAnumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n = sc.nextInt();
        int count = 0;
        while(n!=0){
           
            int b;
            b= n%10;
             n=n/10;
        count +=b;

        
        }

      System.out.println("Sum of the digit :" + count);
    }
    
}
