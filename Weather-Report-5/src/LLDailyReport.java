import java.util.LinkedList;
import java.util.GregorianCalendar;

public class LLDailyReport implements IDailyReport {

	private LinkedList<TodaysWeatherReport> dailyReports;


	public LLDailyReport() {
		this.dailyReports = new LinkedList<TodaysWeatherReport>();
	}

	public LinkedList<TodaysWeatherReport> getLldailyReports(){
		return dailyReports;
	}

	/**
	 * consumes a date and a list of readings and stores a daily report for the given date in a LinkedList
	 * @param date
	 * @param readings
	 */
	public double averageMonthTemp (int month, int year) {
		double total = 0;
		for (TodaysWeatherReport reportlist : dailyReports) {
			if(reportlist.getDate().get(GregorianCalendar.MONTH) == month && reportlist.getDate().get(GregorianCalendar.YEAR) == year) {
				total = total + reportlist.averageTemp();
			}				
		}

		return total;

	}

	/**
	 * takes a month and a year and produces the total rainfall over all days in that month
	 * @param month
	 * @param year
	 * @return double
	 */

	public double totalMonthRainfall(int month, int year) {
		double total = 0 ;
		for (TodaysWeatherReport clist : dailyReports) {
			if(clist.getDate().get(GregorianCalendar.MONTH) == month && clist.getDate().get(GregorianCalendar.YEAR) == year) {
				total = total + clist.totalRainfall() ;
			}

		}
		return total;
	}

	/**

	 * consumes a date and a list of readings and stores a daily report for the given date into a dailyReport
	 * @param date
	 * @param readings
	 */
	public void addTodaysReport(GregorianCalendar date, LinkedList<Reading> readings){
		LinkedList<Double> temperature = new LinkedList<Double>() ;
		LinkedList<Double> rainfall = new LinkedList<Double>() ;
		TodaysWeatherReport TodaysReport = new TodaysWeatherReport(date, temperature, rainfall) ;
		for (Reading c : readings){
			temperature.add(c.getTemp()) ;
			rainfall.add(c.getAmtRain()) ;
		}
		TodaysReport = new TodaysWeatherReport(date, temperature, rainfall) ;
	}

	@Override
	public void add(TodaysWeatherReport add) {
		// TODO Auto-generated method stub

	}

	@Override
	public LinkedList<TodaysWeatherReport> testList() {
		// TODO Auto-generated method stub
		return null;
	}
}
