package HASHING;

public class Q6_First_Unique_Character {
//    public int firstUniqChar(String s) {
//        int ans =-1;
//        int arr[] = new int[26];
//        for(int i =0 ; i<s.length() ; i++){
//            arr[s.charAt(i) -'a']++;
//        }
//        for(int i =0 ; i<s.length() ; i++){
//            if(arr[s.charAt(i) - 'a'] == 1) return i;
//        }
//        return -1;
//    }
public int firstUniqChar(String s) {}
    public static void main(String[] args) {
        int arr[] = {1,2,1,2,11,5,2,3,1,7,3,2,6,3,2};
        int n = arr.length;
        String s = "leetcode";
        Q6_First_Unique_Character obj = new Q6_First_Unique_Character();
        System.out.println(obj.firstUniqChar(s));
    }
}
