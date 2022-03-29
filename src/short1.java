public class short1 {   //Bubble sort code //
    public  void ss(int [] arr){
        for (int i=0; i<arr.length-1; i++){
            for (int j=0; j<arr.length-i-1; j++){
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for (int a =0; a<arr.length; a++){
            System.out.print(arr[a]+ " ");
        }
    }

    public static void main(String[] args) {
        int [] arr = {45,21,54,78,23,89,1,45,45,45,2,10,78,44,55,88,12,5};
        short1 sl = new short1();
        sl.ss(arr);
    }

}
