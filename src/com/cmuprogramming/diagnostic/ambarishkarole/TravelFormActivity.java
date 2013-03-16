package com.cmuprogramming.diagnostic.ambarishkarole;

import com.cmuprogramming.diagnostic.ambarish.R;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.ViewGroup;

public class TravelFormActivity extends Activity {
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		try
		{
			super.onCreate(savedInstanceState);
			setContentView(R.layout.main);
			final Model1 myModel1 = new Model1();
			final Model2 myModel2 = new Model2();
			final TravelFormView travelFormViewObj = new TravelFormView(this);
		    TravelFormController travelFormControllerObj = new TravelFormController(this, myModel1, myModel2, travelFormViewObj);
		    ViewGroup container = (ViewGroup) findViewById(R.id.homeLayout);
		    container.addView(travelFormControllerObj);  // travelFormControllerObj is a View object, added to a ViewGroup to be displayed together in the parent view
		}
		catch (Exception e)
		{
			Log.e("ERROR", "ERROR IN CODE: " + e.toString());
			e.printStackTrace();
		}
	}
}
