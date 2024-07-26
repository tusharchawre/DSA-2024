import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//
//        int n = in.nextInt();


        for (int i = 100; i < 1000; i++) {
            if (Check(i)){
                System.out.println(i);
            }

        }




    }


    public static boolean Check(int n){
        int original = n;
        int result = 0;
        if (n<0){
            return false;}
        else{

            while(n>0){
                int digit = n%10;
                result =  result + digit*digit*digit;
                n= n/10;
            }
            return original== result;




        }


    }
}
