import java.util.Scanner;

public class condition1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Total classes.");
        int total_class = input.nextInt();
        System.out.println("Enter how many classes are you attended.");
        int attended_class = input.nextInt();
        condition1 c1 = new condition1();
        c1.percentage(total_class, attended_class);
    }

    public void percentage(int tc, int ac) {
        System.out.println("You need 75.0% to site in exam.");

        double a = (ac * 100) / tc;
        if (a >= 75.0) {
            System.out.println("You are eligible to site in exam. " + a + " %");
        }
        else {
            System.out.println("You are not eligible to site in exam. " + a + " %");
        }
    }
}