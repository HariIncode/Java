package DSA.LL;

public class DLL {

    private static class Node{
        private final int val;
        private Node prev;
        private Node next;

        public Node(int val){
            this.val = val;
        }

        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.prev = prev;
            this.next = next;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.prev = null;

        if (head != null) head.prev = node;

        head = node;

        if (tail == null) tail = head;

        size++;
    }

    public void insertLast(int val){

    }

    public void display(){
        Node temp = head;

        for (int i = 0; i < size; i++){
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }

        System.out.println("END");
    }

    public static void main(String[] args) {
        DLL list = new DLL();

        list.insertFirst(10);
        list.insertFirst(20);
        list.insertFirst(30);
        list.insertFirst(40);

        list.display();
    }
}
