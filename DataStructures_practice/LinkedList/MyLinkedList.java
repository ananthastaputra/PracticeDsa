package DataStructures_practice.LinkedList;

class MyLinkedList {
    Node head;
    Node tail;
    int length = 0;


    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }

        Node(int data,Node next) {
            this.data = data;
            this.next = next;
        }

    }


    //unshift
    public void addFirst(int data) { //this will add the element in the begining
        Node newNode = new Node(data);

        if (this.head == null) {
            this.head = newNode;
        }

        this.length++;


    }


    //adding elements means add the element at last
    public void addLast(int data) { //this will add the data in the last of the data
        Node newNode = new Node(data);

        if (this.head == null) { //if linked list is empty
            this.head = newNode;

        }
        else {
            Node currNode = this.head; //iterator assign currNode

            while(currNode.next != null) { //find out which node.next is null
                currNode = currNode.next;
            }
            currNode.next = newNode; //put that node to last node;
        }
        this.length++;

    }

    public int getValueByIndex(int index) {
        if (index < 0 || index >= this.length) { //if index is less than 0 and if it more than length;
            return -1;
        }
        Node temp =  this.head;

        for (int i = 0; i < index; i++) { //iterate upto index and store the index node at temp
            temp = temp.next;
        }
        return temp.data; //returns the temp value
    }


    //print the list
    public static void printList(MyLinkedList list) {
        Node currNode = list.head;
//        System.out.print("linked list :");


        while(currNode != null) {
            System.out.print(currNode.data + "-->" + " ");
            currNode = currNode.next;

        }
        System.out.println(" "); // just to get new line
        System.out.println("length of the list is :" + list.length);


    }



    public static  void main(String[] args) {
        MyLinkedList ll = new MyLinkedList();

        ll.addFirst(2);
        ll.addLast(4);
        ll.addLast(7);
        ll.addLast(9);
        int res = ll.getValueByIndex(2);
//        printList(ll);
        System.out.println(res);



    }
}