public class salection {
    public static void main(String[] args) {
        int[] arr = {11,56,21,45,89,21,87,12,45,77};
        selection1(arr);
    }
    public static void selection1(int [] arr){
        for (int i=0; i<arr.length; i++){
            int min=i;
            for (int j=i+1; j<arr.length; j++){
                if (arr[j]<arr[min]){
                    min=j;
                }
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;

            }

        }
        for (int a=0; a<arr.length; a++){
            System.out.print(arr[a]+ " ");
        }
    }
}
