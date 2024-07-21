import java.util.Scanner;

public class TempConv {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Temp in Degree Celsius");

        float temp = input.nextInt();
        float result = (temp* 1.8f) + 32;
        System.out.println("The Temp in F is "+ result);
        }
}
