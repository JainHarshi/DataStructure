package Two_Pointers;
import java.util.Arrays;
public class ReverseArray {




        public static void main(String[] args) {
            int arr[] = {1,2,3,4};
            int temp =0;
            for(int i =0 ; i< arr.length/2 ; i++){
                int j = arr.length-1;
                temp = arr[j-i];
                arr[j-i] = arr[i];
                arr[i] = temp;


            }
            System.out.println(Arrays.toString(arr));
        }

}
