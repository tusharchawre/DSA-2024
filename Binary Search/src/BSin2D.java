import java.util.Arrays;

//https://www.youtube.com/watch?v=RhPqIIOUiS8
// This guy is crazy.


public class BSin2D {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };

        int target =7;

        int rowIndex = findPotentialRow(arr, target);
        if(rowIndex == -1){
            System.out.println(Arrays.toString(new int[]{-1,-1}));
        }
        else {
            System.out.println(Arrays.toString(findInRow(arr,rowIndex,target)));
        }




    }

    public static int findPotentialRow(int[][] arr, int target){
        int rStart = 0;
        int rEnd = arr.length-1; // pointer at last row

        while(rStart<=rEnd){
            int mid = rStart + (rEnd-rStart)/2;


            if(target >= arr[mid][0] && target <=arr[mid][arr[0].length-1]){
                return mid;
                // find the potential row
            }

            else if(target>arr[mid][0]){
                rStart = mid+1;
            }
            else if(target<arr[mid][0]){
                rEnd = mid-1;
            }



        }
        return -1;

    }


    public static int[] findInRow(int[][] arr, int rowIndex, int target){
        int colStart = 0;
        int colEnd = arr[rowIndex].length-1;

        while (colStart<=colEnd){
            int mid = colStart + (colEnd-colStart)/2;

            if(target == arr[rowIndex][mid]){
                return new int[] {rowIndex,mid};
            }
            else if(target< arr[rowIndex][mid]){
                colEnd = mid-1;
            } else  {
                colStart = mid+1;

            }


        }
        return new int[] {-1,-1};
    }




}
