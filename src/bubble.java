public class bubble {
    public void bb(int [] arr){
        for (int i=0; i<arr.length-1; i++){
            for (int j=0; j<arr.length-i-1; j++){
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for (int a= 0; a<arr.length; a++){
            System.out.print(arr[a] + " ");
        }
    }

    public static void main(String[] args) {
        int [] arr = {45,78,112,45,89,23,45,77,89,12,10,4,7,2,};
        bubble bs = new bubble();
    bs.bb(arr);
}
    }