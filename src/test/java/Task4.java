public class Task4 {
    public static void main(String[] args) {
        greet();
        greet("Dobby");

    }


    public static void greet(){
        System.out.println("Hello!");
    }

    public static void greet(String name){
        System.out.println("Hello " +name);
    }
}
