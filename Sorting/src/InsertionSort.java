//https://www.youtube.com/watch?v=0lOnnd50cGI

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int[] arr = {1,2,3,5,6};

        insertion(arr);

        System.out.println(Arrays.toString(arr));

    }

    public static void insertion(int[] arr){
        for (int i = 0; i < arr.length-1; i++) { //THis loops goes throught the array
            for(int j = i+1; j>0; j--){
                // this loop swaps the numbers and then moves one step back index and
                // check if there are any other swaps to do.
                // Like if 2,3 index are swapped then j-- and it'll check for 1,2 index and go on till it breaks.
                if(arr[j]<arr[j-1]){
                   swap(arr, arr[j], arr[j-1]);
                }
                else {
                    break;
                }
            }

        }
    }

    public static void swap(int[] arr, int first, int last){
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;

    }
}


