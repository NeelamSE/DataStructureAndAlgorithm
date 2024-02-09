package main;

import list.List;
import node.Node;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        List list = new List();
        Scanner obj = new Scanner(System.in);
        System.out.println("enter a size of linked list");
        int size = obj.nextInt();
        for(int i=0;i<size;i++){
            System.out.println("enter the data for list");
            int data = obj.nextInt();
            list.makeNodeWithData(data);

        }

//        System.out.println("enter the data which you want to add at tail of the node");
//        int tail = obj.nextInt();
//        Node tailNode=new Node(tail);
//        Node current1=list.insertAtTail(tailNode);

//        System.out.println("enter the data which you want to add at head of the node");
//        int head = obj.nextInt();
//        Node headNode = new Node(head);
//        Node current2 = list.insertAtHead(headNode);


//        list.deleteAtHead();
//        list.deleteAtTail();


        list.display();
//
        System.out.println();
        int sizeoflinkedlist=list.size();
        System.out.println("size of linked list is "+sizeoflinkedlist);


    }

}
