import java.util.Scanner;
///////////////////////////////////////////////////////////////////////
class cll {   
    public class Node{  
        String label;
        int data=0;  
        Node next;  
        public Node(String label) {
            this.label=label;
        }
        public Node(int data) {  
            this.data = data;  
        }  
    }  

///////////////////////////////////////////////////////////////////////
    public Node head = null;  
    public Node tail = null;  


/////////////////////////////////////////////////////////////////////////
    public void displayBlock_info() {
        Node current = head;
        if(head == null) {  
            System.out.println("List is empty");  
        }  
        else {   
            System.out.println("Process       Block Size allocated");
             do{    
                System.out.println("   "+current.data+"                 "+current.label);
                current = current.next;  
            }while(current != head);  
    }
}

/////////////////////////////////////////////////////////////////////////
  public void create_Memory_blocks(int blockSize[]){   
        for (int i = 0; i < blockSize.length; i++) {
            Node newNode = new Node(Integer.toString(blockSize[i])); 
            if (head == null) {
                head = newNode;
                tail = newNode;
                newNode.next = head;
            } else {
                tail.next = newNode;
                tail = newNode;
                newNode.next = head;
            }
        }
        // Node newNode = new Node(data);   
        // if(head == null) {  
        //     head = newNode;  
        //     tail = newNode;  
        //     newNode.next = head;  
        // }  
        // else {  
        //     tail.next = newNode;  
        //     tail = newNode; 
        //     tail.next = head;  
        // }  
    }  


//////////////////////////////////////////////////////////////////////
    public void add_Process_Size(int process[]) { 
        Node temp = head;
        // System.out.println("Add process");
        for (int i = 0; i < process.length; i++) {
            do {
                if (temp.data == 0) {
                    if (process[i] <= Integer.parseInt(temp.label)) {
                        temp.data=process[i];
                        break;
                    } 
                } 
                temp=temp.next;
            } while(temp != head);
            temp=head;
            }
        } 
  

/////////////////////////////////////////////////////////////////////        
    public void displayBlock_sizes() {  
        Node current = head;  
        if(head == null) {  
            System.out.println("List is empty");  
        }  
        else {   
             do{    
                System.out.print(" "+ current.label);  
                current = current.next;  
            }while(current != head);  
            System.out.println();  
        }  
    }  
}


/////////////////////////////////////////////////////////////////////
public class main {
    public static void main(String[] args) {
        int[] process = new int[10];  
        Scanner sc = new Scanner(System.in);
        cll cl = new cll();  
        int blockSize[] = {10,20,30,40,50};
        System.out.print("BlockSize is declared as ");  
        cl.create_Memory_blocks(blockSize);
        cl.displayBlock_sizes();
        for (int i = 0; i < blockSize.length; i++) {
           process[i]=sc.nextInt();
        }
        cl.add_Process_Size(process);
        cl.displayBlock_info(); 
    }  
}

