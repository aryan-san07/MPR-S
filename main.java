import java.util.Scanner;
///////////////////////////////////////////////////////////////////////
class cll {   
    public class Node{  
        String label;//store the label of the memory(memory size)
        int data=0;  //Data i.e process size
        Node next;  //reference
        public Node(String label) { /*Constructor for memory label */
            this.label=label;
        }
        public Node(int data) {  /*constructor for process size that is data */
            this.data = data;  
        }  
    }  

///////////////////////////////////////////////////////////////////////
    public Node head = null;  
    public Node tail = null;  
/////////////////////////////////////////////////////////////////////////
//     public void displayBlock_info() {
//         Node current = head;
//         if(head == null) {  
//             System.out.println("List is empty");  
//         }  
//         else {   
//             System.out.println("Process       Block Size allocated");
//              do{    
//                 System.out.println("   "+current.data+"                 "+current.label);
//                 current = current.next;  
//             }while(current != head);  
//     }
// }

/////////////////////////////////////////////////////////////////////////
  public void create_Memory_blocks(int blockSize[], int n) {   
        for (int i = 0; i < n; i++) {
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
    public void add_Process_Size(int process[], int n) { 
        Node temp = head;
        System.out.println("Process       Block Alloted");
        for (int i = 0; i < n; i++) {
            do {
                if (temp.data == 0) {
                    if (process[i] <= Integer.parseInt(temp.label)) {
                        temp.data=process[i];
                        System.out.println("  "+process[i]+"            "+temp.label );
                        break;
                    } 
                } 
                temp=temp.next;
            } while(temp != head);
            temp=head;
            }
        } 
    }

/////////////////////////////////////////////////////////////////////        
//     public void displayBlock_sizes() {  
//         Node current = head;  
//         if(head == null) {  
//             System.out.println("List is empty");  
//         }  
//         else {   
//              do{    
//                 System.out.print(" "+ current.label);  
//                 current = current.next;  
//             }while(current != head);  
//             System.out.println();  
//         }  
//     }  
// }


/////////////////////////////////////////////////////////////////////
public class main {
    public static void main(String[] args) {
        int n;//no fo blocks(memory)
        int[] process = new int[100];  
        int[] blockSize = new int[100];
        Scanner sc = new Scanner(System.in);//scanner class for input
        System.out.println("Enter the number of Blocks");
        n = sc.nextInt();
        cll cl = new cll();  
        System.out.print("Block will be declared as ");  
        for (int i = 0; i < n; i++) {
            blockSize[i]=sc.nextInt();
         }
        // cl.displayBlock_sizes();
        System.out.print("Enter the processes");
        for (int i = 0; i < n; i++) {
           process[i]=sc.nextInt();
        }
        cl.create_Memory_blocks(blockSize,n);
        cl.add_Process_Size(process,n);
        // cl.displayBlock_info(); 
    }  
}


