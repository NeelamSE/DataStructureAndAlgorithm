package list;

import adt.SinglyLinkedList;
import node.Node;

public class List implements SinglyLinkedList {
    Node head ;
    @Override
    public void display() {
        if(head == null){
            System.out.println("linked list is empty");
        }else{
            Node current3 = head;
            while(current3 != null){
                System.out.print(current3.data);
                System.out.print("->");
                current3=current3.address;
            }
        }
        System.out.print("null");

    }

    @Override
    public void makeNodeWithData(int data) {
        Node current = new Node(data);

        if(head==null){
            head=current;
        }else{
            Node current2=head;
            while (current2.address!=null){
                current2=current2.address;
            }
            current2.address=current;
        }
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public Node insertAtHead(Node head) {
        return null;
    }

    @Override
    public Node insertAtTail(Node tail) {
        if (head == null){
            head = tail;
        }else{
            Node Current1 = head;
            while(Current1.address!= null){
                Current1 = Current1.address;
            }
            Current1.address = tail;
        }
        return head;
    }

    @Override
    public Node deleteAtHead(Node head) {
        return null;
    }

    @Override
    public Node deleteAtTail(Node head) {
        return null;
    }
}
