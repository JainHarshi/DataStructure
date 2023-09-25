package HASHING;

public class Q3_PREFIX_ARRAY {
    public int prefixArray(int l , int r , int arr[]){
        int arr1[] = new int[arr.length +1];
        int prefixSpace[] = new int[arr.length +1];
        for(int i =1 ; i<= arr.length ; i++){
           arr1[i] = arr[i-1];
        }
        for(int i =1 ; i< arr1.length  ; i++){
         prefixSpace[i] = prefixSpace[i-1] + arr1[i];
        }
        return prefixSpace[r+1] - prefixSpace[l];
    }
    public static void main(String[] args) {
        int arr[] = {1,4,1};
Q3_PREFIX_ARRAY obj = new Q3_PREFIX_ARRAY();
        System.out.println(obj.prefixArray(1,1,arr));
    }
}
