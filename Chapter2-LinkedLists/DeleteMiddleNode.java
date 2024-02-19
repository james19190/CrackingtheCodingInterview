public class DeleteMiddleNode {
    public static void main(String[] args) {
        Node start = new Node(1);
        start.next = new Node(2);
        start.next.next = new Node(3);
        start.next.next.next  = new Node(4);

        deleteNode(start, 2);

        while (start != null){
            System.out.println(start.data);
            start = start.next;
        }
    }

    public static void deleteNode(Node root, int target){
        
        Node previousNode = null;

        while (root != null){
            if (root.data == target){
                previousNode.next = root.next;
                break;
            }
            previousNode = root;
            root = root.next;
        }
        

    }


}

/*

Implement an algorithm to delete a node given its value

Questions
1) Can there be multiple different 
Method 1) - Brute Force
- Start from the first node
- check if value is equal to target node
- if equal, previous node.next = current node.next -> exit

 */
