package adt;

import node.Node;

public interface SinglyLinkedList {

    void display();
    void makeNodeWithData(int data);
    int size();
    Node insertAtHead(Node head);

    Node insertAtTail(Node tail);

    Node deleteAtHead(Node head);

    Node deleteAtTail(Node head);



}
