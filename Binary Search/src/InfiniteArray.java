// Amazon Interview Question
// Basically the problem is, this is a infinite array so you cant use arr.length



public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6,8,9,10, 12,13,14,15};
        int target =  3;
        System.out.println(ans(arr,target));

    }

    public static int ans(int[] arr, int target){
        int start = 0;
        int end = 1;

        while(target > end){
            // storing the start in temp to set new start
            int temp = start;
            //Doubling the size of the search block by increasing end exponentially
            end = end + (end -start +1)*2;
            // we could have did this step before but we need to use start in last step.
            start = temp;
        }



       return binarySearch(arr,target,start,end);
    }


    // basic binary search but with start and end parameters from other function.
    public static int binarySearch(int[] arr, int target , int start, int end){
        while(start<=end){
            int mid =  start + (end-start)/2;

            if(target>arr[mid]){
                start = mid + 1;

            }
            else if (target < arr[mid]){
                end = mid -1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }




}
