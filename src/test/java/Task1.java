import java.sql.SQLOutput;
import java.util.Scanner;

public class Task1 {


    public static void main(String[] args) {
        System.out.println("Please enter number: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        System.out.println("Is " + num + " even? " + isEven(num));
    }


    public static boolean isEven(int i){
        if(i%2 == 0){
            return true;
        }else {
            return  false;
        }
    }
}
