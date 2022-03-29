import java.util.Scanner;

public class binarysearch {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        binarysearch b1 = new binarysearch();
        Scanner intput = new Scanner(System.in);
        int key = intput.nextInt();
        int l = 0;
        int h = arr.length;
        b1.bs(arr, key, l, h);
    }

    public int bs(int[] arr, int key, int l, int h) {

        while (l <= h) {
            int mid = (l + h) / 2;
            if (arr[mid] == key) {
                System.out.println("Element is present " + arr[mid]);
                break;
            }
            else if (arr[mid] < key) {
                l = mid + 1;
            }
            else if (arr[mid] > key) {
                h = mid - 1;
            }

        }
        return -1;
    }
}