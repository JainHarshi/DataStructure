package HASHING;

import java.util.HashMap;

public class Q10_Longest_subarray_of_sum_k {
    public static int lenOfLongSubarr (int a[], int n, int k) {
        int sum =0;
        int maxi = 0;
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        for(int i =0 ; i<n ; i++){
            sum += a[i];
            // hm.put(sum , i);
            if(sum == k) {maxi =  Math.max(maxi, i+1);

            }
            if(hm.containsKey(sum-k)) {maxi = Math.max(maxi, i - hm.get(sum-k));}
            if(!hm.containsKey(sum)){hm.put(sum, i);

            }
        }
        return maxi;
}
    public static void main(String[] args) {
        System.out.println(lenOfLongSubarr(new int[] {10, 5, 2,5,7,1} , 6, 15));
    }}


