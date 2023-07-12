package GFG.linkedList;

import java.util.LinkedList;

public class Traverse {
    Node head;
    static class Node{
        int data;
        Node next;

        Node(int d){
            data=d;
            next=null;
        }
    }

    //traverse- > print content of a LL starting from Head
    public void printList(){
        Node n = head;
        while(n!=null){
            System.out.println(n.data+ " ");
            n= n.next;
        }
    }

    public static void main(String[] args) {
        Traverse llist = new Traverse();
        llist.head= new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        llist.head.next=second;
        second.next=third;

        llist.printList();
    }


}
