public class PeakOfMount {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,4,3,1};

        System.out.println(arr[PeakSearch(arr)]);
    }

    public static int PeakSearch(int[] arr){
        int start =  0;
        int end = arr.length - 1;


        while(start < end){
            int mid = start  + (end-start)/2;
            // check if we tapped in the ascending part of the array
            if (arr[mid]<arr[mid+1]){
                start = mid + 1;
            } else {
                // when we are in descending part of the array
                end = mid;
            }
        }

        //This is the moment where the while loop is done
        // the end and the start pointer point here
        // and this is the peak this is messiah

        return start; // can return end also.
    }




}
