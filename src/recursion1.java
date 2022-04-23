public class recursion1 {
    public static void main(String[] args) {

    }
    //print no power
    static void printSeries(int n) {

        if(n == 1) {
            System.out.print(1+" ");
            return ;
        }

        printSeries(n-1);

        System.out.print("+ x^" + (n-1));

    }
    // pandolam string check
    static boolean isPalin(String str, int si, int ei) {
        if(si > ei) return true;

        if(str.charAt(si) != str.charAt(ei)) return false;

        return isPalin(str, si + 1, ei - 1);

    }
// recursion linear search
    static int sum(int a[], int si) {

        if(si == a.length) {
            return 0;
        }

        int recAns = sum(a, si + 1);

        int myAns = a[si] + recAns;

        return myAns;

    }




    }

