package javadsa.arrays;

import java.util.Scanner;

public class productOfarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        int product=1;
        for(int i = 0 ; i<n;i++){
            arr[i] = sc.nextInt();
            product*=arr[i];

        }
        System.out.println("Product is " + product);
    }
}
