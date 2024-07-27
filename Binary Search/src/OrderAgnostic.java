public class OrderAgnostic {
    public static void main(String[] args) {
        int[] arr = {99,55,22,9,7,4,2,1};
        int target = 2;

        System.out.println(orderAgnosticBS(arr, target));
    }
    public static int orderAgnosticBS(int[] arr , int target){
        int start = 0;
        int end = arr.length -1;

//        boolean isAsc;
//        if(arr[start]<arr[end]){
//            isAsc = true;
//        }
        // This can be written as
        boolean isAsc = arr[start]<arr[end];
        while (start<end){


            //Uk this. Check the Binary Search code.
        int mid = start + (end-start)/2;

        if(arr[mid] == target){
            return mid;
        }

        if(isAsc){
            if(target > mid){
                start = mid+1;
            }
            else {
                end = mid-1;
            }

        }
        else {
            if (target < mid){
                start =  mid+1;
            }
            else{
                end = mid-1;
            }
        }}

        return -1;

    }
}
