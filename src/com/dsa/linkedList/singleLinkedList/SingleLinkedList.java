package com.dsa.linkedList.singleLinkedList;

import com.dsa.linkedList.Node;

public class SingleLinkedList {
    private Node head;
    private int size;

    public int size(){
        return this.size;
    }

    public void addNode(Object data){
        //create a new head node with the data and a null pointer
        Node header = new Node(data, null);
        //set pointer to new head ro be node that was the old head
        header.setNext(this.head);
        //
        this.head = header;
        this.size++;
    }
}
