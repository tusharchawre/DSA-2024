public class CeilingAndFloor {
    public static void main(String[] args) {
        int[] arr = {1,3,6,8,9,12,34,77,99,100};

        int target = 35;

        System.out.println(FindCAndF(arr, target));


    }
    public static String FindCAndF(int[] arr, int target){
        int start = 0;
        int end  = arr.length - 1;

        while (start <=  end){
            int mid = start + (end-start)/2;

            if(arr[mid] == target){
                //If the target is present is the array
                return "Match Found at " + mid;
            }
            if(target< arr[mid]){
                end =  mid -1;
            }
            else{
                start = mid+1;
            }
        }


        //Instead of returning -1 when not found;
        // We are returning the number that is greater than target ie "start"
        // and number that is less than target ie "end"
        // Because the while loop ends when start > end -> Start is "Ceiling" and End  is "Floor"
        return ("The Floor is " + arr[end] + "\nThe Ceiling is " + arr[start] );
    }
}
