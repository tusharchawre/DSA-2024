public class BinarySearch {
    public static void main(String[] args) {
        //sorted array
        int[] arr = {-1,3,5,7,8,10,12,16,88,99,100};
        int target =  88;
        System.out.println(BinarySearchFunction(arr, target));

    }
    public static int BinarySearchFunction(int[] arr, int target){
        int start = 0;
        int end  = arr.length-1;

        while(start <= end)
        {
            // We don't use this because the start and end can be so big that they cant be contained in int type range.
//        int mid = (start + end) / 2
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            }
            if (target > arr[mid]) {
                start = mid + 1;
            } else {
                //Finds answer here
                return mid;
            }
        }

        return -1;

    }
}
