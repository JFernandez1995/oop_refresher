package com.company;

public class LinkedList {


    LinkedList() {
    } //default constructor


    int count(Node head) {
        int count = 1;
        Node current = head;
        while (current.next != null) { //while the next node is not null

            current = current.next; //assign the current node to the next node
            count++; //increment count
        }
        return count; //return count
    }

    static void addToEnd(Node head, int data) {
        Node current = head;
        int addInt = data;

        while (current.next != null) { //while the next node to look for is null
            current = current.next;  //we traverse through the linkedList and set the current node to the next node
        }

        if (current.next == null) { //if current.next has a null pointer
            Node addNode = new Node( addInt ); //we add a new node containing the new int
            current.next = addNode; //then we bring the pointer to the 'addNode' node
            addNode.next = null; //we assign a null sentinel pointer to the newly added node
        }
    }

    static void printAll(Node head) { //this prints out ll of the elements in the Linked list
        Node current = head;
        while (current != null) {
            System.out.print( current.data + ", " );
            current = current.next;
        }

    }

    static void removeTail(Node head) {

        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }

        current.next = null;

    }



}
