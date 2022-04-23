public class mergesort {
    public static void main(String[] args) {
        int[] arr = {78, 56, 12, 78, 16, 23, 12,488,488,22,10,48,56,21,78,11,89,1225, 4, 1, 47, 89, 56};
        int n = arr.length;
        divide(arr, 0, n - 1);
        for (int a=0; a<n; a++){
            System.out.print(arr[a]+ " ");
        }

    }

    public static void divide(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }
        int mid = start + (end - start) / 2;
        divide(arr, start, mid);
        divide(arr, mid + 1, end);
        conqure(arr, start, mid, end);
    }

    public static void conqure(int[] arr, int start, int mid, int end) {
        int[] copy = new int[end - start + 1];
        int stx = start;
        int enx = mid + 1;
        int x = 0;
        while (stx <= mid && enx <= end) {
            if (arr[stx] < arr[enx]) {
                copy[x++] = arr[stx++];

            } else {
                copy[x++] = arr[enx++];

            }
        }
        while (stx <= mid) {
            copy[x++] = arr[stx++];

        }

        while (enx <= end) {
            copy[x++] = arr[enx++];

        }
        for (int i = 0, j = start; i < copy.length; i++, j++) {
            arr[j] = copy[i];
        }

    }
}

