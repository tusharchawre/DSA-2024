import java.util.Arrays;
// 34. Find First and Last Position of Element in Sorted Array
// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
public class StartAndEnd {

    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 7;

        System.out.println(Arrays.toString(searchRange(nums, target)));
    }

    public static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};
        //Calling the function to find first and last occurrences
        int start = FindStartAndEnd(nums, target, true);
        int end = FindStartAndEnd(nums,target, false);
        ans[0] = start;
        ans[1] = end;

        return ans;


    }

    public static int FindStartAndEnd(int[] arr, int target, boolean takeFirstOccurrence){
        int ans = -1;
        int start = 0;
        int end = arr.length - 1 ;


        while(start <= end){
            int mid = start + (end - start) /2;

            if(target < arr[mid]){
                //normal BS
                end = mid - 1;
            }
            else if(target > arr[mid]){
                //normal BS
                start = mid + 1;
            }
            else{
                //if Mid = target we still search the other parts of the array
                ans = mid;
                //for searching the occurrences on left side of mid
                if (takeFirstOccurrence){
                    end = mid - 1;
                }
                // for checking occurrences right side of the mid
                // both triggered by the boolean
                else{
                    start = mid + 1;
                }


            }


        }
        // return the index of the number

        return ans;


    }


}
