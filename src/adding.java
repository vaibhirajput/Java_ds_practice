public class adding {
    public void add() {

    }
        public static void main (String[]args){
            int no = 23556, num, sum = 0;
            while (no != 0) {
                num = no % 10;
                if (num % 2 == 0) {
                    sum = sum + num;
                }
                no = no / 10;
            }
            System.out.println(sum);
        }
    }




