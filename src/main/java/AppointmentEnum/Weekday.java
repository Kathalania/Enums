package AppointmentEnum;

public enum Weekday {

    MONDAY("Mon"),
    TUESDAY("Tue"),
    WEDNESDAY("Wed"),
    THURSDAY("Tue"),
    FRIDAY("Fry"),
    SATURDAY("Sat"),
    SUNDAY("Sun");

    private String abbreviation;
    private Weekday (String abbreviation){
    this.abbreviation = abbreviation;
}
    public String getAbbreviation() {
        return abbreviation;
    }
}
