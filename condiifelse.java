public class condiifelse{
    public static void main(String args[]){
        int x = 5;
        int y = 4;
        int z = 6;
        // if else if condition
        if(x>y || x >z){
            System.out.println(x);
        }
        else if(y > x && y > z){
            System.out.println(y);
        }
        else{
            System.out.println(z);
        }
    }
}