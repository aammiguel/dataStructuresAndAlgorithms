import dataStructures.linkedList.LinkedList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)
    {
        LinkedList myLinkedList = new LinkedList(2);
        myLinkedList.append(1);

        System.out.println(myLinkedList.removeFirst());
        System.out.println(myLinkedList.removeFirst());
        System.out.println(myLinkedList.removeFirst());
    }

}