import java.util.Scanner;

class source {
    public static void main(String[] args) {
        Scanner inpt = new Scanner(System.in);
        int count = inpt.nextInt();
        int[] array = new int[count];
        for (int i = 0; i < count - 1; i++) {
            array[i] = inpt.nextInt();
        }
        int key = inpt.nextInt();
        for (int j = count-1; j>0; j--){
            if (array[j]== key){
                System.out.println(j);
                return;
            }
        }
    }


    }



