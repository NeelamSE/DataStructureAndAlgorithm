package adt;

import node.Node;

public interface SinglyLinkedList {

    void display();
    void makeNodeWithData(int data);
    int size();
    Node insertAtHead(Node head1);

    Node insertAtTail(Node tail);

    Node deleteAtHead();

    Node deleteAtTail();



}
