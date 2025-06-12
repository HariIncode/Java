package DSA;

import java.util.LinkedList;

public class LL {

    public static class Node{
        //Actual Value that
        private final int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }

        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public LL(){
        this.size = 0;
    }

    public void insertFist(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

        if(tail == null){
            tail = head;
        }

        size++;
    }

    public void insertLast(int val){
        if(tail == null){
            insertFist(val);
            return;
        }

        Node node = new Node(val);
        tail.next = node;
        tail = node;

        size++;
    }

    public void insert(int val, int index){

        //If there is no head
        if(head == null){
            insertFist(val);
            return;
        }

        //If there is no tail
        if (tail == null){
            insertLast(val);
            return;
        }

        //Create a temp and iterate it to before the index
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        //Create a New Node with pointing temp.next
        temp.next = new Node(val, temp.next);

        size++;
    }

    public int deleteFirst(){
        int val = head.value;
        head = head.next;

        if (head == null){
            tail = null;
        }

        size--;

        return val;
    }

    public int deleteLast(){
        if (tail == head){
            return deleteFirst();
        }

        int val = tail.value;
        tail = get(size - 2);

        size--;

        return val;
    }

    public void display(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.value+ " -> ");
            temp = temp.next;
        }

        System.out.println("END");
    }

    public Node get(int index){
        Node node = head;

        for(int i = 1; i < index; i++){
            node = node.next;
        }

        return node;
    }

    public static void main(String[] args) {
        LL list = new LL();

        list.insertFist(19);
        list.insertFist(129);
        list.insertFist(194);
        list.insertFist(195);
        list.insertFist(13);
        list.insertFist(1);
        list.insertFist(9);

        list.insert(100,3);


        list.display();

        System.out.println(list.deleteFirst());

        list.display();

        System.out.println(list.size);
        System.out.println(list.head.value);
        System.out.println(list.tail.value);

        System.out.println("Last ele" + list.deleteLast());

        list.display();

    }
}
