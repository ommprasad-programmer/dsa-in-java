package javadsa;

import java.util.Scanner;

public class factorial {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    int n = sc.nextInt();
    int count =1;
    int i ;
    for(i = 1 ; i <=n;i++){
        count *=i;
    
    }
    System.out.println(count);
   }    
}
