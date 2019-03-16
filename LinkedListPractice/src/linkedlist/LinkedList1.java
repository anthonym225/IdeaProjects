package linkedlist;

import java.util.LinkedList;

public class LinkedList1<D> {

    // Properties
    Node<D> head;
    int count;

    // Constructors
//    public LinkedList() {
//        head = null;
//        count = 0;
//    }
    public LinkedList1(Node<D> newHead){
        head = newHead;
        count = 1;
    }

    // Methods

    // add
    public void add(D newData){
        Node<D> temp = new Node(newData);
        Node<D> current = head;
        while(current.getNext() != null) {
            current = current.getNext();
        }
        current.setNext(temp);
        count++;
    }

    // get
    public D get(int index){
//        if (index <= 0){
//            return -1;
//        }
        Node<D> current = head;
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
        Node<D> current = head;
        while (current.getNext().getNext() != null) {
            current = current.getNext();
        }
        current.setNext(null);
        count--;
    }


    public static void main(String[] args) {
    }
}
