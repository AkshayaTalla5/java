import java.util.*;
public class evenoddsum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int evensum = 0;
        int oddsum = 0;
        int evencount = 0;
        int oddcount = 0; 
        for(int i=0;i<n;i++){
            if(arr[i] % 2 == 0){
                evensum = evensum +arr[i];
                evencount++;
            }
            else{
                oddsum = oddsum +arr[i];
                oddcount++;
            }
        }
        System.out.println("evensum = " + evensum);
        System.out.println("oddsum = " + oddsum);
        System.out.println("evencount = " + evencount);
        System.out.println("oddcount = " + oddcount);

    }
}