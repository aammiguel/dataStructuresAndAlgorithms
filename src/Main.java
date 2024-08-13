import dataStructures.DoublyLinkedList.DoublyLinkedList;
import dataStructures.binarysearchtree.BinarySearchTree;
import dataStructures.linkedList.LinkedList;
import dataStructures.queue.Queue;
import dataStructures.stack.Stack;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)
    {
//        LinkedList myLinkedList = new LinkedList(11);
//        myLinkedList.append(3);
//        myLinkedList.append(23);
//        myLinkedList.append(7);
//
//        myLinkedList.reverse();
//
//        myLinkedList.printList();

//        DoublyLinkedList myDLL = new DoublyLinkedList(10);
//        myDLL.append(20);
//
//        myDLL.remove(1);
//
//        myDLL.prinList();

//        Stack mystack = new Stack(2);
//
//        mystack.push(1);
//        mystack.push(2);
//        mystack.pop();
//        mystack.printStack();

//        Queue myQueue = new Queue(1);
//        myQueue.enqueue(2);
//        System.out.println(myQueue.dequeue().value);
//        myQueue.printQueue();

        BinarySearchTree myBST = new BinarySearchTree();
        myBST.insert(47);
        myBST.insert(21);
        myBST.insert(76);
        myBST.insert(18);
        myBST.insert(27);
        myBST.insert(52);
        myBST.insert(82);

        System.out.println( myBST.contains(27));
        System.out.println(myBST.contains(17));



        System.out.println(myBST.root.left.right.value);
    }



}