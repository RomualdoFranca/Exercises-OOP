package entitiesDayOfWeek;

public class DayOfWeek {

    private int day;

    public DayOfWeek(int day) {
        this.day = day;
    }

    public int getDay() {

        return day;
    }

    public int setDay(int day) {

        switch (day) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid day"); // Usa-se o defaut ao inves do if para validar os parametros
                break;
        }
        return this.day;
    }
}
