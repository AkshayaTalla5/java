import java.util.*;
public class secondlargest{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int largest = 0;
        int secondlargest = 0;
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
    
       for(int i=0;i<n;i++){
        if(arr[i]>largest){
          
            largest =arr[i];
        }
       } 
       for(int i=0;i<n;i++){
        if(arr[i]>secondlargest&&arr[i]!=largest){
            secondlargest=arr[i];

        }
       }
       System.out.println("Largest:"+largest);
        System.out.println("Second Largest:"+secondlargest);
    }
}