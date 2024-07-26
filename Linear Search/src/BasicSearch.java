public class BasicSearch {
    public static void main(String[] args) {
        int[] arr = {1,4,2,5,3,6,9,3,2,5,8};
        int target = 100;

        System.out.println(LinearSearch(arr,target));



    }
    public static boolean LinearSearch(int[] arr, int target){
        if (arr.length == 0) return false;

        for(int i: arr){
            if(arr[i]==target){
                return  true;
            }


        }


        return false;
    }
}
