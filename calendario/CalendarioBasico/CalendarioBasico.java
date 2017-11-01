
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

}
