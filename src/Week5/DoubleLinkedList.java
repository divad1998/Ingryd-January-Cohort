package Week5;

public class DoubleLinkedList {
    Node head;

    public DoubleLinkedList(){
        this.head = null;
    }

    public void insertEnd(int data){
        Node newNode = new Node(data);
        if( head == null ){
            head = newNode;
        } else {
            Node current = head;
            while( current.next != null ){
                current = current.next;
            }
            current.next = newNode;
            newNode.prev = current;
        }
    }

    void insertBeginning(int data) {
        Node newNode = new Node(data);
        if (head != null) {
            newNode.next = head;
            head.prev = newNode;
        }
        head = newNode;
    }

    //TOdO: implement this
    void insertBefore(int data, int beforeData) {
        //Algo:
        //find the data while moving forward

    }

    public void display() {
        Node current = head;
        while(current != null ){
            System.out.print(current.data + " <-> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        DoubleLinkedList list = new DoubleLinkedList();
//        list.insertEnd(10);
//        list.display();
//        list.insertEnd(25);
//        list.display();
//        list.insertEnd(15);
//        list.display();

        list.insertBeginning(2);
        list.display();
        list.insertBeginning(3);
        list.display();
        list.insertBeginning(4);
        list.display();
    }
}