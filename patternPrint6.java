import java.util.Scanner;

class patternPrint6{
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter n : ");
       int n = sc.nextInt();
         int i; int j; 
       for (i=1;i<=n ; i++) {
           for ( j=1 ; j<=n;j++){
               if(i%2==0) System.out.print((char)(i+64));
               else System.out.print((char)(i+96));
           }
           System.out.println();
       }
    
    }
}