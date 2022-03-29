public class linkedlist_rivision {
    Node head = null;

    public static void main(String[] args) {
        linkedlist_rivision lr = new linkedlist_rivision();
        lr.addfrist(56);
        lr.addfrist(89);
        lr.addfrist(23);
        lr.addlast(100);

        lr.deletefirst();
        lr.deletelast();
        lr.print();
    }
    class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    //Add first method
    public void addfrist(int data){
        Node newnode = new Node(data);
        if (head== null){
            head = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
    }
    // Add last method
    public void addlast(int data){
        Node newnode = new Node(data);
        if (head==null){
            head = newnode;
            return;
        }
        Node currnode = head;
        while (currnode.next!= null){
            currnode = currnode.next;
        }
        currnode.next = newnode;
    }
    //over ride method
    public void overide(int indx, int data){
        Node newnode = new Node(data);
        if (head == null){
            return;
        }
        Node curnode = head;
        int i =0;
        while( i != indx){
            curnode= curnode.next;
            i++;
        }
        newnode.next= curnode.next;
        curnode = newnode;
    }
    // delete first method
    public void deletefirst(){
        if (head== null){
            System.out.println("LIst is already Empty");
            return;
        }
       head = head.next;
    }
    //delete last method
    public void deletelast(){
        if (head== null){
            System.out.println("LIst is already Empty");
            return;
        }
        if(head.next == null){
            head = null;
            return;
        }
        Node curfirst = head;  // 10 20 30 40
        Node curlast = head.next;
        while(curlast.next != null){
            curlast = curlast.next;
            curfirst = curfirst.next;
        }
        curfirst.next = null;
    }


    // print method
    public void print(){
        if (head == null){
            System.out.println("List is Empty");
            return;
        }
        Node currnode = head;
        while (currnode != null){
            System.out.println(currnode.data + " ");
            currnode = currnode.next;
        }
    }
}
