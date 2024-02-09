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
        int count =0;
        if(head!=null){
            Node current1=head;
            while (current1 != null) {
                count=count+1;
                current1=current1.address;
            }
        }

        return count;
    }

    @Override
    public Node insertAtHead(Node head1) {
        head1.address=head;
        head=head1;
        return head;
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
    public Node deleteAtHead() {
        head=head.address;
        return null;
    }

    @Override
    public Node deleteAtTail() {
        if(head==null||head.address==null){
            head=null;
        }else{
            Node current1=head;
            while(current1.address.address!=null){
                current1=current1.address;
            }
            current1.address=null;
        }

        return head;
    }
}
