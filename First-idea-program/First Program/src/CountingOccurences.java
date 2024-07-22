public class CountingOccurences {
    public static void main(String[] args) {
        int n = 1233212312;
        int count = 0;


        while ( n != 0){
            int result = n % 10;
            if(result == 2){
                count++;
            }
            n = n/10;

        }
        System.out.println(count);







    }
}
