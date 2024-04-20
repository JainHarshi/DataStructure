package Two_Pointers;
//import java.util.Arrays;
import java.util.Arrays;

public class ReverseAtSpecificIndex {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        int temp =0;
        int start =0;
        int end = 2;
        for( start =0 ; start < (start+end)/2 ; start++){
            int j = arr.length-1;
            temp = arr[end-start];
            arr[end-start] = arr[start];
            arr[start] = temp;


        }
        System.out.println(Arrays.toString(arr));
    }
}
