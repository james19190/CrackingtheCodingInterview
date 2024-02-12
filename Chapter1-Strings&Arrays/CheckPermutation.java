import java.util.HashMap;
import java.util.Arrays;


public class CheckPermutation {
    public static void main(String[] args) {
        String perm1 = "apple";
        String perm2 = "pplea";
        String nonPerm = "qehfouewqh";

        System.out.println(HashMapMethod(perm1, perm2));
        System.out.println(HashMapMethod(perm1, nonPerm));

        System.out.println(sortMethod(perm1, perm2));
        System.out.println(sortMethod(perm1, nonPerm));


    }


    public static boolean HashMapMethod(String s1, String s2){

        HashMap<Character, Integer> s1hash = new HashMap<>();
        for (int i = 0; i < s1.length(); i++){  
            if (!s1hash.containsKey(s1.charAt(i))){
                s1hash.put(s1.charAt(i), 0);
            }
            else {
                s1hash.put(s1.charAt(i), s1hash.get(s1.charAt(i)) + 1);
            }
        }
        
        HashMap<Character, Integer> s2hash = new HashMap<>();
        for (int i = 0; i < s2.length(); i++){  
            if (!s2hash.containsKey(s2.charAt(i))){
                s2hash.put(s2.charAt(i), 0);
            }
            else {
                s2hash.put(s2.charAt(i), s2hash.get(s2.charAt(i)) + 1);
            }
        }

        if (s2hash.equals(s1hash)) return true;
        else return false;
    }


    public static boolean sortMethod(String s1, String s2){

        char[] s1array = s1.toCharArray();
        Arrays.sort(s1array);

        char[] s2array = s2.toCharArray();
        Arrays.sort(s2array);

        if (Arrays.equals(s1array, s2array)) return true;
        else return false;
    }
}



/*
Problem - Given two strings, write a method to decide if one is a permutation of the other

Questions
1) is white space considered as characters?
2) Should we consider capital letters and lowercase letters to be the same?
3) can an empty string be given as an input?

Method 1) HashMap ~ O(n)
- For each string, insert string chars into a seperate hashmap ~ O(n)
- compare hashsets ~ O(n)
- return true if identical, false if different

Method 2) Sort then compare ~ O(n log n)
- Sort each string ~ O(n log n)
- compare string ~ O(n)
*/