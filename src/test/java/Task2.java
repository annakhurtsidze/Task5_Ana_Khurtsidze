public class Task2 {
    public static void main(String[] args) {
        System.out.println(findLargest( 45, 13, 29));


    }


    public static int findLargest(int a, int b, int c){
        int max = 0;
        max =a ;

        if(b>a && b>c){
            max = b;
            return max;
        } else if (c>a && c>b ) {
            max =c ;
            return max;
        }
        return max;
    }
}
