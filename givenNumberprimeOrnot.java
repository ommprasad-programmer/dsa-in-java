import java.util.Scanner;

public class givenNumberprimeOrnot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number :");
        int n = sc.nextInt();
        int i ;
         
        for( i = 2 ; i <= Math.sqrt(n) ; i++){
            
            if(n%i == 0){
             System.out.println("n is not prime number");
             break;
                
            }
           
          

        }
         if(n == 1) System.out.println("n is nither prime nor composite number");
          else System.out.println("n is prime number");
       
    }
    
}
