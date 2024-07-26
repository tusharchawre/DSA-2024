public class RangeSearch {
    public static void main(String[] args) {
        int[] arr = {1,6,3,2,24,23,1,5,87,9,2,3,3,43,4645,3,1};
        int target =  23;
        int start = 2;
        int end = 3;

        System.out.println(LinearRangedSearch(arr, target, start ,end));
    }

    public  static boolean LinearRangedSearch(int[] arr, int target, int start, int end){
        if (arr.length==0){
            return false;
        }
        //Looping the Array from start point to end point.
        for(int i = start ; i<end ; i++){
            if(arr[i] == target){
                return true;
            }

        }
        return false;
    }
}
