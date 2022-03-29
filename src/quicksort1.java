 class quickSort1 {
    public static void main(String[] args) {
        int[] arr = {45, 89, 2, 10, 90, 1, 50, 78, 23, 45};
        int L = arr.length;
        quickSort1 q1 = new quickSort1();
        q1.addAndSort(arr, 0, L-1);
        q1.Print(arr);

    }

    public static int quickDivide(int[] arr, int low, int high) {
        int pivot = arr[low+(high-low)/2];

        while (low <= high) {
            while (arr[low] < pivot) {
                low++;
            }
            while (arr[high] < pivot) {
                high--;
            }
            if (low <= high) {
                int temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;
                low++; high--;
            }

        }
        return low;
    }
    public static void addAndSort(int[]arr, int low, int high){
        int pi = quickDivide(arr, low, high);
        if (low<pi-1){
            addAndSort(arr,low, pi-1 );
        }
        if (pi<high){
            addAndSort(arr, pi+1, high);

        }
    }
    public void Print(int[]arr){
        for (int i :arr){
            System.out.print(i+ " ");
        }
    }
}
