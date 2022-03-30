import java.util.Scanner;

public class positive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n - 1; i++) {
            arr[i] = sc.nextInt();
        }

    }

    public void positive(int[] arr, int n) {
        int positive = 0;
        int nagetive = 0;
        for (int j = 0; j < n - 1; j++) {
            if (arr[j] > 0) {
                positive++;
            }
            if (arr[j] < 0) {
                nagetive++;
            }

            System.out.println("positive" + positive);
            System.out.println("negative " + nagetive);
        }
    }

}
