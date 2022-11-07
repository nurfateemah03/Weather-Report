
import java.util.GregorianCalendar;
import java.util.LinkedList;

/**
 * The class that represents the weather report for a certain date
 * includes a list of temperatures and a list of the amount of rainfall at different times
 */
public class TodaysWeatherReport{
    private  GregorianCalendar date ;
    private LinkedList<Double> listOfTemp ;
   private LinkedList<Double> listOfRain ;

    TodaysWeatherReport(GregorianCalendar date, LinkedList<Double> listOfTemp, LinkedList<Double> listOfRain){
        this.date = date ;
        this.listOfTemp = listOfTemp ;
        this.listOfRain = listOfRain ;
    }
    
  
    public GregorianCalendar getDate() {
    	return date;
    	
    }
    
    /**
     * returns the average temperature of a list
     * @return
     */
    public double averageTemp() {
        double total = 0 ;
        int divisor = 0;
        for (Double c : listOfTemp) {
            total = total + c ;
            divisor = divisor +1;
        }
        return total/divisor ;
    }

    /**
     * returns the total amount of rainfall in a list
     * @return double
     */
    public double totalRainfall() {
        double total = 0 ;
        for (Double c : listOfRain) {
            total = total + c ;
        }
        return total ;
    }
    
  
 
 
}
