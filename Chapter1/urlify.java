import java.util.*;

public class urlify {
    public static void main(String[] args) {
        String input = "James Kim 2017   ";
        String answer = "James%20Kim%202017";

        System.out.println(replaceMethod(input, 14));

        
        
    }
    
    public static String loopMethod(String val, int length){
        
        String url = new String();
        
        // for (int i = 0; i < length; i++){
        //     if (val.charAt(i) == ' '){
        //         url.append("%20");
        //     }
        //     else {

        //     }
        // }

        // for (int i = 0; i < )

        return url;
    }

    public static String replaceMethod(String val, int length){
        String url = val.substring(0, length);
        url = url.replace(" ", "%20");
        return url;
    }

}

/*
    Write a method to replace all spaces in a string with '%20'. Assume there is sufficient space, and true length is given as parameter

    Questions
    1) Are tailing and leading whitespaces considered?
    2) Will null strings be given as input?
    3) If whitespaces in the middle of the string is multiple, should %20 be written multiple times?

    Method 1) string.replace ~ O(n)
    - create a new substring with true length ~ O(1)
    - replace all spaces with '%20' ~ O(n)
    - return new value ~ O(1)

    Methof 2) loop Method
    - create queue
    - insert all chars (from pos 0 to index) into q
    - unqueue each char (if space, append '%20' instead of normal queue)
 */
