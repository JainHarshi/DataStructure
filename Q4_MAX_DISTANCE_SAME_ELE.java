package HASHING;
import java.util.*;

public class Q4_MAX_DISTANCE_SAME_ELE {
    public int maxDistance(int arr[], int n)
    {
        int max =0;
        int dist =0;
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        for(int i =0 ; i<arr.length ; i++){
            if(!hm.containsKey(arr[i])) hm.put(arr[i] , i);
            else {
                dist = i -hm.get(arr[i]);
                max = Math.max(dist, max);}
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,1,2,11,5,2,3,1,7,3,2,6,3,2};
        int n = arr.length;
    Q4_MAX_DISTANCE_SAME_ELE obj = new Q4_MAX_DISTANCE_SAME_ELE();
        System.out.println(obj.maxDistance(arr,n));
    }
}
