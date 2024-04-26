package Two_Pointers;

import java.util.Arrays;

public class MoveZeroes {

        public static void moveZeroes(int[] nums) {
            int i = 0;
            int j = 1;
            while (j>i && j < nums.length && i< nums.length-1)  {
                if(nums.length > 1){
                    if(nums[i] == 0 && nums[j] != 0){
                        int temp = nums[i];
                        nums[i] = nums[j];
                        nums[j] = temp;
                        i++;
                        j++;
                    }
                    else if(nums[i] == 0 && nums[j] == 0){
                        j++;
                    }
                    else{

                        i++;
                        j++;
                    }
                }
            }
        }

    public static void main(String[] args) {
        int[] arr = new int[] {0,1,0,3,12};
        moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }
    }

