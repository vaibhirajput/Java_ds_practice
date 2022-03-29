public class insertion2 {
    public static void main(String[] args) {
        int []arr = {89,52,122,889,1452,1,878,15,12,8,14,78};
        ins(arr);
    }
    public static void ins(int[] arr){
        int temp,j;
        for (int i=1; i<arr.length;i++){
            temp =arr[i];
            j=i;
            while (j>0 && arr[j-1] > temp){
                arr[j] = arr[j-1];
                j=j-1;
            }
            arr[j] = temp;
        }
        for (int a= 0; a<arr.length; a++){
            System.out.print(arr[a] +" ");
        }

    }
}
