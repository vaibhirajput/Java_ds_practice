public class array {
    public static void main(String[] args) {
        int [][]a1= {{1,2,8},{2,1,8},{10,9 ,1}};
        int [][] b2= {{8,5,1},{2,2,6},{3,4,7}};
        int [][]b3=new int[2][2];
        for (int i =0; i<a1.length-1;i++){
            for (int j=0; j<b2.length-1;j++){
                int a = a1[i][j];
                int b = b2[i][j];
                b3[i][j] = a+b;
                System.out.println(b3[i][j]+ " ");
            }
        }
    }
}
