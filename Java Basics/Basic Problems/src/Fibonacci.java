public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("Fibonacci Series with first 20 numbers");

        int n1=0;
        int n2=1;
        int n3;

        System.out.print(n1 + " " + n2);

        for(int i=2;i<20;i++){
            n3 = n1 + n2;
            System.out.print(" " + n3);

            n1 = n2;
            //You cant put n3 in n2 before putting data of n2 to n1.
            // It causes some issue and actually doubles the numbers
            n2 = n3;

        }

    }
}
