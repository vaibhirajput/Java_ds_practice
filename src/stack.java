public class stack {
    Node head = null;
    Node tail = null;
    class Node {
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    // push method
    public void push(int data){
        Node newnode = new Node(data);
        if (head == null){
            head = tail = newnode;
        }
        newnode.next = tail.next;
        tail = newnode;
    }
    // pop method
    public int pop(){
        if (head == null){
            System.out.println("Stack is Empty");
        }
        int result = tail.data;
        Node currnode = head;
        Node currnode2 = head.next;
        while(currnode2.next!=null){
            currnode2 = currnode2.next;
            currnode = currnode.next;
        }
            tail = currnode;
        tail.next = null;
        return result;
    }

}
