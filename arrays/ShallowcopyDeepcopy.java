import java.util.Arrays;

public class ShallowcopyDeepcopy {
    public static void main(String[] args) {
        int [] arr = {1,3,5,7,9};
        // int [] x = arr;// x is Shallow copy
        // x[0] = 100;
        int [] deep = Arrays.copyOf(arr,arr.length );
        deep[0]=100;
        System.out.println(deep[0]);
        System.out.println(arr[0]); 
    }
    
}
