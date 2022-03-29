public class stack_rivision{
    Node head = null;

    public static void main(String[] args) {
        stack_rivision sr = new stack_rivision();
        sr.push(56);
        sr.push(32);
        sr.push(23);
        sr.push(100);
        sr.pop();
        sr.print();





    }
   class Node {
       int data;
       Node next;
       public Node (int data){
           this.data=data;
           this.next=null;
       }
   }
   // push Method
    public void push(int data){
       Node newnode = new Node(data);
       if (head==null){
           head = newnode;
           return;
       }
       newnode.next = head;
       head = newnode;
    }
    // pop Method
    public int pop(){
       if (head == null){
           System.out.println("Stack is Empty");
       }
       int result = head.data;
       head = head.next;
       return result;
    }
    // print method
    public void print(){
        if( head == null){
            System.out.println("stack is Empty");
            return;
        }
           Node currnode = head;
           while (currnode!=null){
               System.out.println(currnode.data + " ");
            currnode = currnode.next;
        }
    }
    // peek method
    public int peek(){
        if( head == null){
            System.out.println("stack is Empty");
        }
        return head.data;
    }
}

