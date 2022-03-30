public class question1 {
    public static void main(String[] args) {
         question1 q1 = new question1();
          int n =4;
          System.out.println(q1.fact(n));

    }

    public int fact(int n) {
        if (n == 0) {
            return 1;
        } else {
            return (n * fact(n - 1));

        }
    }
}