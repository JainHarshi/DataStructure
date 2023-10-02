package POTD;

public class Leet_Reverse_Words_in_String_optimise {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            result.append(new StringBuilder(word).reverse()).append(" ");
        }

        return result.toString().trim();
    }


    public static void main(String[] args) {
        Leet_Reverse_Words_in_String_optimise obj = new Leet_Reverse_Words_in_String_optimise();
        System.out.println(obj.reverseWords("Let's take LeetCode contest"));
    }
}
