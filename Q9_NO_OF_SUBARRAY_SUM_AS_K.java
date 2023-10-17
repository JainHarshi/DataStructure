package HASHING;

import java.util.HashMap;

public class Q9_NO_OF_SUBARRAY_SUM_AS_K {
    static int findSubArraySum(int arr[], int N, int k)
    {
        HashMap<Integer , Integer> hm = new HashMap<Integer , Integer>();
        int prefixSum = 0;
        int count = 0;
        hm.put(0,1);
        for(int i =0 ; i<arr.length ; i++){
            prefixSum += arr[i];
            if(hm.containsKey(prefixSum-k)) {count = count + hm.get(prefixSum-k);}
            //else if((prefixSum) == k) {count++;}
            hm.put(prefixSum, hm.getOrDefault(prefixSum, 0)+1);
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(findSubArraySum(new int[] {10 , 2, -2, -20, 10},5,-10));
    }
}
