package Two_Pointers;

import java.util.Arrays;

public class Rotate_Optimise {

        public static void reverse(int[] arr , int i , int j){
            while(j>i){
                int t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
                i++;
                j--;

            }




        }
        public static void rotate(int[] arr, int k) {

            k = k%(arr.length);
            reverse(arr, 0 , arr.length-1);
            reverse(arr, 0 , k-1);
            reverse(arr, k , arr.length-1);

        }

    public static void main(String[] args) {
            int[] arr =  new int[]{1 , 2,3,4,5};
        rotate(arr , 2);
        System.out.println(Arrays.toString(arr));
    }
    }

