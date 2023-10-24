package HASHING;

import java.util.HashMap;

public class Q11_Number_of_pair {
    public static int maxOperations(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);
        }
        // for (Map.Entry<String, String> set :
        //          foodTable.entrySet()) {
        // Printing all elements of a Map
        // System.out.println(set.getKey() + " = "
        //                    + set.getValue());
//    for(Map.Entry<Integer, Integer> map : hm.entrySet()){
        for (int i = 0; i < nums.length; i++) {
            if (hm.containsKey(k - nums[i])) {
                if (nums[i] != k - nums[i]) {
                    count += Math.min(hm.get(nums[i]), hm.get(k - nums[i]));
                    hm.put(k - nums[i], 0);
                } else {
                    count += (hm.get(nums[i]) / 2);
                    hm.put(k - nums[i], 0);
                }


                //    hm.put(k-nums[i], 0);
            }
            // System.out.println(map.getKey());
            //    }
        }
        return count;
    }

    public static void main(String[] args) {
       int nums[] = new int[] {1,2,3,4};
       int k = 5;
        System.out.println(maxOperations(nums,k));
    }

    }
