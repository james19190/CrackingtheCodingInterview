import java.util.HashSet;
import java.util.Arrays;

public class IsUnique {
    public static void main(String[] args) {
        String uniqueString = "asdfghjkl";
        String nonUniqueString = "appa";

        System.out.println(bruteForce(uniqueString));
        System.out.println(bruteForce(nonUniqueString));

        System.out.println(HashSet(uniqueString));
        System.out.println(HashSet(nonUniqueString));

        System.out.println(sortThenCompare(uniqueString));
        System.out.println(sortThenCompare(nonUniqueString));

    }


    public static boolean bruteForce(String input){

        for (int i  = 0; i < input.length(); i++){
            for (int j = 0; j < input.length(); j++){
                if (i == j) continue;
                else if (input.charAt(i) == input.charAt(j)) return false;
            }
        }
        return true;
    
    }

    
    public static boolean HashSet(String input){
        HashSet<Character> dict = new HashSet<>();
        for (int i = 0; i < input.length(); i++){
            if (dict.contains(input.charAt(i))) return false;
            else {
                dict.add(input.charAt(i));
            }
        }
    
    
        return true;
    }

    public static boolean sortThenCompare(String input){
        char[] sortedInput = input.toCharArray();
        Arrays.sort(sortedInput);

        for (int i = 0; i < input.length() - 1; i++){
            if (sortedInput[i] == sortedInput[i+1]) return false;
        }

        return true;
    }
}




// Implement an algorithm to determine if a string has all unique characters. What if you cannot use additional data structures?

/* 
Method 1) Brute Force ~ O(n^2) & O(n) 
- init isUnique to true ~ O(1)
- loop through each character in a string ~ O(n^2)
    - compare each char with every other char and see if there is a match?
- if match occurs, change isUnique to true ~ O(1)
- return isUnique ~ O(1)


Method 2) HashSet ~ O(n) & O(n)
- init isUnique to true ~ O(1)
- init HashSet<Character> ~ O(1)
- loop through each character in a string ~ O(n)
    - if key doesn't exist, add char ~ O(1) 
    - if key exists, return false ~ O(1)
- return false ~ O(1)

Method 3) Sort then compare ~ O(n) & O(1)
- Sort String ~ O(log n) 
- loop through the string to compare if the next char is equal to the current char ~ O(log n)
- if equal, return false ~ O(1)
- return true ~ O(1)
*/

