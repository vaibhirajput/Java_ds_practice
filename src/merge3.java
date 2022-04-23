import java.util.*;
public class merge3 {
    public static void main(String args[]) {
        int a[] =  {3, 3, 2,1,1,2,3, 3, 4, 5};

        int max = -1;
        for(int i =0; i <a.length; i++) {
            max = Math.max(max, a[i]);
        }

        int freq[] = new int[max + 1];

        for(int i =0; i <a.length; i++) {
            freq[a[i]] += 1;
        }

        int ans[] = new int[a.length];
        Arrays.fill(ans, -1);

        for(int i = 0; i<a.length; i++)
        {
            int currFreq = freq[a[i]];

            for(int j = 0; j < freq.length; j++) {
                if(j != a[i]  && freq[j] >= currFreq) {
                    ans[i] = j;
                    break;
                }
            }

        }

        System.out.println(Arrays.toString(ans));

    }
}



