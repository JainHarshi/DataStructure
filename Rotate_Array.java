package Two_Pointers;

import java.util.Arrays;

public class Rotate_Array {

    public static void rotate(int[] arr, int k) {

        k = k%(arr.length);
        System.out.println(k);
        for(int z = 1 ; z <= k ; z++){
            int t = arr[arr.length-1];
            int i = arr.length-1;
            int j = arr.length-2;

            while(i>0){
                arr[i] = arr[j];
                i--;
                j--;

            }
            arr[0] =t;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int k = 3;
        rotate(arr, k);
        System.out.println(Arrays.toString(arr));
    }
    }

