import java.util.Scanner;

public class condition2 {
    public static void main(String[] args) {
        condition2 c2 = new condition2();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number One");
        int One = sc.nextInt();
        System.out.println("Enter Number Two");
        int Two = sc.nextInt();
        System.out.println("Enter Number Three");
        int Three = sc.nextInt();
        c2.greater(One, Two, Three);


    }
    public void greater(int One , int Two, int Three){
        if (One<Two && Three<Two){
            System.out.println(Two + ". Number Two is greater");
        }
        else if (Two<One && Three<One){
            System.out.println(One + ". Number One is greater");
        }
        else {
            System.out.println(Three  + ". Number Three is greater");
        }
    }
}
