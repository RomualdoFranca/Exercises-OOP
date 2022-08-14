package applicationDayOfWeek;

import entitiesDayOfWeek.DayOfWeek;

public class Main {
    public static void main(String[] args) {

        DayOfWeek dayOfWeek = new DayOfWeek(0);
        System.out.println(dayOfWeek);
        dayOfWeek.setDay(0);
        dayOfWeek.setDay(1);
        dayOfWeek.setDay(2);
        dayOfWeek.setDay(3);
        dayOfWeek.setDay(4);
        dayOfWeek.setDay(5);
        dayOfWeek.setDay(6);
        dayOfWeek.setDay(7);
        dayOfWeek.setDay(-7);

    }
}
