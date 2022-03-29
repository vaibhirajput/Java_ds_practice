import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int j =0; j<n; j++){
            a[j] = in.nextInt();
        }
        for (int i=0; i <n; i++){
            System.out.print( a[i] + " ");
        }

    }
}
