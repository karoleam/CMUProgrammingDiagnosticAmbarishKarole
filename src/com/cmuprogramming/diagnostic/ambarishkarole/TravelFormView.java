package com.cmuprogramming.diagnostic.ambarishkarole;

import com.cmuprogramming.diagnostic.ambarish.R;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.widget.LinearLayout;

class TravelFormView extends LinearLayout { //TravelFormView creates the layout defined in layout/display.xml using the layoutInflaterObject 
	

	public TravelFormView(Activity activity) {
		super(activity, null);
		LayoutInflater layoutInflaterObject = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		layoutInflaterObject.inflate(R.layout.display, this);

	}



	public void setDialogBox(String submittedData) {

		AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(getContext());
		
		alertDialogBuilder.setTitle("Error!!");       // set default title as "Error" for all conditions when the input is incomplete or wrong
		alertDialogBuilder.setIcon(R.drawable.error);//set default "Error" icon

		if(submittedData.matches("^Number(.*)")){
			alertDialogBuilder.setTitle("Itinerary");      // set correct title for a correct input, in this case if all input values are correct the dialog message will contain "Number" as the first word
			alertDialogBuilder.setIcon(R.drawable.plane); //set plane icon for correct input
			}
		

		// set dialog message
		alertDialogBuilder.setMessage(submittedData).setCancelable(false).setNegativeButton("OK", new DialogInterface.OnClickListener() { // set dialog message
					public void onClick(DialogInterface dialog, int id) {
						// if this button is clicked, just close the dialog box and do nothing
						dialog.cancel();
					}
				});

		// create alert dialog
		AlertDialog alertDialog = alertDialogBuilder.create();

		// display the dialog box
		alertDialog.show();

	}

}
