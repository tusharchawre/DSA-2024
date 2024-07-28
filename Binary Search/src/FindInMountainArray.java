//This is my approach for this question.
// Really proud of my self.

public class FindInMountainArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 1};
        int target = 1;

        // a function to get the peak
        int peak = peak(arr);





        //after peak, the left side is asc so search in that array as ascending
        int asc = search(arr, target, 0, peak, true);
        //right side of peak is dec, so search in that array as descending
       int dec = search(arr, target, peak + 1, arr.length - 1, false);

       if(asc == -1){
           System.out.println(dec);
       } else{
           System.out.println(asc);
       }


    }

    public static int search(int[] arr, int target, int start, int end, boolean isAsc) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (isAsc) {
                if (arr[mid] > target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (arr[mid] < target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }

    public static int peak(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start;
    }
}
