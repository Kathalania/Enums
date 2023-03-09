package AppointmentEnum;

public class Appointment {

    private Weekday weekday;

    public Appointment(Weekday weekday) {
        this.weekday = weekday;
    }

    public Weekday getWeekday() {
        return weekday;
    }

    public void setWeekday(Weekday weekday) {
        this.weekday = weekday;
    }
}
