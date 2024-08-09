import dataStructures.DoublyLinkedList.DoublyLinkedList;
import dataStructures.linkedList.LinkedList;
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

        Stack mystack = new Stack(2);

        mystack.push(1);
        mystack.push(2);
        mystack.pop();
        mystack.printStack();
    }



}