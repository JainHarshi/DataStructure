package Two_Pointers;

public class MergeArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i =0;
        int j =0;
        int z =0;
        int arr[] = new int[m+n];
        while(i< m && j<n ){
            if(nums1[i] <= nums2[j] ){
                arr[z] = nums1[i];
                i++;
                z++;
                // System.out.println("arr " +Arrays.toString(arr));
            }else{
                arr[z] = nums2[j];
                j++;
                z++;
                // System.out.println("arr " +Arrays.toString(arr));
            }
        }
        while(i< m){
            arr[z] = nums1[i];
            i++;
            z++;
            //  System.out.println("arr " +Arrays.toString(arr));
        }
        while(j<n){
            arr[z] = nums2[j];
            j++;
            z++;
            //  System.out.println("arr " +Arrays.toString(arr));
        }
        for(int p =0 ; p<arr.length ; p++){
            nums1[p] = arr[p];
        }

    }
}
