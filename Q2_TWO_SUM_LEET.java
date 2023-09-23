package HASHING;
import java.util.*;
public class Q2_TWO_SUM_LEET {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int i =0 ; i<nums.length ; i++){
            if(hm.containsKey(target-nums[i])){
                int j = hm.get(target-nums[i]);
                return new int[] { j, i};
            }else{
                hm.put(nums[i] , i);
            }
        } return new int[]{-1,-1};
    }

    public static void main(String[] args) {
        int num[] = {2,7,11,15};
        int target = 9;
        Q2_TWO_SUM_LEET obj = new Q2_TWO_SUM_LEET();
        System.out.println(Arrays.toString(obj.twoSum(num, target)));
    }
}
