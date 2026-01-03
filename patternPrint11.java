import java.util.Scanner;

public class patternPrint11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();
        int i; int j; int k;
        for(i=1;i<=n;i++){
            for(j=1 ; j<=n;j++){
               if((i+j)>n) System.out.print("*");
               else System.out.print(" ");
              
            }
            System.out.println();
        }
    }
}
