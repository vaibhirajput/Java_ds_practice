public class mergesort2 {
    public static void main(String[] args) {
        int[] arr = {75, 23, 252, 45, 28, 1, 2, 56, 89, 21, 2333, 5999, 5, 223, 874, 2, 9889, 52};
        int n = arr.length;
        divid2(arr,0 , n-1);
        int a=0;
        while (a<n) {
            System.out.print(arr[a] +" ");
            a++;
        }
    }

    public static void divid2(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }
        int mid = start + (end - start) / 2;
        divid2(arr, start, mid);
        divid2(arr, mid + 1, end);
        conqure2(arr, start, mid, end);
    }

    public static void conqure2(int[] arr, int start, int mid, int end) {
        int[] copy2 = new int[end - start + 1];
        int indx1 = start;
        int indx2 = mid + 1;
        int x = 0;
        while (indx1 <= mid && indx2 <= end) {
            if (arr[indx1] < arr[indx2]) {
                copy2[x] = arr[indx1];
                x++;
                indx1++;
            } else {
                copy2[x] = arr[indx2];
                x++;
                indx2++;
            }
        }
        while (indx1 <= mid) {
            copy2[x] = arr[indx1];
            x++;
            indx1++;
        }
        while (indx2 <= end) {
            copy2[x] = arr[indx2];
            x++;
            indx2++;
        }
        for (int i=0, j=start; i<copy2.length;i++,j++ ){
            arr[j] = copy2[i];
        }
    }
}
