package javadsa.arrays;

import java.util.Scanner;

public class twoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter target ");
        int target = sc.nextInt();
        int [] arr = {1,12,14,16,5};
        int I = -1; int J=-1;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    I=i;
                    J=j;

                }
            }

        }
        System.out.println(I + "," + J);
    }
    
}
