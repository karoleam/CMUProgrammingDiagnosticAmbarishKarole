package com.cmuprogramming.diagnostic.ambarishkarole;


import java.util.ArrayList;
import java.util.List;

public class Model1 { //this Model class defines the values for the combo boxes/spinners/ drop-down boxes
	String textInput;
	
	List<String> listMonths = new ArrayList<String>();
	List<String> listDays = new ArrayList<String>();
	List<String> listYear = new ArrayList<String>();
	List<String> listTime = new ArrayList<String>();
	List<String> listPassengersNo = new ArrayList<String>();
	

	public Model1() {

		listMonths.add("Month");		//Month data for the drop-down/spinner box
		listMonths.add("January");
		listMonths.add("February");
		listMonths.add("March");
		listMonths.add("April");
		listMonths.add("May");
		listMonths.add("June");
		listMonths.add("July");
		listMonths.add("August");
		listMonths.add("September");
		listMonths.add("October");
		listMonths.add("November");
		listMonths.add("December");
		
		listDays.add("Day");		//Day data for the drop-down/spinner box
		listDays.add("1");
		listDays.add("2");
		listDays.add("3");
		listDays.add("4");
		listDays.add("5");
		listDays.add("6");
		listDays.add("7");
		listDays.add("8");
		listDays.add("9");
		listDays.add("10");
		listDays.add("11");
		listDays.add("12");
		listDays.add("13");
		listDays.add("14");
		listDays.add("15");
		listDays.add("16");
		listDays.add("17");
		listDays.add("18");
		listDays.add("19");
		listDays.add("20");
		listDays.add("21");
		listDays.add("22");
		listDays.add("23");
		listDays.add("24");
		listDays.add("25");
		listDays.add("26");
		listDays.add("27");
		listDays.add("28");
		listDays.add("29");
		listDays.add("30");
		listDays.add("31");
		
		listYear.add("Year");  //Year data for the drop-down/spinner box
		listYear.add("2011");
		listYear.add("2012");
		
		listTime.add("anytime");  //Time data for the drop-down/spinner box
		listTime.add("morning");
		listTime.add("noon");
		listTime.add("evening");
		listTime.add("late night");
		
		listPassengersNo.add("1");  //Passenger's numbers data for the drop-down/spinner box
		listPassengersNo.add("2");
		listPassengersNo.add("3");
		listPassengersNo.add("4");
		listPassengersNo.add("5");
		listPassengersNo.add("6");
		listPassengersNo.add("7");
		listPassengersNo.add("8");
		listPassengersNo.add("9");
		listPassengersNo.add("10");
	}

	
	
	
	public List<String> getMonthSpinner() {
		return listMonths;

	}
	
	public List<String> getDaySpinner() {
		return listDays;

	}
	
	public List<String> getYearSpinner() {
		return listYear;

	}
	
	public List<String> getTimeSpinner() {
		return listTime;

	}
	
	public List<String> getPassengersNoSpinner() {
		return listPassengersNo;

	}


	public String getText() {
		return textInput;
	}


}