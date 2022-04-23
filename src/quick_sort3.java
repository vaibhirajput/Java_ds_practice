public class quick_sort3 {
    public static void main(String[] args) {
                                   //
        int [] arr = {45,56,2,36,366,10,2,56,1,56,22};
        int n = arr.length;
        quick_sort3 qq = new quick_sort3();
        qq.quick(arr, 0,n-1);

            for (int i=0; i <n; i++){
                System.out.print(arr[i] + " ");
            }


    }
    public int partition(int [] arr , int start, int end){
      int pivot = arr[end];
      int i = start-1;
      for(int j= start; i<end; j++) {
          if (arr[j] < pivot) {
              i++;
              int tamp = arr[i];
              arr[i] = arr[j];
              arr[j] = tamp;
          }
      }
          i++;
          int tamp = arr[i];
          arr[i] = pivot;
          arr[end]= tamp;
        return i; // start return the pivot index
    }
    public void quick(int [] arr , int start, int end){
        if (start<end){
            int pivotindx = partition(arr, start, end);

            quick(arr, start, pivotindx-1);
            quick(arr , pivotindx+1, end);
        }
    }
}
