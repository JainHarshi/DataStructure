package Binary_search;

public class Find_First_and_Last_Position_of_Element_in_Sorted_Array {

    //BRUTE FORCE
//    public int[] searchRange(int[] nums, int target) {
//        int f = -1;
//        int l = -1;
//        for(int i =0 ; i<nums.length ; i++)   {
//            if(nums[i] == target && f == -1){
//                f = i;
//            }
//            if(nums[i] == target){
//                l = i;
//            }
//        }
//        return new int[] {f,l};
//    }


    public int[] searchRange(int[] nums, int target) {
        int n =nums.length;
        int l =0;
        int r =  n-1;
        int first = -1;
        int last = -1;
        first = lower(nums, target);
        last = upper(nums, target);
        return new int[] {first,last};

    }
    public int lower(int[] nums , int target){
        int n =nums.length;
        int l =0;
        int r =  n-1;
        int first = -1;
        while(l<= r){
            int mid = (l+r)/2;
            if(nums[mid] == target) {
                r = mid-1;
                first = mid;
            }
            else if(nums[mid] < target){
                l = mid+1;
            }
            else if(nums[mid] > target){
                r = mid-1;
            }
        }
        return first;
    }
    public int upper(int[] nums , int target){
        int n =nums.length;
        int l =0;
        int r =  n-1;
        int last = -1;
        while(l<= r){
            int mid = (l+r)/2;
            if(nums[mid] == target) {
                l = mid+1;
                last = mid;
            }
            else if(nums[mid] < target){
                l = mid+1;
            }
            else if(nums[mid] > target){
                r = mid-1;
            }
        }
        return last;
    }}
