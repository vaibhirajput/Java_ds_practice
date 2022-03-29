public class insertion3 {
    public static void main(String[] args) {
        int [] arr ={45,89,12,45,78,23,45,1,8,99,2,98};
        s3(arr);

    }
    public static void s3(int[]arr){
        int temp;
        int j;
        for (int i=1;i<arr.length;i++){
             temp = arr[i];
             j=i;
            while(j>0 && arr[j-1]>temp){
                arr[j] = arr[j-1];
                j=j-1;
            }
            arr[j]= temp;
        }
        for (int a=0; a<arr.length;a++){
            System.out.print(arr[a]+" ");
        }
    }
}
