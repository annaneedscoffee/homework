package lab4.dateutils;

import java.time.LocalDateTime;

//date string format: dd/mm/yyyy, hr:min

public class DateUtils {

    public static String dateToString(LocalDateTime date){

        return (date.getDayOfMonth()<10 ? "0"+date.getDayOfMonth() : date.getDayOfMonth() )
                +"/"+(date.getMonthValue()<10 ? "0"+date.getMonthValue() : date.getMonthValue() )
                +"/"+date.getYear()
                + ", "+(date.getHour()<10 ? "0"+date.getHour() : date.getHour() )
                +":" +(date.getMinute()<10 ? "0"+date.getMinute() : date.getMinute() );

    }

    public static LocalDateTime stringToDate(String str){

        int day = Integer.parseInt(str.substring(0,2));
        int month = Integer.parseInt(str.substring(3,5));
        int year = Integer.parseInt(str.substring(6,10));
        int hour = Integer.parseInt(str.substring(12,14));
        int minute = Integer.parseInt(str.substring(15,17));
        return LocalDateTime.of(year,month,day,hour, minute);

    }
    public static void main(String[] args){
        LocalDateTime now = LocalDateTime.now();
        System.out.println(dateToString(now));
        String str = "19/08/2021, 19:44";
        System.out.println(stringToDate(str));
    }
}
