package com.cmuprogramming.diagnostic.ambarishkarole;


import com.cmuprogramming.diagnostic.ambarish.R;

import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;

class TravelFormController extends LinearLayout {

	
	public TravelFormController(Activity activity, final TravelFormModel1 myModel1, final TravelFormModel2 myModel2, final TravelFormView myView) {
		super(activity, null);
		LayoutInflater layoutInflater = (LayoutInflater)activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE); 
		View viewObj = layoutInflater.inflate(R.layout.form, this); // the form layout is inflated dynamically here 
		
		
		final Itinerary itineraryObj = new Itinerary();
		
		final EditText departureCity = (EditText) findViewById(R.id.etDepartureCity);    //Departure City
		final EditText destinationCity = (EditText) findViewById(R.id.etDestinationCity);   //Destination City
		
		
		//------------------------------ Month spinner
		final Spinner spinnerDepartureMonths = (Spinner) findViewById(R.id.spinnerDepartureMonths);//departure Month
		final Spinner spinnerReturnMonths = (Spinner) findViewById(R.id.spinnerReturnMonths);//To Month
		ArrayAdapter<String> dataAdapterMonths = new ArrayAdapter<String>(activity, android.R.layout.simple_spinner_item,myModel1.getMonthSpinner());
		dataAdapterMonths.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		spinnerDepartureMonths.setAdapter(dataAdapterMonths);//Departure Month
		spinnerReturnMonths.setAdapter(dataAdapterMonths);//Return Month
		//------------------------------ Day spinner
		final Spinner spinnerDepartureDays = (Spinner) findViewById(R.id.spinnerDepartureDays);//departure Day
		final Spinner spinnerReturnDays = (Spinner) findViewById(R.id.spinnerReturnDays);//To Day
		ArrayAdapter<String> dataAdapterDays = new ArrayAdapter<String>(activity, android.R.layout.simple_spinner_item,myModel1.getDaySpinner());
		dataAdapterDays.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		spinnerDepartureDays.setAdapter(dataAdapterDays);//From Day
		spinnerReturnDays.setAdapter(dataAdapterDays);//Return Day
		//------------------------------ Year spinner
		final Spinner spinnerDepartureYear = (Spinner) findViewById(R.id.spinnerDepartureYear);//departure Year
		final Spinner spinnerReturnYear = (Spinner) findViewById(R.id.spinnerReturnYear);//To Year
		ArrayAdapter<String> dataAdapterYear = new ArrayAdapter<String>(activity, android.R.layout.simple_spinner_item,myModel1.getYearSpinner());
		dataAdapterYear.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		spinnerDepartureYear.setAdapter(dataAdapterYear);//departure Year
		spinnerReturnYear.setAdapter(dataAdapterYear);//Return Year
		//------------------------------ time spinner
		final Spinner spinnerDepartureTime = (Spinner) findViewById(R.id.spinnerDepartureTime);//departure Time
		final Spinner spinnerReturnTime = (Spinner) findViewById(R.id.spinnerReturnTime);//To Time
		ArrayAdapter<String> dataAdapterTime = new ArrayAdapter<String>(activity, android.R.layout.simple_spinner_item,myModel1.getTimeSpinner());
		dataAdapterTime.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		spinnerDepartureTime.setAdapter(dataAdapterTime);//departure Time
		spinnerReturnTime.setAdapter(dataAdapterTime);//Return Time
		//------------------------------Passengers Numbers
		final Spinner spinnerPassengersNo = (Spinner) findViewById(R.id.spinnerPassengerNo);
		ArrayAdapter<String> dataAdapterPassengerNo = new ArrayAdapter<String>(activity, android.R.layout.simple_spinner_item,myModel1.getPassengersNoSpinner());
		dataAdapterPassengerNo.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		spinnerPassengersNo.setAdapter(dataAdapterPassengerNo);
		//------------------------------
		
		

		final Button bsubmit = (Button) findViewById(R.id.bSubmit);
		bsubmit.getBackground().setColorFilter(0xff800000, PorterDuff.Mode.MULTIPLY);// red color submit button		
		bsubmit.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				
				itineraryObj.setDepartureCity(departureCity.getText().toString());// set departureCity in Itinerary Object
				itineraryObj.setDestinationCity(destinationCity.getText().toString());// set return City in Itinerary Object
				
				itineraryObj.setDepartureMonth(String.valueOf(spinnerDepartureMonths.getSelectedItem())); // set departureMonth in Itinerary Object
				itineraryObj.setDepartureMonthNumeric(String.valueOf(spinnerDepartureMonths.getSelectedItem())); // set departure month in Itinerary Object,eventually in a numeric form
				itineraryObj.setDepartureDay(String.valueOf(spinnerDepartureDays.getSelectedItem())); // set departure Day in Itinerary Object
				itineraryObj.setDepartureTime(String.valueOf(spinnerDepartureTime.getSelectedItem())); // set departure Day in Itinerary Object
				
				itineraryObj.setReturnMonth(String.valueOf(spinnerReturnMonths.getSelectedItem())); // set To Month in Itinerary Object
				itineraryObj.setReturnMonthNumeric(String.valueOf(spinnerReturnMonths.getSelectedItem())); // set Return Month in Itinerary Object,eventually in a numeric form
				itineraryObj.setReturnDay(String.valueOf(spinnerReturnDays.getSelectedItem())); // set return day in Itinerary Object
				itineraryObj.setReturnTime(String.valueOf(spinnerReturnTime.getSelectedItem())); // set return day in Itinerary Object
				
				itineraryObj.setDepartureYear(String.valueOf(spinnerDepartureYear.getSelectedItem())); // set spinnerDepartureYear in Itinerary Object
				itineraryObj.setReturnYear(String.valueOf(spinnerReturnYear.getSelectedItem())); // set departure day in Itinerary Object
				
				itineraryObj.setPassengersNo(String.valueOf(spinnerPassengersNo.getSelectedItem())); // set No of Passengers in Itinerary Object
				
				myModel2.setItinerarytext(itineraryObj); //Controller sends data to the Model2
				
				myView.setDialogBox(myModel2.getItineraryText()); //Controller receives data from the Model and then send this data to View, to be displayed. 
				

			}
		});

	}
	
	
	
}
