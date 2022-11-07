import java.util.LinkedList;

public interface IDailyReport {
	
	// helps test AddTodaysReport
	public LinkedList<TodaysWeatherReport> testList();
	   /**
     * consumes a date and a list of readings and stores a daily report for the given date in a LinkedList
     * @param date
     * @param readings
     */
	public double averageMonthTemp(int month, int year);
	 /**
     * takes a month and a year and produces the total rainfall over all days in that month
     * @param month
     * @param year
     * @return double
     */
	 public double totalMonthRainfall(int month, int year);
	 /**
	     * Adds TodaysWeatherReport to IDailyReport
	     * @param add
	     * @return void
	     */
	 public void add(TodaysWeatherReport add);

	    

}
