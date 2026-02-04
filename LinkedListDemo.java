
    /*
    
    A-->B-->C-->D-->E-->F
    1)A Linked List is a linear data structure where 
    elements are connected using pointers.
    2)Each element is called a Node which contains data
    and a reference (link) to the next node.
    3)Unlike Arrays,LinkedLists are dynamic and allow
    efficient inseertions and deletions.
    
    */
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}


public class LinkedListDemo {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);
        head.next.next.next=new Node(40);

        Node curr = head;

        // while(curr !=null){
        //     System.out.println(curr.data);
        //     curr = curr.next;
        // }

        //sum of elements in nodes
        int sum =0;

        while(curr !=null){
            sum = sum + curr.data;
            //System.out.println(curr.data);
            curr = curr.next;
        }
        System.out.println(sum);
    }
}
