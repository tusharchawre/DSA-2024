import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {

        int[] arr = {5,4,3,2,1};

        selection(arr);

        System.out.println(Arrays.toString(arr));

    }

    public static void selection(int[] arr){
        for(int i = 0; i<arr.length;i++){
            int last = arr.length - i-1;// this decides where to put the number after picking it

            int maxIndex = getMax(arr,0,last); // this gets the max number
            swap(arr,maxIndex,last);
        }
    }


    public static void swap(int[] arr, int first, int last){
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;

    }

    public static int getMax(int[] arr, int start, int end){
        int max = start;
        for(int i=0; i<=end;i++){
            if(arr[i]>arr[max]){
                max = i;
            }
        }

        return max;
    }
}
