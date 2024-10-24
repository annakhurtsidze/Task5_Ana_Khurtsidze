public class Task5 {
    public static void main(String[] args) {

        System.out.println(convertToCelsius(98.6));
    }


    public static double convertToCelsius(double temperature){
        return (temperature-32)*5/9;
    }
}
