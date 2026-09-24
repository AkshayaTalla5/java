import java.util.*;
public class sumarray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        // int sum = 0;
        int product = 1;
        for(int i = 0; i < n; i++){
            array[i] = sc.nextInt();
            // sum += array[i];
            product *= array[i];
        }
        // System.out.print("sum = " + sum);
                System.out.print("product = " + product);

    }
}