public class link2 {
    Node head;

    public static void main(String[] args) {
        link2 list = new link2();
        list.addfirst("vaibhav");
        list.addlast("rajput");
        list.addlast("is a good boy");
        list.deletfist();
        list.deletlast();
        list.addfirst("ko");
        list.print();
    }

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    //addfirst method
    public void addfirst(String data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            return;
        }
        newnode.next= head;
        head = newnode;
    }

    //addlast method
    public void addlast(String data) {
        Node newnode = new Node(data);
        if (head==null){
            head = newnode;
            return;
        }
        Node currnode = head;
        while(currnode.next!=null){
            currnode=currnode.next;
        }
        currnode.next=newnode;

    }
    //firstdelet method
    public void deletfist(){
        if (head == null){
            System.out.print("List is Empty");
            return;
        }
        head=head.next;
    }
    //deletlast method
    public void deletlast(){
    if (head==null) {
            System.out.print("List is Empty");
            return;
        }
    Node fistnode=head.next;
    Node secondnode=head;
    while (fistnode.next!=null){
        fistnode=fistnode.next;
        secondnode=secondnode.next;
    }
    secondnode.next=null;

    }
    public void print(){
        if (head==null) {
            System.out.print("List is Empty");
            return;
        }
        Node currnode=head;
        while (currnode!=null){
            System.out.print(currnode.data+ " ");
            currnode=currnode.next;
        }

    }
}