import java.util.Scanner;

public class Solution {
    public static void plusMinus(int[] arr) {
        int n = arr.length;
        int pc = 0;
        int nc = 0;
        int zc = 0;

        for (int num : arr) {
            if (num > 0) {
                pc++;
            } else if (num < 0) {
                nc++;
            } else {
                zc++;
            }
        }

        double pr = (double) pc/ n;
        double nr = (double) nc / n;
        double zr = (double) zc / n;

        System.out.printf("%.6f%n", pr);
        System.out.printf("%.6f%n", nr);
        System.out.printf("%.6f%n", zr);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        plusMinus(arr);
        scanner.close();
    }
}
