package dataStructures.linkedList;

public class LinkedList
{
    private Node head;
    private Node tail;
    private int length;

    /**
     * Node class
     * creates node object
     */
    public class Node
    {
        public int value;
        public Node next;

        Node(int value)
        {
            this.value = value;
        }
    }
    /**
     * Constructor
     * @param value assign a value to constructor
     */
    public LinkedList(int value)
    {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;

    }

    /**
     * gethead
     * print head
     */
    public void getHead()
    {
        System.out.println("head: " + head.value);
    }

    /**
     * getTail
     * print tail
     */
    public void getTail() {
        System.out.println("Tail: " + tail.value);
    }

    /**
     * getLength
     * @return length
     */
    public void getLength() {
        System.out.println("Length: " + length);
    }

    /**
     * printList
     * print all the element in a linked list
     */
    public void printList()
    {
        LinkedList.Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }
    /**
     * append a new node
     * checks if there are already a node, if  not, create a new node
     */
    public void append(int value)
    {
        Node newNode = new Node(value);
        if(length == 0)
        {
            head = newNode;
            tail = newNode;
        }
        else
        {
            tail.next = newNode;
            tail = newNode;
        }
        length ++;
    }

    /**
     * remove Last
     * Assign a temp and a pre value, with a for loop iterates , check each value and assign a pre and temp value,
     * until the temp value finds the one that is null, which means is the last object, so previous value (pre) is assign with the tail
     * @return temp
     */
    public Node removeLast() {
        if(length == 0) return null;

        Node temp = head;
        Node pre = head;

        while(temp.next != null) {
            pre = temp;
            temp = temp.next;
        }

        tail = pre;
        tail.next = null;
        length --;

        if(length == 0) {
            head = null;
            tail = null;
        }
        return temp;
    }

    /**
     *prepend a new value
     * @param value takes a value to prepend at the beggining of the linked list
     * Checks if exists a node, if it doesn't exist assign the new value to head and tail
     * else assign the new value.next to head to create the relationship and then assign head to newnode
     */
    public void prepend(int value){
        Node newNode = new Node(value);

        if(length == 0){
            head = newNode;
            tail = newNode;
        }else {
            newNode.next = head;
            head = newNode;
        }
        length++;

    }

    /**
     * remove first
     * assign a temp value that holds the first item, and then separete it from the rest
     * @return temp value which was removed
     */
    public Node removeFirst()
    {
        if(length == 0) return null;

        Node temp = head;
        head =  head.next;
        temp.next = null;
        length--;
        if(length == 0)
        {
            tail = null;
        }
        return temp;
    }


}
