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

        System.out.println("enter the data which you want to add at last of the node");
        int tail = obj.nextInt();
        Node tailNode=new Node(tail);
        Node current1=list.insertAtTail(tailNode);
        list.display();

    }

}
