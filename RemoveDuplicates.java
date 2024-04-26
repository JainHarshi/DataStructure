package Two_Pointers;

public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
        int i =0;
        int j = 1;
        int ans =1;


        while(j>i && j<nums.length){
            if(nums[i] != nums[j]){
                ans++;
                nums[i+1] = nums[j];
                i++;
                j++;
            }
            else{
                j++;
            }
        }
        return ans;

    }

    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{1,1,2}));
    }
}
