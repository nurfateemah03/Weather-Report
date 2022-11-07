

public class Reading {
	 private Time Time;
	 private double temp;
     private	double amtRain;
	
     
     public Reading(Time Time, double temp, double amtRain){
 		this.Time = Time;
 		this.temp = temp;
 		this.amtRain = amtRain;
 	}
     
 	//returns the temperature
 	public double getTemp() {
 		
         return temp;
     }
 	
 	
 	//returns the current time
     public Time getCurrentTime() {
    	 
         return Time;
     }
     
     public double getAmtRain() {
    	 return amtRain;
    	 
 }
	

}
