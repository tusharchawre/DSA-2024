import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        // The array should be 1 to n
        int[] arr  = {2,1,3,4,6,5};

        cyclic(arr);
        System.out.println(Arrays.toString(arr));

    }

    static public void cyclic(int[] arr){
        int i = 0;
       while(i < arr.length){
           // if 3 is not at 2nd index swap

          if(arr[i] != arr[arr[i]-1]){
              swap(arr, i , arr[i]-1);
          }

          else{
              // else increment i
              i++;
          }

       }
    }

    public static void swap(int[] arr, int first, int last){
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }
}
