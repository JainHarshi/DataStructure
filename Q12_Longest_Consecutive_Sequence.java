package HASHING;

import java.util.HashMap;

public class Q12_Longest_Consecutive_Sequence {
    public int longestConsecutive(int[] nums) {
        HashMap<Integer , Boolean> present = new HashMap<Integer , Boolean>();
        HashMap<Integer , Boolean> checked = new HashMap<Integer , Boolean>();
        for(int i =0 ; i<nums.length ; i++){
            present.put(nums[i] , true);
        }
        int ans =0;
        for(int i = 0 ; i<nums.length ; i++){
            if(!checked.containsKey(nums[i]) && !present.containsKey(nums[i]-1)){
                int current =0;
                int start = nums[i];
                while(present.containsKey(nums[i])){
                    current++;
                    checked.put(nums[i], true);
                    nums[i]++;
                }
                ans = Math.max(current , ans);
            }
        }  return ans;
    }
}
