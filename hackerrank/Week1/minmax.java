import java.util.*;

public class Solution {
    public static void miniMaxSum(List<Integer> arr) {
        long total = 0;
        int min =  arr.get(0);
        int max =  arr.get(0);

        for (int num : arr) {
             total +=  num;
            if ( num <  min) {
                 min =  num;
            }
            if ( num >  max) {
                 max =  num;
            }
        }

        long  minsum =  total -  max;
        long  maxsum =  total -  min;

        System.out.println( minsum + " " +  maxsum);
    }

    public static void main(String[] args) {
        Scanner  input = new Scanner(System.in);
        List<Integer>  arr = new ArrayList<>();

        for (int  i = 0;  i < 5;  i++) {
             arr.add( input.nextInt());
        }

        miniMaxSum( arr);
    }
}
