package DSA;

public class SLL {

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

    public SLL(){
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

        //If the List is Empty or Index is 0
        if(index == 0){
            insertFist(val);
            return;
        }

        //If Index is last
        if (index == size){
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
        if (size <= 1){
            return deleteFirst();
        }

        //Creating val for returning purpose
        int val = tail.value;

        //Creating a temp named secondLast and making it the tail
        Node secondLast = get(size - 2);
        tail = secondLast;
        tail.next = null;

        size--;

        return val;
    }

    public int delete(int index){
        if(index == 0) return deleteFirst();
        if(index == size - 1) return deleteLast();

        Node prev = get(index - 1);
        Node toDelete = prev.next;
        prev.next = prev.next.next;

        size--;

        return toDelete.value;
    }

    public int getFirst(){
        return head.value;
    }

    public int getLast(){
        return tail.value;
    }

    public int indexOf(int target){
        Node temp = head;
        int index = 0;

        while (temp != null) {
            if (temp.value == target)
                return index;
            temp = temp.next;
            index++;
        }

        return -1;
    }

    public Node get(int index){
        if (isEmpty()) return null;

        Node node = head;
        for(int i = 0; i < index; i++){
            node = node.next;
        }

        return node;
    }

    public Node find(int value){
        if(isEmpty()) return null;

        Node node = head;
        while(node != null){
            if(node.value == value) return node;
            node = node.next;
        }

        return null;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public void display(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.value+ " -> ");
            temp = temp.next;
        }

        System.out.println("END");
    }

    public static void main(String[] args) {
        SLL list = new SLL();

        System.out.println(list.isEmpty());

        list.insertFist(19);
        list.insertFist(129);
        list.insertLast(194);
        list.insertFist(195);
        list.insertLast(13);
        list.insertFist(1);
        list.insertLast(9);

        list.insert(100,3);


        list.display();

        System.out.println(list.isEmpty());


        System.out.println(list.deleteFirst());

        list.display();

        System.out.println(list.size);
        System.out.println(list.head.value);
        System.out.println(list.tail.value);

        System.out.println("Last Element Deleted -> " + list.deleteLast());

        list.display();

        System.out.println("GetFirst -> " + list.getFirst());
        System.out.println("GetLast -> " + list.getLast());
        System.out.println("GetFirstEle -> " + list.indexOf(1));
        System.out.println("GetFirstEle -> " + list.indexOf(194));
        System.out.println("GetFirstEle -> " + list.indexOf(195));

        System.out.println(list.deleteLast());
        list.display();

        System.out.println(list.delete(2));
        list.display();

    }
}
