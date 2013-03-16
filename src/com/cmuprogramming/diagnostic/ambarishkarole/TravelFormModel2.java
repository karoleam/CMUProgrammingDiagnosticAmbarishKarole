package com.cmuprogramming.diagnostic.ambarishkarole;


import java.util.ArrayList;

public class TravelFormModel2 {//Business rules are implemented in this class and this Model class stores (in an Arraylist of correct Itinerary objects) the data entered into the form by the user

	String displayText;
	DateCheck dateCheckObj = new DateCheck();
	ArrayList<Itinerary>  itinerariesList = new ArrayList<Itinerary>(); // this array list stores correct Itinerary objects
	
	public void setItinerarytext(Itinerary itinerary) { // This method sets the text which will be displayed to the user when the Submit button is touched. This is done on the basis of whether the Itinerary object complied with the business rules.
		
		if ( itinerary.getDepartureCity().isEmpty()                                 
				|| itinerary.getDepartureCity().trim().isEmpty()) {   // Checking if Departure City is empty
			displayText = "Please enter a departure city.";   
		} else if (itinerary.getDestinationCity().isEmpty()
				|| itinerary.getDestinationCity().trim().isEmpty()) {      // Checking if Destination City is empty
			displayText = "Please enter a destination city.";

		} else if (itinerary.getDepartureMonthNumeric().equals("Invalid")) {  						 // Checking Departure Month
			displayText = "Please select a valid Departure Month.";
		}else if (itinerary.getDepartureDay().equals("Invalid")) { 									 // Checking Departure Day
			displayText = "Please select a valid Departure Day.";
		}else if (itinerary.getDepartureYear().equals("Invalid")) {									// Checking Departure Year
			displayText = "Please select a valid Departure Year.";
		} else if (itinerary.getReturnMonthNumeric().equals("Invalid")) {							// Checking Return Month
			displayText = "Please select a valid Return Month.";
		} else if (itinerary.getReturnDay().equals("Invalid")) {									// Checking Return Day
			displayText = "Please select a valid Return Day.";
		} else if (itinerary.getReturnYear().equals("Invalid")) {									// Checking Return Year
			displayText = "Please select a valid Return Year.";
		}else if(!dateCheckObj.isDateValid(itinerary.getDepartureMonthNumeric()+"-"+itinerary.getDepartureDay()+"-"+itinerary.getDepartureYear())){ //checking if departure date(MM-dd-yyyy)  is valid e.g 31st Feb 2012 is an invalid date 
			displayText = "Please select a valid Departure Date.";
		} else if(!dateCheckObj.isDateValid(itinerary.getReturnMonthNumeric()+"-"+itinerary.getReturnDay()+"-"+itinerary.getReturnYear())){ //checking if departure date(MM-dd-yyyy) is valid e.g 31st Nov 2012 is an invalid date 
			displayText = "Please select a valid Return Date.";
		} else if(!dateCheckObj.compareDates((itinerary.getDepartureMonthNumeric()+"-"+itinerary.getDepartureDay()+"-"+itinerary.getDepartureYear()), (itinerary.getReturnMonthNumeric()+"-"+itinerary.getReturnDay()+"-"+itinerary.getReturnYear()))){ //checking if departure date(MM-dd-yyyy) is valid e.g 31st Feb 2012 is an invalid date 
			displayText = "The Return Date should be on or after the departure date.";
		} else {
			itinerariesList.add(itinerary);											//adding the correct Itinerary Object in an ArrayList
			displayText = "Number of passengers: " + itinerary.getPassengersNo()       // setting up the text so that the Itinerary can be displayed                      
					+ "                                             "
					+ "Departure: " + itinerary.getDepartureCity()
					+ "                                             " + "Return: "
					+ itinerary.getDestinationCity()
					+ "                                             "
					+ "Departing: " + itinerary.getDepartureMonth() + " "
					+ itinerary.getDepartureDay() + " " + itinerary.getDepartureYear()
					+ " " + itinerary.getDepartureTime()
					+ "                                             "
					+ "Returning: " + itinerary.getReturnMonth() + " "
					+ itinerary.getReturnDay() + " " + itinerary.getReturnYear() + " "
					+ itinerary.getReturnTime();
		}		
	}

	public String getItineraryText() { 
		return displayText;  
	}
}