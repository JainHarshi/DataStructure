package HASHING;

import java.util.ArrayList;
import java.util.HashMap;

public class Q1_FREQ_OF_ELE {
    public ArrayList<Integer> freq(int arr[] , int n , int querry[]){
        HashMap<Integer , Integer> hm = new HashMap<>();
        ArrayList<Integer> aL = new ArrayList<>();
        for(int i =0 ; i<n ; i++){
           if(hm.containsKey(arr[i])){
               hm.put(arr[i] , hm.get(arr[i]) +1);

           }
           else{hm.put(arr[i] , 1);}

        }for(int i =0 ; i < querry.length ; i++){
            if(hm.containsKey(querry[i])) aL.add(hm.get(querry[i]));
            else aL.add(-1);
        }
        return aL;
    }
    public static void main(String[] args) {
int arr[] = {1,2,1,2,11,5,2,3,1,7,3,2,6,3,2};
int n = arr.length;
int querry[] = {1,2,3,4,7,5,11,34};
Q1_FREQ_OF_ELE obj = new Q1_FREQ_OF_ELE();
        System.out.println(obj.freq(arr,n,querry));
    }
}
