package dataStructures.stack;

public class Stack {
    private Node top;
    private int height;

    /**
     * Node class and constructor
     */
    class Node {
        public int value;
        public Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    /**
     * Stack constructor
     * @param value takes a value for new node
     */
    public Stack(int value){
        Node newNode;
        newNode = new Node(value);
        top = newNode;
        height = 1;
    }

    /**
     * print stack
     */
    public void printStack(){
        Node temp = top;
        while(temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    /**
     * Get and print top value
     */
    public void getTop(){
        System.out.println("Top: " + top.value);
    }

    /**
     * Get and print stack height
     */
    public void getHeight(){
        System.out.println("Height: " + height);
    }

    /**
     * push
     * @param value takes a value to initialize new Node
     */
    public void push(int value ){
        Node newNode = new Node(value);
        if(height == 0 ){
            top = newNode;
        }else{
            newNode.next = top;
            top = newNode;
        }
        height++;
    }

    /**
     * POP
     * @return temp node which is the node that we're gonna delete
     */
    public Node pop(){
        if(height == 0){
            return null;
        }
        Node temp = top;
        top = top.next;
        temp.next = null;

        height--;
        return temp;
    }


}
