class logical{
    public static void main(String args[]){
        int a = 9;
        int b = 6;
        int c = 3;
        int d = 4;
        // boolean result = c < d && a > b;
        // boolean result = c > d || a < b;
        boolean result = c < d && a > b;
        System.out.println(!result);

    }
}