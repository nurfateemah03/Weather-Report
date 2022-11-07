import org.junit.Test;

import static org.junit.Assert.assertEquals;


import java.util.GregorianCalendar;
import java.util.LinkedList;

public class Examples {
	
	LinkedList<Double> listoftemp1 = new LinkedList<Double>();
	double temp1 = 11;
	double temp2 = 22;
	double temp3 = 33;
	
	LinkedList<Double> listofrain1 = new LinkedList<Double>();
	double rain1 = 5;
	double rain2 = 10;
	double rain3 = 15;
	
	LinkedList<Double> listoftemp2 = new LinkedList<Double>();
	double temp4 = 30;
	double temp5 = 40;
	double temp6 = 40;
	
	LinkedList<Double> listofrain2 = new LinkedList<Double>();
	double rain4 = 3;
	double rain5 = 6;
	double rain6 = 9;
	
	LinkedList<Double> listoftemp3 = new LinkedList<Double>();
	double temp7 = 66;
	double temp8 = 77;
	double temp9 = 88;
	
	LinkedList<Double> listofrain3 = new LinkedList<Double>();
	double rain7 = 10;
	double rain8 = 20;
	double rain9 = 0;
	
	GregorianCalendar datedatePublic1;
	GregorianCalendar datePublic2;
	LLDailyReport report1; 
	WeatherStation report11;
	TodaysWeatherReport  today1;
	LinkedList<Reading> read1;
	LLDailyReport LLreport1;
	LLDailyReport LLreport2;
	 WeatherStation report2;
	 WeatherStation report3;
	
	public Examples() {
		
		listoftemp1.add(temp1);
		listoftemp1.add(temp2);
		listoftemp1.add(temp3);

		listofrain1.add(rain1);
		listofrain1.add(rain2);
		listofrain1.add(rain3);
		
		listoftemp2.add(temp3);
		listoftemp2.add(temp4);
		listoftemp2.add(temp5);

		listofrain2.add(rain3);
		listofrain2.add(rain4);
		listofrain2.add(rain5);

		
		listoftemp3.add(temp6);
		listoftemp3.add(temp7);
		listoftemp3.add(temp8);

		listofrain3.add(rain6);
		listofrain3.add(rain7);
		listofrain3.add(rain8);

    GregorianCalendar date1 = new GregorianCalendar(2020, 12, 3);
	GregorianCalendar date2 = new GregorianCalendar(2019, 1, 5);
	GregorianCalendar date3 = new GregorianCalendar(2021, 2, 7);

		
	TodaysWeatherReport  today1 = new TodaysWeatherReport(date1, listoftemp1, listofrain1);
	TodaysWeatherReport today2 = new TodaysWeatherReport(date2, listoftemp2, listofrain2);
	TodaysWeatherReport today3 = new TodaysWeatherReport(date3, listoftemp3, listofrain3);
 
report1 = new LLDailyReport();

	report1.add(today1);
	report1.add(today2);
	report1.add(today3);

	
 report11 = new WeatherStation(report1);
	

	
		Time time2 = new Time(10,00);
		Time time3 = new Time(5,10);
		Time time4 = new Time(6,01);
		
		Reading reading1 = new Reading(time2, 20, 30);
		Reading reading2 = new Reading(time3, 30, 50);
		Reading reading3 = new Reading(time4, 40, 20);
	
		
		read1 = new LinkedList<Reading>();
		read1.add(reading1);
		read1.add(reading2);
		read1.add(reading3);
	
		
		
		LLreport1 = new LLDailyReport();
		LLreport1.add(today1);
		LLreport1.add(today2);
		LLreport1.add(today3);
	
		
		LLreport2 = new LLDailyReport();
		LLreport2.add(today1);
		LLreport2.add(today2);
		LLreport2.add(today3);
		
		
		datePublic2 = new GregorianCalendar(2016, 11, 20);
	
		
		report2 = new WeatherStation(LLreport1);
		report3 = new WeatherStation(LLreport2);

}
	// tests the Average of a WeatherReport
	@Test
	public void testAvg(){	
        assertEquals(22, report1.averageMonthTemp(12, 2020),.1);
    }

	// tests the total rainfall
	@Test 
    public void testRain(){
        assertEquals(30, report11.totalMonthRainfall(2, 2021),.1);
    }
	// tests the addTodaysReport function
	@Test
	 public void testAdd(){
			report2.addTodaysReport(datePublic2, read1);	
	        assertEquals(LLreport2.testList(),LLreport1.testList());
	    }
	
	
}



