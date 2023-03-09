package AppointmentEnum;

public class Main {
    public static void main(String[] args){

        Appointment app1 = new Appointment(Weekday.FRIDAY);
        Appointment app2 = new Appointment(Weekday.MONDAY);
        Appointment app3 = new Appointment(Weekday.THURSDAY);

        System.out.println(app1.getWeekday());
        System.out.println(app2.getWeekday());
        System.out.println(app3.getWeekday());

        System.out.println(Weekday.FRIDAY.getAbbreviation());


    }
}