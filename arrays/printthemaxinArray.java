package javadsa.arrays;

import java.util.Scanner;

public class printthemaxinArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sixe of the arrray: ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        int i; int max = arr[0];
        for(i=0;i<n;i++){
            arr[i]=sc.nextInt();
            if(arr[i]>max) max=arr[i];
            
            
        }
        System.out.println(max);

    }
}
