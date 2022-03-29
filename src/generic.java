public class generic {
    public static void main(String[] args) {
        generic gn = new generic();
        Integer [] b1 = { 45,56,23,89,21,23,56};
        String [] b2 = { "vaibhav", "rohit", "kohli"};
        gn.genericc(b1);
        System.out.println();
        gn.genericc(b2);
    }
    public <t> void genericc(t [] arr){
        for (t x : arr){
            System.out.print(x+ " ");
        }


    }
}
