import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        System.out.println(CheckPrime(n));
    }

    public static boolean CheckPrime(int n) {
        int count = 2;
        if(n<0){
            return false;
        }
        else{
            while(count*count < n){
                int rem = n%count;
                if(rem == 0){
                    return false;
                }
                count++;

            }
            return count*count > n;

        }
    }


}