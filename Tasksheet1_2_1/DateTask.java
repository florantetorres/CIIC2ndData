public class DateTask {
    // instance variables
    private byte day;
    private byte month;
    private short year;
    /**
     * No-args constructor
     */
    public DateTask() {
        this(1, 1, 1); // default date
    }
    /**
     * Constructor with 3 arguments
     * @param m month
     * @param d day
     * @param y year
     */
    public DateTask(int m, int d, int y) {
        setDate(m, d, y);
    }
    /**
     * Returns the date in the format "MM/dd/yyyy"
     */
    public String toString() {
        return String.format("%d/%d/%d", month, day, year);
    }
    /**
     * Sets the date
     * @param m month
     * @param d day
     * @param y year
     */
    public void setDate(int m, int d, int y) {
        if (valid(d, m, y)) {
            day = (byte) d;
            year = (short) y;
            month = (byte) m;
        } else {
            day = (byte) 0;
            year = (short) 0;
            month = (byte) 0;
        }
    }
    /**
     * Prints leap years from 1980 to 2023
     */
    public static void leapYears() {
        for (int i = 1980; i <= 2023; i = i + 4) {
            if (((i % 4 == 0) && (i % 100 != 0)) || (i % 400 == 0))
                System.out.println("The year " + i + " is a leap year");
        }
    }
    /**
     * Returns the day
     */
    public int getDay() {
        return day;
    }
    /**
     * Sets the day
     * @param day day
     */
    public void setDay(int day) {
        if (valid(day, month, year)) {
            this.day = (byte) day;
        } else {
            this.day = (byte) 0;
        }
    }
    /**
     * Returns the month
     */
    public int getMonth() {
        return month;
    }
    /**
     * Sets the month
     * @param month month
     */
    public void setMonth(int month) {
        if (valid(day, month, year)) {
            this.month = (byte) month;
        } else {
            this.month = (byte) 0;
        }
    }
    /**
     * Returns the year
     */
    public int getYear() {
        return year;
    }
    /**
     * Sets the year
     * @param year year
     */
    public void setYear(int year) {
        if (valid(day, month, year)) {
            this.year = (short) year;
        } else {
            this.year = (short) 0;
        }
    }
    /**
     * Checks if the date is valid
     * @param day day
     * @param month month
     * @param year year
     * @return true if the date is valid, false otherwise
     */
    private boolean valid(int day, int month, int year) {
        if (day > 31 || day < 1 || month > 12 || month < 1 || year < 1) {
            System.out.println("Attempting to create a non-valid date " + month + "/" + day + "/" + year);
            return false;
        }
        switch (month) {
            case 4:
            case 6:
            case 9:
            case 11:
                return (day <= 30);
            case 2:
                return day <= 28 || (day == 29 && ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0));
        }
        return true;
    }
}
