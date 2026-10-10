import java.io.*;
import java.time.LocalDate;

class Result {
    public static String findDay(int month, int day, int year) {
        
        int m = month;
        int d = day;
        int y = year;
        LocalDate date = LocalDate.of(y,m,d);
        String wday = date.getDayOfWeek().toString();
        return wday;
    }
}

public class DateA {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        
        // Read input from the console
        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);
        int day = Integer.parseInt(firstMultipleInput[1]);
        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);

        // Print directly to console for quick testing
        System.out.println("The day is: " + res);

        bufferedReader.close();
    }
}