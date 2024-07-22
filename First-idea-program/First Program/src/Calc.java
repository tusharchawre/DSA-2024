import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Operator");
        int result=0;



        while(true){
            char op = in.next().trim().charAt(0);
            if (op =='+'|| op =='-'|| op =='*'|| op =='/' || op == '%' ){
                System.out.println("Enter the Numbers");
                int num1 = in.nextInt();
                int num2 =  in.nextInt();

                if(op == '+'){
                    result =  num1+num2;

                }
                if(op=='-'){
                    result =  num1-num2;

                } if(op=='*'){
                    result =  num1*num2;

                } if(op=='/'){
                    if(num1>num2){
                        result =  num1/num2;
                    }


                } if(op=='%'){
                    result =  num1%num2;

                }


                System.out.println(result);
            }

            else if ( op== 'x'||op=='X') {
                break;
            }




            else {
                System.out.println("Invalid Op");
            }


        }
    }
}
