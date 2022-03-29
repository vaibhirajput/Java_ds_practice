public class linkl {
    Node head;
    public static void main(String[] args) {
        linkl list = new linkl();
        list.addfrist(455);
        list.addfrist(89);
        list.addfrist(1);
        list.addlast(1000);
        list.deletfirst();
        list.deletlast();
        list.print();
    }

    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    //addfirst method
    public void addfrist(int data){
        Node newnode = new Node(data);
        if (head == null){
            head= newnode;

            return;
        }
        newnode.next= head;
        head = newnode;
    }
    //addlast method
    public void addlast(int data){
        Node newnode = new Node(data);
        if (head == null){
           head= newnode;
            return;
        }
        Node currentnode = head;
        while(currentnode.next != null){
            currentnode= currentnode.next;
        }
        currentnode.next = newnode;
    }
    public void print(){
        if (head == null){
            System.out.println("list is empty");
            return;
        }
        Node currentnode = head;
        while(currentnode != null){
            System.out.print(currentnode.data + " ");
            currentnode= currentnode.next;
        }

    }
    public void deletfirst(){
        if (head == null){
            System.out.print("List is Empty");
            return;
        }
        head = head.next;
    }
    public void deletlast(){
        if (head == null) {
            System.out.print("List is Empty");
            return;
        }
        Node secondcurrnode =head;
        Node firtcrrnode= head.next;
        while (firtcrrnode.next!=null){
            firtcrrnode= firtcrrnode.next;
            secondcurrnode=secondcurrnode.next;
        }
secondcurrnode.next=null;
    }
}

