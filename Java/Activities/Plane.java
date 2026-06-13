package activities;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Plane {
	public List<String> passengers;
    public int maxPassengers;
    public Date lastTimeTookOf;
    public LocalDate lastTimeLanded;
    
    public Plane(int maxPassengers) {
    	this.maxPassengers = maxPassengers;
    	this.passengers = new ArrayList<>();
    }
    
    public void onboard(String passengerName) {
    	if(maxPassengers > passengers.size()) {
    		passengers.add(passengerName);
    	}else {
    		System.out.println("Sorry.! We are out of seats in the plan");
    	}
    }
    
    public LocalDate takeOff() {
    	LocalDate lastTimeTookOf = LocalDate.now();
    	//this.lastTimeTookOf = new Date();
    	return lastTimeTookOf;
    }
    
    public void land() {
    	this.lastTimeLanded = LocalDate.now();
    	
    }
    
    public LocalDate getLastTimeLanded() {
    	return this.lastTimeLanded;
    }

    public List getPassengers() {
    	return this.passengers;
    }
}
