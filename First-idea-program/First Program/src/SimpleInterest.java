import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        System.out.println("Enter the P T R in single line with space in between");
        Scanner input = new Scanner(System.in);

        float p = input.nextFloat();
        float t = input.nextFloat();
        float r = input.nextFloat();

        float si = p * t * r / 100;
        System.out.println("Your Simple Interest on this is " + si);
    }
}
