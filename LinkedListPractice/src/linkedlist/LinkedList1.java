package linkedlist;

import java.util.LinkedList;

public class LinkedList1 {

    // Properties
    Node head;
    int count;

    // Constructors
//    public LinkedList() {
//        head = null;
//        count = 0;
//    }
    public LinkedList1(Node newHead){
        head = newHead;
        count = 1;
    }

    // Methods

    // add
    public void add(int newData){
        Node temp = new Node(newData);
        Node current = head;
        while(current.getNext() != null) {
            current = current.getNext();
        }
        current.setNext(temp);
        count++;
    }

    // get
    public int get(int index){
        if (index <= 0){
            return -1;
        }
        Node current = head;
        for(int i = 1; i < index; i++){
            current = current.getNext();
        }
        return current.getData();
    }

    // size
    public int size() {
        return count;
    }

    // isEmpty
    public boolean isEmpty() {
        return head == null;
    }

    // remove
    public void remove() {
        // remove from end of list
        Node current = head;
        while (current.getNext().getNext() != null) {
            current = current.getNext();
        }
        current.setNext(null);
        count--;
    }


    public static void main(String[] args) {
    }
}