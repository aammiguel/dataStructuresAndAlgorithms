package dataStructures.binarysearchtree;

public class BinarySearchTree
{
    public Node root;

    public class Node{
        public int value;
        public Node left;
        public Node right;

        public Node(int value){
            this.value = value;
         }
    }

    /**
     * iterates through the tree and insert an element depending on the value
     * @param value takes a value for the new node
     * @return true or false if the insertion was successful
     */
    public boolean insert(int value){
        Node newNode = new Node(value);
        if(root == null){
            root = newNode;
            return true;
        }
        Node temp = root;
        while(true){
            if(temp.value == newNode.value){
                return false;
            }
            if(newNode.value < temp.value ){
                if(temp.left == null){
                    temp.left = newNode;
                    return true;
                }
                temp = temp.left;

            }else{
                if(temp.right == null){
                    temp.right = newNode;
                    return true;
                }

                temp = temp.right;

            }
        }

    }

    /**
     * iterates through the tree to find an element
     * @param value takes an element to look for
     * @return true or false if the tree contains the element
     */
    public boolean contains(int value){
        Node temp = root;
        while(temp != null){
            if(value < temp.value ){
                temp = temp.left;
            }else if(value > temp.value){
                temp = temp.right;
            }else{
                return true;
            }
        }
        return false;
    }
}
