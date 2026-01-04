package javadsa;

import java.util.Scanner;

public class patternPrint12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();
        int i; int j; int k; 
        for(i=1 ; i<=n;i++){
            for(j=n-i; j>=0 ; j--){
                System.out.print(" ");
            }
            for(k=1 ; k<=i;k++){
                System.out.print(k );
            }
            System.out.println();
        }
    }
    
}
