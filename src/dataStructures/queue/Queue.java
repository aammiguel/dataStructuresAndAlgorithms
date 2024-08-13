package dataStructures.queue;

public class Queue
{
    private Node first;
    private Node last;
    private int length;

    public class Node{
        public int value;
        public Node next;

        public Node(int value) {
            this.value = value;
        }
    }
    public Queue(int value){
        Node newNode = new Node(value);
        first = newNode;
        last = newNode;
        length = 1;
    }

    public void printQueue(){
        Node temp = first;
        while(temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    /**
     * getFirst prints out the first element of the queue
     */
    public void getFirst(){
        System.out.println("First: " + first.value);
    }

    /**
     * getLast prints out last element of the queue
     */
    public void getLast(){
        System.out.println("Last :" + last.value);
    }
    /**
     * getLength gets the length of the queue
     */
    public void getLength(){
        System.out.println("length: " + length );
    }

    /**
     * enqueue add value at the end of the queue
     * @param value takes a value to add to new value in queue
     */
    public void enqueue(int value ){
        Node newNode = new Node( value );
        if(length == 0 ){
            first = newNode;
            last = newNode;
        }else{
            last.next = newNode;
            last = newNode;
        }
        length++;
    }
    /**
     * dequeue remove the first item in the queue
     */
    public Node dequeue(){
        if(length == 0 ) return null;
        Node temp = first;
        if( length == 1){
            first = null;
            last = null;
        }else{
            first = first.next;
            temp.next = null;
        }
        length--;
        return temp;
    }

}
