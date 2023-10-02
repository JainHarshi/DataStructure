package POTD;

public class Leet_Reverse_Words_in_String {
    public String reverseWords(String s) {
        String[] arr = s.split(" ");
        String ans = "";

        for(int i =0 ; i<arr.length ; i++){
            for(int j = arr[i].length() -1 ; j>= 0 ; j--){
                ans = ans + arr[i].charAt(j);
            } ans = ans + " ";
        }
        return ans.trim();
    }

    public static void main(String[] args) {
        Leet_Reverse_Words_in_String obj = new Leet_Reverse_Words_in_String();
        System.out.println(obj.reverseWords("Let's take LeetCode contest"));
    }
}
