package Two_Pointers;

import java.util.Arrays;

public class Remove_Element {
    public static int removeElement(int[] arr, int val) {
        int i=0;
        int j=0;
        while(j<arr.length){
            if(arr[j]!=val){
                arr[i]=arr[j];
                i++;
            }
            j++;
        }
        return i;
    }

    public static void main(String[] args) {
        int[] arr  = new int[] {3,2,2,3};
        System.out.println(removeElement(arr, 3));
        System.out.println(Arrays.toString((arr)));

    }
}
