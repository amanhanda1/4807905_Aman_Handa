import java.util.Scanner;

public class Solution {
    public static String timeConversion(String time) {
        String meridian = time.substring(8); 
        int hour = Integer.parseInt(time.substring(0, 2));
        String minutes_seconds = time.substring(2, 8); 
        if (meridian.equals("AM")) {
            if (hour == 12) {
                hour = 0;
            }
        } else {
            if (hour != 12) {
                hour += 12;
            }
        }
        String result = String.format("%02d%s", hour, minutes_seconds);
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String output = timeConversion(input);
        System.out.println(output);
        scanner.close();
    }
}
