
import java.time.*;
import java.util.Scanner;
import java.util.ArrayList;

public class Attendance {

    public static void main(String[] args) {
        ArrayList<String> checkInNames = new ArrayList<>();
        ArrayList<String> names = new ArrayList<>();
        names.add("Oscar");
        names.add("JD");
        names.add("Angie");
        names.add("Derek");
        names.add("Dylan");
        names.add("Dakota");
        names.add("Devin");
        names.add("Gillian");
        names.add("Tyler");
        names.add("Brock");
        names.add("Destiny");
        names.add("Christian");
        String dayOfTheWeek = LocalDate.now().getDayOfWeek().name();
        System.out.println(names);
        System.out.println("(case sensitive) What is your name:");
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        if (names.contains(name)) {
            System.out.println("Hello " + name);
            System.out.println("Today is " + dayOfTheWeek + " enter time please: ");
            Scanner inp = new Scanner(System.in);
            String clockIn = inp.nextLine();
            clockIn = clockIn.replace(":", "");
            int clocked = Integer.parseInt(clockIn);
            if (clocked < 830) {
                names.remove(name);
                checkInNames.add(name);
                System.out.println("Good job, you are not tardy");
            } else {
                System.out.println("TARDY");
            }
            clockIn = String.valueOf(clockIn);
            System.out.println("The people who haven't checked in are");
            System.out.println(names);
            System.out.println("People who have Checked in are ");
            System.out.println(checkInNames);
            in.close();
            inp.close();
        } else {
            System.out.println("Sorry name does not match our records");
        }

    }

}