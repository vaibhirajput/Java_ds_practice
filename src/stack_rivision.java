public class stack_rivision{
    Node head = null;

    public static void main(String[] args) {
        stack_rivision sr = new stack_rivision();
        sr.push("vaibhav");
        sr.push("rajput");
        sr.push("newwolrd");
        sr.print();





    }
   class Node {
       String data;
       Node next;
       public Node (String data){
           this.data=data;
           this.next=null;
       }
   }
   // push Method
    public void push(String data){
       Node newnode = new Node(data);
       if (head==null){
           head = newnode;
           return;
       }
       newnode.next = head;
       head = newnode;
    }
    // pop Method
    public String pop(){
       if (head == null){
           System.out.println("Stack is Empty");
       }
       String result = head.data;
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
               System.out.print(currnode.data + " ");
            currnode = currnode.next;
        }
    }
    // peek method
    public String peek(){
        if( head == null){
            System.out.println("stack is Empty");
        }
        return head.data;
    }
}

