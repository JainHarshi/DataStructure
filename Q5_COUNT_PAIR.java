package HASHING;

import java.util.*;

public class Q5_COUNT_PAIR {
    public int getPairsCount(int[] arr, int n, int k) {
        int ans =0;
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        for(int i =0 ; i<arr.length ; i++){
            int a = k-arr[i];
            if(hm.containsKey(a)) {ans = ans + hm.get(a);
                hm.put(arr[i], (hm.getOrDefault(arr[i],0)) +1);
            }
            else if(hm.containsKey(arr[i])) hm.put(arr[i], (hm.get(arr[i]) +1));
            else hm.put(arr[i] , 1);
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,1,2,11,5,2,3,1,7,3,2,6,3,2};
        int n = arr.length;
        Q5_COUNT_PAIR obj = new Q5_COUNT_PAIR();
        System.out.println(obj.getPairsCount(arr,n,4));
    }
}
