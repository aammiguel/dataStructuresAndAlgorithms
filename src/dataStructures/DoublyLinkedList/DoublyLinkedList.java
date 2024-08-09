package dataStructures.DoublyLinkedList;

public class DoublyLinkedList {

    private Node head;
    private Node tail;
    private int length;

    /**
     * Node class
     */
    public class Node{
        public int value;
        public Node next;
        public Node prev;

        public Node(int value){
            this.value = value;
        }
    }

    /**
     * DLL constructos
     * @param value takes a DLL value
     */
    public DoublyLinkedList(  int value  ){
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    /**
     * printList
     */
    public void prinList(){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    /**
     * getHead
     * prints out the head
     */
    public void getHead(){
        System.out.println("Head: " + head.value);
    }

    /**
     * getTail
     * prints out the tail
     */
    public void getTail(){
        System.out.println("Tail: " + tail.value);
    }

    /**
     * getLength
     * prints out length
     */
    public void getLength(){
        System.out.println("Length: " + length );
    }

    public void append(int value){
        Node newNode = new Node(value);
        if(length == 0){
            head = newNode;
            tail = newNode;
            newNode.next = null;
            newNode.prev = null;
        }else{
            tail.next = newNode;
            newNode.prev = tail;
            tail= newNode;
        }
        length++;
    }

    public Node removeLast() {
        Node temp = tail;
        if (length == 0) {
            return null;
        }
        if (length == 1) {
            head = null;
            tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
            temp.prev = null;
        }
        length--;
        return temp;
    }


    public void prepend(int value){
        Node newNode = new Node(value);
        if(length == 0 ){
            head = newNode;
            tail = newNode;

        }else{
            head.prev = newNode;
            newNode.next = head;
            head = newNode;
        }
        length++;
    }

    public Node removeFirst(){
        Node temp = head;
        if(length == 0){
            return null;
        }
        if(length == 1){
            head = null;
            tail = null;
        } else{
            head = head.next;
            head.prev = null;
            temp.next = null;

        }
        length--;
        return temp;
    }

    public Node get(int index){
        if(index < 0 || index > length){
            return null;
        }
        Node temp = head;
        if(index < length/2){
            for(int i = 0 ; i < index; i++){
                temp = temp.next;
            }
        }else{
            temp = tail;
            for(int i = length -1 ; i > index ; i--){
                temp = temp.prev;
            }
        }

        return temp;

    }

    public boolean set(int index, int value){
        Node temp = get(index);
        if(temp != null){
            temp.value = value;
            return true;
        }
        else{
            return false;
        }
    }

    public boolean insert(int index, int value){

        if(index > length || index < 0 ) return false;
        if(index == 0){
            prepend(value);
            return true;
        }
        if(index == length){
            append(value);
            return true;
        }
        Node newNode = new Node(value);
        Node before = get(index - 1);
        Node after = before.next;

        newNode.prev = before;
        newNode.next = after;
        before.next = newNode;
        after.prev = newNode;
        length++;
        return true;
    }

    public Node remove(int index){
        if(index > length || index < 0)return null;

        if(index == 0){
            return removeFirst();
        }
        if(index == length -1){
            return removeLast();
        }

        Node temp = get(index);
        temp.next.prev = temp.prev;
        temp.prev.next = temp.next;
        temp.next = null;
        temp.prev = null;
        length--;
        return temp;
    }


}
