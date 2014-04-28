package com.cmuprogramming.diagnostic.ambarishkarole;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

//testing now
public class DateCheck {

	public boolean isDateValid(String dateToCheck) { //method to check if a date is valid

		SimpleDateFormat formatedDate = new SimpleDateFormat("MM-dd-yyyy");
		formatedDate.setLenient(false);

		try {

			Date date = formatedDate.parse(dateToCheck);// an invalid date will throw a ParseException

		} catch (ParseException ex) {
			ex.printStackTrace();
			return false;
		}

		return true;
	}

	public boolean compareDates(String departureDate, String returnDate) {  //method to compare two dates
		Boolean flag = false;

		try {

			SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
			Date departureDt = dateFormat.parse(departureDate); // converting departureDate into a Date object departureDt
			Date returnDt = dateFormat.parse(returnDate);      // converting returnDate into a Date object returnDt

			//Calendar's getInstance method returns a Calendar object whose calendar fields have been initialized with the current date and time
			Calendar departureDateCal = Calendar.getInstance(); //  Initializing departureDateCal
			Calendar returnDateCal = Calendar.getInstance();    //  Initializing returnDateCal
			departureDateCal.setTime(departureDt); // setting departureDt into Calender departureDateCal object
			returnDateCal.setTime(returnDt); // setting returnDt into Calender returnDateCal object

			if (departureDateCal.before(returnDateCal)
					|| departureDateCal.equals(returnDateCal)) {

				flag = true;// departureDate is before or equal to returnDate
			}

		} catch (ParseException ex) {
			ex.printStackTrace();

		}

		return flag;
	}

}