public class quickSort2 {
    public static void main(String[] args) {
        int[] arr = {78,89,2,100,47,23,1,56,99,60,33};
        int n = arr.length-1;
        quickSort2 q2 = new quickSort2();
        q2.Recursion(arr,0, n);
        q2.Pp(arr);
    }
     int partitions(int[] arr, int low, int high){
        int pivot = arr[low];
        while (low <= high){
            while (arr[low]< pivot){
                low++;
            }
            while (arr[high]>pivot){
                high++;
            }
            if (low<=high){
                int temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;
                low++;
                high--;
            }
        }
        return low;
    }
      void Recursion(int []arr, int low, int high){
        int pi = partitions(arr, low, high);
        if (low< pi-1){
            Recursion(arr, low, pi-1);
        }
        if (pi<high){
            Recursion(arr,pi,high);
        }
        }
        void Pp(int[]arr){
        for (int i :arr){
            System.out.print(arr[i] + " ");
        }
        }

    }

