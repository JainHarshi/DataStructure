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
                //  System.out.println(t);
                if(i>0){
                    while(i>0){
                        arr[i] = arr[j];
                        i--;
                        j--;
                        // System.out.println(Arrays.toString(arr));
                    }
                    // System.out.println("t");
                    arr[0] =t;}
                // System.out.println(arr[0]);
            }
        }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int k = 3;
        rotate(arr, k);
        System.out.println(Arrays.toString(arr));
    }
    }

