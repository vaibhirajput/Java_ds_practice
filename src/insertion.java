public class insertion {
    public static void main(String[] args) {
        int [] arr = {48,96,23,45,12,78,89,54,21,56,2,100,5666,52,8,1,8999,23222,77};
        insertion1(arr);

    }
    public static void insertion1(int [] arr){
        int temp, j;
        for (int i=1; i<arr.length; i++){
            temp = arr[i];
            j = i;
            while (j>0 && arr[j-1]>temp){
                arr[j] = arr[j-1];
                j=j-1;
            }
            arr[j] =temp;
        }
        for (int a=0; a<arr.length;a++){
            System.out.print(arr[a]+ " ");
        }
    }
}
