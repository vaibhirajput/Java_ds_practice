public class queue_rivision {
    Node head = null;
    Node rear = null;

    public static void main(String[] args) {
        queue_rivision qr = new queue_rivision();
        qr.offer(23);
        qr.offer(33);
        qr.offer(44);
        qr.offer(55);
        qr.print();
    }
    class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    //offer method
    public void offer(int data){
        Node newnode = new Node(data);
        if (head == null){
            head = rear = newnode;
        }
        rear.next = newnode;
        rear = newnode;
    }
    // pull method
    public int pull(){
         if(head == null){
            System.out.println("Queue is Empty");
        }
        int result = head.data;
        head = head.next;
        return result;
    }
    // print method
    public void print(){
        if(head == null){
            System.out.println("Queue is Empty");
            return;
        }
        Node currnode = head;
        while (currnode!= null){
            System.out.println(currnode.data);
            currnode = currnode.next;
        }
    }
}
