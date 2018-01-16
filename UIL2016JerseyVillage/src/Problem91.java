/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.*;
import java.util.*;

/**
 *
 * @author S542046
 */
public class Problem91 {

    public static String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday",
        "Thursday", "Friday", "Saturday"};

    public static String colonAt(String s, int minValue) {
        String string = "";
        for (int index = minValue; index < (s.length() - minValue); index++) {
            if (s.charAt(index) == ':') {
                string = s.substring(minValue, index);
                break;
            }
        }
        return string;
    }

    public static int idDay(String s) {
        int day = 0;
        for (int index = 0; index < days.length; index++) {
            if (days[index] == s) {
                day = index;
                break;
            }
        }
        return day;
    }

    public static void main(String[] args) throws IOException {
        Scanner file = new Scanner(new File("PR91.dat"));

        int iteration = file.nextInt();
        for (int index = 0; index < iteration; index++) {
            String[] dateTime = new String[3];

            dateTime[0] = file.next();
            int dateId = idDay(dateTime[0]);
            dateTime[1] = file.next();
            dateTime[2] = file.next();

            int hour = Integer.parseInt(dateTime[1].substring(0, 1));
            int minute = Integer.parseInt(dateTime[1].substring(3, 4));
            int second = Integer.parseInt(dateTime[1].substring(6, 7));

            int elapsedHour = Integer.parseInt(dateTime[2].substring(0, 1));
            int elapsedMinute = Integer.parseInt(dateTime[2].substring(3, 4));
            int elapsedSecond = Integer.parseInt(dateTime[2].substring(6, 7));

            int finalHour = hour + elapsedHour;
            int finalMinute = minute + elapsedMinute;
            int finalSecond = second + elapsedSecond;

            if (finalHour >= 24) {
                dateTime[0] = days[dateId + 1];
                finalHour -= 24;
            }
            if (finalMinute >= 60) {
                finalHour += 1;
                finalMinute -= 60;
            }
            if (finalSecond >= 60) {
                finalMinute += 1;
                finalSecond -= 60;
            }

            System.out.println(dateTime[0] + " " + finalHour + ":" + finalMinute + ":" + finalSecond);
        }
    }

}
