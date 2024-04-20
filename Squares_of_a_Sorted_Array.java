package Two_Pointers;

public class Squares_of_a_Sorted_Array {
    public int[] sortedSquares(int[] nums) {
        int ans[] = new int[nums.length];
        int var1, var2;
        int index = ans.length-1;
        int i =0 ;
        int j = nums.length -1;
        while(i<=j){
            var1 = nums[i]*nums[i];
            var2 = nums[j]*nums[j];
            if(var1 > var2){
                ans[index] = var1;
                i++;
            }
            if(var1 <= var2){
                ans[index] = var2;
                j--;
            }
            index--;
        }

        return ans;
    }
}
