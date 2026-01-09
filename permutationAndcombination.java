package javadsa.Functions;
import java.util.Scanner;
public class permutationAndcombination {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();
        System.out.println("Enter r : ");
        int r = sc.nextInt();
        int perm ; int comb;
        perm = factorial(n)/(factorial(r)*factorial(n-r));
        comb = factorial(n)/factorial(n-r);
        System.out.println(perm);
        System.out.println(comb);

        
    }
    public static int  factorial ( int a ) {
          int i; int fact = 1;
        for(i=1;i<=a;i++){
           fact = i*fact;
         
        }

      
          return fact;

        
    }
    
}
