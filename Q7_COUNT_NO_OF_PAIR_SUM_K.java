package HASHING;

public class Q7_COUNT_NO_OF_PAIR_SUM_K {
//    Q https://leetcode.com/problems/count-number-of-pairs-with-absolute-difference-k/

    public int countKDifference(int[] nums, int k) {
        int count =0;
        for(int i =0 ; i<nums.length -1 ; i++){
            for(int j =i+1 ; j<nums.length ; j++){
                if(Math.abs(nums[i]-nums[j]) == k) count++;
            }
        }    return count;
    }
}
