package javadsa.arrays;

import java.util.Scanner;

public class addWithoddmultiwitheven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size : ");
        int n = sc.nextInt();
        int []  arr = new int [n];
        int i;
        for( i=0;i<n;i++){
            arr[i] = sc.nextInt();
            if(i%2==0){
               arr[i] = arr[i]*2;
            }
            else{
                arr[i] = arr[i]+10;
            }
           
        }
        print(arr);
        
    }
     public static void print(int [] arr) {
            for(int i=0;i< arr.length;i++){
                System.out.print(arr[i] + " ");
            }
           System.out.println();
        }
    
}
