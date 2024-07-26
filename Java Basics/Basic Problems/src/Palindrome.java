public class Palindrome {
    public static void main(String[] args) {
        int n = 12313;
        int reverse  = 0 ;

        for (int i = 0; i < 5; i++) {
            int result = n%10;
            reverse =  reverse * 10 + result;
            n = n/10;


        }
        System.out.println(reverse);

    }



    //This was my approach using an Array
//        int n = 12345;
//        int[] arr = new int[5];
//
//       for(int i=0; i < 5; i++) {
//           if(n > 0){
//               int result = n % 10;
//
//               arr[i] = result;
//               n=n/10;
//
//           }
//        }
//
//        for(int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]);
//        }
//
//
//    }





}
