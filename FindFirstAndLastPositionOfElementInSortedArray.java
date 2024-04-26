package Two_Pointers;

import java.util.Arrays;

public class FindFirstAndLastPositionOfElementInSortedArray {

        public  static int[] searchRange(int[] nums, int target) {
            int start =0;
            int end = nums.length-1;

            while(end>= start){
                int sum = nums[start] + nums[end];
                if( nums[start] == target && nums[end] == target ){
                    return new int[]{start , end};}
                else if(sum > 2*target){
                    end--;
                }
                else{
                    start++;
                }

            }
            return new int[] {-1,-1};
        }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(searchRange(new int[] {5,7,7,8,8,10},8)));
    }
    }

