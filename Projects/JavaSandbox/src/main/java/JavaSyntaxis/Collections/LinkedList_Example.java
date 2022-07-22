package JavaSyntaxis.Collections;

import java.util.ArrayList;
import java.util.List;

class MyLinkList<E> {
    private Node<E> head = null;
    private int size = 0;

    class Node<E> {
        E item;
        Node<E> next;

        public Node(E item) {
            this.item = item;
        }

        public E getItem() {
            return item;
        }

        public void setItem(E item) {
            this.item = item;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }
    }

    public void add(E element) {
        if (head == null) {
            this.head = new Node<>(element);
        } else {
            Node<E> temp = head;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(new Node<E>(element));
        }
        size++;
    }

    public E get(int index) {
        Node<E> temp = head;
        int counter = 0;
        while (counter < index && temp != null) {
            temp = temp.getNext();
            counter++;
        }
        if (temp == null)
            throw new IllegalArgumentException("No one element with this index");

        return temp.getItem();
    }

    public void remove(int index) {
        Node<E> temp = head;
        int counter = 0;

        while (temp != null) {
            if (counter + 1 == index) {
                temp.setNext(temp.getNext().getNext());
                size--;
                return;
            } else {
                temp = temp.getNext();
                counter++;
            }
        }
    }

    @Override
    public String toString() {
        String result = "";
        List<E> nodeArray = new ArrayList<>();
        Node<E> temp = head;

        while (temp != null) {
            nodeArray.add(temp.getItem());
            temp = temp.getNext();
        }

        result = nodeArray.toString();
        return result;
    }
}

public class LinkedList_Example {
    public static void main(String[] args) {
        MyLinkList<Integer> myLinkList = new MyLinkList<>();

        myLinkList.add(123);
        myLinkList.add(124);
        myLinkList.add(125);

        myLinkList.remove(1);
        System.out.println(myLinkList.toString());


    }

}
