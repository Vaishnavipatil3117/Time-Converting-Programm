import java.util.Scanner;

public class Time {
    public static String convertTime(String s) {
        int hours = Integer.parseInt(s.substring(0, 2));
        int minutes = Integer.parseInt(s.substring(3, 5));
        int seconds = Integer.parseInt(s.substring(6, 8));
        String period = s.substring(9);

        if (period.equals("PM") && hours != 12) {
            hours += 12;
        } else if (period.equals("AM") && hours == 12) {
            hours = 0;
        }

        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter time in 12-hour format (hour:minute:second AM/PM): ");
        String time = sc.nextLine();
        String time1 = convertTime(time);
        System.out.println("The 24-hour format time is: " + time1);
    }
}
