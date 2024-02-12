import java.util.*;

public class palindromePermutation {
    public static void main(String[] args){
        String palEven = "aapp";
        String palOdd = "aappl";
        String nonPal = "aaaapl";

        System.out.println(isPalinPerm(palEven));
        System.out.println(isPalinPerm(palOdd));
        System.out.println(isPalinPerm(nonPal));




    }

    public static boolean isPalinPerm (String input){
        
        Map<Character, Integer> dict = new HashMap<>();
        int wordCount = 0;

        for (int i = 0; i < input.length(); i++){
            if (input.charAt(i) == ' ') continue;

            //existing character
            else if (dict.containsKey(input.charAt(i))){
                dict.put(input.charAt(i), dict.get(input.charAt(i)) + 1);
                wordCount++;
            }

            //new character
            else {
                dict.put(input.charAt(i), 1);
                wordCount++;
            }

        }

        Collection<Integer> values = dict.values();


        // length is even
        if (wordCount%2 == 0){
            for (Integer value : values){
                if (value%2 != 0) return false;
            }
            return true;
        }

        // length is odd
        else {
            int oddCount = 0;
            for (Integer value : values){
                if (value%2 != 0) oddCount++;
                if (oddCount > 1) return false;
            }
            return true;
        }

    }
}

/*
check if a string is a permutation of a palindrome

Questions
1) Are spaces ignored? yes
2) are capital letters ignored? yes
3) Can an empty string be given as an input? if so is it a palindrome?

Method 1 - hashmap method ~ O(n)
- create a hashmap with key = char, value = count ~ O(1)
- initialize word count to 0
- add each character to the hash map (if space, ignore) and add word count ~ O(n)
- if word count is even & all values are even - return true, else return false ~ O(n)
- if word count is odd & all values except 1 is even - return true, else return false ~ O(n)


 */