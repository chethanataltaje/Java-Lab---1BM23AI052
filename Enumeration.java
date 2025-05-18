
import java.util.Scanner;

public class Enumeration {
    public enum DayOfWeek{
        SUNDAY,MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;

        public boolean isWorkday(){
            return (this!= SATURDAY && this!= SUNDAY);
        }
    }

    public static void main(String[] args){
        System.out.println("Is monday a workday?"+ DayOfWeek.MONDAY.isWorkday());
        System.out.println("Is Saturday a workday? " + DayOfWeek.SATURDAY.isWorkday());
    }

}
