import java.util.Arrays;

public class TwoDArraysSearch {
    public static void main(String[] args) {
        int[][] arr = {
                {1,3,3},
                {7,5,3,2,2},
                {6,2,9,4,2,3,3,4,34}
        };

        int target = 4;

        System.out.println(Arrays.toString(SearchArray(arr, target)));


        System.out.println(MaxIn2d(arr));;



    }

    public static String MaxIn2d(int arr[][]){
        int max = 0;
        int[] coordinates = new int[2];
        //Searching the Arrays with for loops. For each row and respective colums
        for(int row=0; row<arr.length;row++){
            for(int col=0; col<arr[row].length;col++){
                if(max<arr[row][col])
                    max = arr[row][col];
                coordinates[0] = row;
                coordinates[1] = col;



            }

        }


        return max + "\n,The max is at" + Arrays.toString(coordinates) ;
    }




    public  static int[] SearchArray(int[][] arr , int target){
        if(arr.length == 0){
            return new int[]{-1,-1};
        }
        //Searching the Arrays with for loops. For each row and respective colums
        for(int row=0; row<arr.length;row++){
            for(int col=0; col<arr[row].length;col++){
                if(arr[row][col]==target)
                    return new int[] {row,col};
            }

        }
        return new int[] {-1,-1};
    }





}
