class main {
    private static class Node {
        int data;
        Node next;
        Node (int data) {
            this.data=data;
            next=null;
        }
    }
    Node head;

    public void add(int data) {
        Node new_Node = new Node(data);
        if (head==null) {
            head=new_Node;
            return;
        }
        Node temp = head;
        while (temp.next!=null) {
            temp=temp.next;
        }
        temp.next=new_Node;
    }

    public void print() {
        Node temp = head;
        while (temp!=null) {
            System.out.println(temp.data);
            temp=temp.next;
        }
    }

}