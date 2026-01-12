package javadsa.arrays;

import java.util.Scanner;

public class searchInAraay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to search : ");
        int n = sc.nextInt();
        boolean flag = false;
        int [] arr = {14,11,27,18,29,39};
        for(int i=0;i<arr.length;i++){
        if(arr[i]==n) {
            flag = true;
            break;
        }
           
        }
       if(flag==true) System.out.println("Entered element is available");
       else System.out.println("Entered element is not available");
    }
}
