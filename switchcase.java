import java.util.*;
public class switchcase{
    public static void main(String args[]){
    //     int x = 3;
    // // switch case example
    // switch(x){
    //     case 1:
    //         System.out.println("monday");
    //         break;
    //     case 2:
    //         System.out.println("tuesday");
    //         break;
    //     case 3:
    //         System.out.println("wednesday");
    //         break;
    //     case 4:
    //         System.out.println("thursday");
    //         break;
    //     case 5:
    //         System.out.println("friday");
    //         break;
    //     case 6 :
    //        System.out.println("saturday");
    //         break;
    //     case 7:
    //         System.out.println("sunday");
    //         break;
    //         }

    // one method of switch case in java
    // Scanner sc = new Scanner(System.in);
    // String day = sc.next();
    // // String day = "monday";
    //     switch(day){
    //         case "saturday", "sunday":
    //             System.out.println("7am");
    //             break;
    //         case "monday":
    //             System.out.println("8am");
    //             break;
    //         case "tuesday", "wednesday":
    //             System.out.println("9am");
    //             break;
    //         default :
    //             System.out.println("6am");
    //             break;
    //     }
    // String day = "sunday";
    //     switch(day){
    //         case "sunday" ,"saturday" -> System.out.println("6am");
    //         case "monday" -> System.out.println("7am");
    //         }
    String day = "monday";
    String result ="";
    switch(day){
        case "monday" , "tuesday" -> result= "6am";
        case "sunday" -> result ="7am";

    }
    System.out.println(result);
        }
    
}