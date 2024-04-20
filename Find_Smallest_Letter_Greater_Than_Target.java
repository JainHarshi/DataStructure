package Binary_search;

public class Find_Smallest_Letter_Greater_Than_Target {
    public static char nextGreatestLetter(char[] arr, char target) {
        int start = 0;
        int  end = arr.length -1;
        char ans = arr[0];
        while(end >= start){
            int mid = start + (end-start)/2;
            if(arr[mid] == target || arr[mid] < target){
                start = mid +1;
            }
            else if(arr[mid] > target){
                ans = arr[mid];
                end = mid -1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(nextGreatestLetter(new char[] {'c','f','j'} ,'a'));
    }
}
