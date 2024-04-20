package Two_Pointers;

import java.util.ArrayList;

public class Find_the_closest_pair_from_two_arrays {
    public static ArrayList<Integer> printClosest (int arr[], int brr[], int n, int m, int x) {
        int f=-1;
        int se=-1;
        int min=Integer.MAX_VALUE;
        ArrayList<Integer> l=new ArrayList<>();
        int i=0;
        int j=m-1;
        while(i<n&& j>=0){
            int s=arr[i]+brr[j];
            if(Math.abs(s-x)<min){
                min=Math.abs(s-x);
                f=i;
                se=j;
            }
            if(s>x){
                j--;
            }
            else if(s<x){
                i++;
            }
            else{
                f=i;
                se=j;
                break;
            }
        }
        l.add(arr[f]);
        l.add(brr[se]);
        return l;

    }
}
