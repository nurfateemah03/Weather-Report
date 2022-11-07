import java.util.GregorianCalendar;
import java.util.LinkedList;

public class WeatherStation {
	  WeatherStation(){}
    
    private IDailyReport dailyReport;
    
    public WeatherStation (IDailyReport dailyReport) {
    	this.dailyReport = dailyReport;
    	
    }

    /**
     * consumes a date and a list of readings and stores a daily report for the given date in a LinkedList
     * @param date
     * @param readings
     */
    public void addTodaysReport(GregorianCalendar date, LinkedList<Reading> readings){
        LinkedList<Double> tempList = new LinkedList<Double>() ;
        LinkedList<Double> rainList = new LinkedList<Double>() ;
        
    }

    /**
     * takes a month and year and produces the average temp. over all days in that month
     * @param month
     * @param year
     * @return double
     */
    public double averageMonthTemp(int month, int year){
    	double avg = dailyReport.averageMonthTemp(month, year);
    	return avg;

    }

    /**
     * takes a month and a year and produces the total rainfall over all days in that month
     * @param month
     * @param year
     * @return double
     */
    public double totalMonthRainfall(int month, int year){
    	double rain = dailyReport.totalMonthRainfall(month, year);
    	return rain;

    }
    
  
    
  

}