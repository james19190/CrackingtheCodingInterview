import java.io.*;
import java.util.HashSet;

public class RemoveDups {

    public static void main(String[] args) {
    }

    public static void removeDuplicates(Node n){
        
        HashSet<Integer> hs = new HashSet<>();
        Node previousNode = null;

        while (n != null){
            if (hs.contains(n.data)){
                previousNode.next = n.next; //delete node
            }
            else {
                hs.add(n.data);
                previousNode = n;

            }
            n = n.next;
        }
        
        
    }

}





/*
Write code to remove duplicates from an unsorted linked list

Questions
1) Can a null node be given as input?
2) Can a value of a node be 0?
3) Is the linked list doubly linked?

Method 1) HashSet
- Initialize a hashset that will contain node data values
- Cycle through the linked list
    - check each nodes value
    - if value exists, delete node from list

*/