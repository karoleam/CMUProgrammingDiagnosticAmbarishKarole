package com.cmuprogramming.diagnostic.ambarishkarole;

public class Itinerary { // an object of this class will contain all the information in an itinerary

	String departureCity, destinationCity, departureMonth,
			departureMonthNumeric, departureDay, departureYear, departureTime,
			returnMonth, returnMonthNumeric, returnDay, returnYear, returnTime,
			passengersNo, monthNumeric;

	public String getDepartureMonthNumeric() { 
		return departureMonthNumeric;
	}

	public void setDepartureMonthNumeric(String month) { // setting departure month in a numeric format
		departureMonthNumeric = toMonthNumeric(month);
	}

	public String getReturnMonthNumeric() {
		return returnMonthNumeric;
	}

	public void setReturnMonthNumeric(String month) {// setting return in a numeric form
		returnMonthNumeric = toMonthNumeric(month);
	}

	public String getReturnMonth() {
		return returnMonth;
	}

	public void setReturnMonth(String returnMonth) {
		this.returnMonth = returnMonth;
	}

	public String getReturnDay() {
		return returnDay;
	}

	public void setReturnDay(String returnDay) { 
		if (returnDay.equals("Day")) {  //check if "Day" was selected
			this.returnDay = "Invalid";
		} else {
			this.returnDay = returnDay;
		}
	}

	public String getReturnYear() {
		return returnYear;
	}

	public void setReturnYear(String returnYear) {

		if (returnYear.equals("Year")) {  //check if "Year" was selected
			this.returnYear = "Invalid";
		} else {
			this.returnYear = returnYear;
		}

	}

	public String getReturnTime() {
		return returnTime;
	}

	public void setReturnTime(String returnTime) {
		this.returnTime = returnTime;
	}

	public String getPassengersNo() {
		return passengersNo;
	}

	public void setPassengersNo(String passengersNo) {
		this.passengersNo = passengersNo;
	}

	public String getDepartureDay() {
		return departureDay;
	}

	public void setDepartureDay(String departureDay) {
		if (departureDay.equals("Day")) {   //check if "Day" was selected
			this.departureDay = "Invalid";
		} else {
			this.departureDay = departureDay;
		}
	}

	public String getDepartureYear() {
		return departureYear;
	}

	public void setDepartureYear(String departureYear) {

		if (departureYear.equals("Year")) { //check if "Year" was selected
			this.departureYear = "Invalid";
		} else {
			this.departureYear = departureYear;
		}
	}

	public String getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}

	public String getDepartureCity() {
		return departureCity;
	}

	public void setDepartureCity(String departureCity) {

		this.departureCity = departureCity;
	}

	public String getDestinationCity() {
		return destinationCity;
	}

	public void setDestinationCity(String destinationCity) {
		this.destinationCity = destinationCity;
	}

	public String getDepartureMonth() {
		return departureMonth;
	}

	public void setDepartureMonth(String month) {

		this.departureMonth = month;

	}

	public String toMonthNumeric(String month) {   // method to convert a month to it's numeric value

		Months currentMonth = Months.valueOf(month);
		switch (currentMonth) {
		case January:
			this.monthNumeric = "01";
			break;
		case February:
			this.monthNumeric = "02";
			break;
		case March:
			this.monthNumeric = "03";
			break;
		case April:
			this.monthNumeric = "04";
			break;
		case May:
			this.monthNumeric = "05";
			break;
		case June:
			this.monthNumeric = "06";
			break;
		case July:
			this.monthNumeric = "07";
			break;
		case August:
			this.monthNumeric = "08";
			break;
		case September:
			this.monthNumeric = "09";
			break;
		case October:
			this.monthNumeric = "10";
			break;
		case November:
			this.monthNumeric = "11";
			break;
		case December:
			this.monthNumeric = "12";
			break;

		case Month:
			this.monthNumeric = "Invalid";
			break;
		}
		return monthNumeric;
	}

	public enum Months {
		January, February, March, April, May, June, July, August, September, October, November, December, Month
	}

}
