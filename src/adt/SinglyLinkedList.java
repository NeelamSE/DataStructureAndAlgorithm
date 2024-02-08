package adt;

import node.Node;

public interface SinglyLinkedList {

    void display(Node head);
    void makeNodeWithData(int data);
    int size(Node head);
    Node insertAtHead(Node head);

    Node insertAtTail(Node head);

    Node deleteAtHead(Node head);

    Node deleteAtTail(Node head);



}
