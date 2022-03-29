public class arry_queue {
    public static void main(String[] args) {
        arry_queue aq = new arry_queue();
        aq.push(100);
        aq.push(56);
        aq.push(26);
        aq.push(66);
        aq.push(16);
        System.out.println(aq.pull());
        System.out.println(aq.pull());
        System.out.println(aq.pull());
        System.out.println(aq.pull());
        System.out.println(aq.pull());
        System.out.println(aq.pull());
        System.out.println(aq.pull());


    }
    int capacity = 5;
    int [] arr = new int[capacity];
    int rear = -1;
    public void push(int data){
        if (rear == capacity-1){
           System.out.println("Overflow");
           return;
        }
        rear++;
        arr[rear] = data;
    }
    //pull method
    public int pull() {
        if (rear == -1) {
            System.out.println("Queue is Empty");

        } else {
            int result = arr[0];
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];

            }

            rear--;
            return result;
        }
        return -1;
    }
}
