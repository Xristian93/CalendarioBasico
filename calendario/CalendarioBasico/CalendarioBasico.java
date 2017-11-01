
/**
 * This is a normal calendar
 */
public class CalendarioBasico
{
    // the day of the calendar
    private int day;
    // the month of the calendar
    private int month;
    // the year of the calendar
    private int year;

    /**
     * Constructor for objects of class CalendarioBasico
     */
    public CalendarioBasico()
    {
        day = 1;
        month = 1;
        year = 1;
    }

    /**
     * Set the calendar date
     */
    public void setDate(int actualDay, int actualMonth, int actualYear)
    {
        if (actualDay > 0 || actualMonth > 0 || actualYear >0){
            day = actualDay;
            month = actualMonth;
            year = actualYear;
        }
        else{
            System.out.println ("You have to input a correct date");
        }
    }

    /**
     * Print calendar date
     */
    public String printDate()
    {
        String date;
        String dayString;
        String monthString;
        String yearString;
        dayString = String.valueOf(day);
        monthString = String.valueOf(month);
        yearString = String.valueOf(year);

        if (dayString.length() == 1){
            dayString = "0" + dayString.substring(0,1);
        }
        else{
            dayString = dayString.substring(0);
        }
        if (monthString.length() == 1){
            monthString = "0" + monthString.substring(0,1);
        }
        else{
            monthString = monthString.substring(0);
        }
        if (yearString.length() == 1){
            yearString = "0" + yearString.substring(0,1);
        }
        else{
            yearString = yearString.substring(0);
        }

        date = dayString + ("-") + monthString + ("-") + yearString;
        return date;
    }
}
