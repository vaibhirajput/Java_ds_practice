public class merge_rivision {
    public static void main(String[] args) {
        int[] arr = {5, 89, 23, 21, 35, 1, 58, 23, 2, 10};
        int n = arr.length;
        merge_rivision mr = new merge_rivision();

        divide(arr, 0, n - 1);

        for (int c = 0; c < arr.length; c++) {
            System.out.print(arr[c] + " ");
        }
    }

    public static void divide(int[] arr, int low, int high) {
        if (low <=high) {
            return;
        }
        int mid = low + (high-low) / 2;
        divide(arr, low, mid);
        divide(arr, mid + 1, high);
        conqure1(arr, low, mid, high);
    }

    public static void conqure1(int[] arr, int low, int mid, int high) {
        // making new arr
        int[] arr1 = new int[high - low + 1];
        int lowindx = low;
        int midindx = mid + 1;
        int x = 0;
        // merge arr
        while (lowindx <= mid && midindx <= high) {
            if (arr[lowindx] < arr[midindx]) {
                arr1[x] = arr[lowindx];
                x++ ; lowindx++;
            } else {
                arr1[x] = arr[midindx];
                x++; midindx++;

            }
        }
        // add last sort elements
        while (lowindx <= midindx) {
            arr1[x] = arr[lowindx];
            x++; lowindx++;
        }
        while (midindx <= high) {
            arr1[x] = arr[midindx];
            x++;
            midindx++;
        }
        // copy sort arr in original arr
        for (int i = 0, j = low; i < arr1.length; i++, j++) {
            arr[j] = arr1[i];
        }

    }

}


