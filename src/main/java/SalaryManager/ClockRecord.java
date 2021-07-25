package SalaryManager;

public class ClockRecord {

    private String identification;
    private int year;
    private int day;
    private int month;
    private double timeStart;
    private double timeEnd;

    public ClockRecord(String identification, int year, int day, int month, double timeStart, double timeEnd) {
        this.identification = identification;
        this.year = year;
        this.day = day;
        this.month = month;
        this.timeStart = timeStart;
        this.timeEnd = timeEnd;
    }

    public String getIdentification() {
        return identification;
    }

    public int getYear() {
        return year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public double getTimeStart() {
        return timeStart;
    }

    public double getTimeEnd() {
        return timeEnd;
    }
}
