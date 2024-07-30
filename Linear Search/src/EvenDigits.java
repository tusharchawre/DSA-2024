public class EvenDigits {
    public static void main(String[] args) {
        int[] arr = {12,346,34532,123,12312,67,351,12};

        System.out.println(EvenDigitsNumbers(arr));


    }
   public static int EvenDigitsNumbers(int[] arr){
        int count = 0;
       for (int i = 0; i < arr.length; i++) {
           if (even(arr[i])) { //Calling a function to determine the even test
               count++;
           }
       }
       return count;
   }



   public  static boolean even(int num){
        int digits = 0;
        while(num>0){
            num = num/10; //Dividing it by 10 and the counting every digit
            digits++;

        }

        if (digits % 2 == 0){
            return true;
        }
        return false;
   }



}
