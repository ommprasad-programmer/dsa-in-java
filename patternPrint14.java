package javadsa;

import java.util.Scanner;

public class patternPrint14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();
        int i; int j; int k ; int l; int m;
        for(i=1;i<=4;i++){
            for(j=4-i;j>=0;j--){
                System.out.print(" ");
            }
            for(k=0;k<=i-1;k++){
                System.out.print("*");
            }
            for(l=4;l>=i;l--){
                System.out.print("*");
            }
            for(m=0;m<=i-1;m++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    
}
