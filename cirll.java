public class cirll {


    // Class Node (repersent the node)
    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    // Declaring head and tail pointer null
    public Node head = null;
    public Node tail = null;

    // taking int as argument/parameter and adding at end
    public void insert_at_end(int data) {

        // creating an obj i.e new node with the data from user
        Node new_Node = new Node(data);

        if (head == null) {
            // Both head and tail point to new node because the list is empty
            head = new_Node;
            tail = new_Node;
            // Making the next node address of the new node as null
            new_Node.next = null;
        } else {
            // tail needs to point the new node we made and not the head now
            tail.next = new_Node;
            // we need to make the new added node to be the tail now
            tail = new_Node;
            // the new node should point the head as the previous tail did
            tail.next = head;
        }
    }

    // taking int as parameter/argument and adding at front
    public void insert_at_front(int data) {
        // creating a new node to add at front with data given form the user
        Node new_Node = new Node(data);

        if (head == null) {
            // Both head and tail point to new node because the list is empty
            head = new_Node;
            tail = new_Node;
            // Making the next node address of the new node as null
            new_Node.next = null;
        } else {
            // the new node must point to the head
            new_Node.next = head;
            // the tail must point to new node now
            tail.next = new_Node;
            // the new node we inserted at front must be the khead now
            head = new_Node;
        }

    }

    public void display() {
        //making a temperory node with head's address
        int  i = 0;
        Node temp = head;
        if (head==null) {
            System.out.println("List is empty!!!");
        } 
        else {
            //do-while loop to iterate till til and print valuess
            do {
                i++;
                System.out.print(temp.data + "  ----> ");
                //going to next node 
                temp=temp.next;
            } while (i<=10);
        }
    }

    public static void main(String[] args) {
        cirll cl = new cirll();
        cl.insert_at_end(1);
        cl.insert_at_end(2);
        cl.insert_at_end(3);
        cl.insert_at_end(4);
        cl.insert_at_end(5);
        cl.insert_at_front(0);
        cl.insert_at_front(1);
        cl.insert_at_front(2);
        cl.insert_at_front(3);
        cl.insert_at_front(4);

        cl.display();

    }

}