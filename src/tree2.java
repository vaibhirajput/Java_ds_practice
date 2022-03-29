import java.util.Scanner;

public class tree2 {
    static Scanner s2=null;
// Main method-
    public static void main(String[] args) {
        s2 = new Scanner(System.in);
       Node root = tree3();
       Inoder(root);
       System.out.println();
       preorder(root);
       System.out.println();
       postorder(root);
    }
    static Node tree3(){
        Node root= null;
        System.out.println("Enter data");
        int data = s2.nextInt();
        if (data==-1){
            return null;
        }
        root  = new Node(data);
        System.out.println("Enter left side of data " + data);
        root.left = tree3();
        System.out.println("Enter the right side of data " + data);
        root.right = tree3();
        return root;
    }
    static void Inoder(Node root){//LNR
        if (root==null){
            return;
        }
        Inoder(root.left);
        System.out.print(root.data + " ");
        Inoder(root.right);
    }
    static void preorder(Node root){//NLR
        if (root==null){
            return;
        }
        System.out.print(root.data+ " ");
        preorder(root.left);
        preorder(root.right);
    }
    static void postorder(Node root){//LRN
        if (root==null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+ " ");
    }
}

// Node class
class Node{
    Node left,right;
    int data;
    public Node(int data){
        this.data=data;
    }
}