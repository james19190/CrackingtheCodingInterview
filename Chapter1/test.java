import java.lang.Math;
import java.util.HashMap;
import java.util.HashSet;

public class test {
    public static void main(String[] args) {
        int[] input = {1,7,5,9,2,12,3};

        System.out.println(bruteForce(input, 6));
        System.out.println(hashTable(input, 6));
    }

    public static int bruteForce(int[] array, int k){
        int count = 0;
        for (int i = 0; i< array.length; i++){
            for (int j = i + 1; j < array.length; j++){
                if (Math.abs(array[i]-array[j]) == k){
                    count++;
                }
            }
        }
        return count;
    }

    public static int hashTable(int[] array, int k){
        int count = 0;
        HashSet<Integer> numlist = new HashSet<>();

        for (int i = 0; i < array.length; i++){
            numlist.add(array[i]);
        }

        for (int i = 0; i < array.length; i++){
            if (numlist.contains(array[i] + k)){
                count++;
            }
        }

        return count;
    }
}

/** Approach

Method 1) Brute force ~ O(n^2)
    for all numbers within the array, find the dif between 2 numbers 
    if dif = k, count ++
    return count

Method 2) HashTable ~ O(n)
    for all numbers, insert values into HashSet ~ O(n)
    for all numbers, check to see if number + k exists in the hashset ~ O(n)
        if exists, add hash value to count ~ O(1)
**/