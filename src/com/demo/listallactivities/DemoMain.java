package com.demo.listallactivities;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

/**
 * Entering point, with just a big button in the center, when you click on it,
 * you see a list of all processes running on the phone
 * 
 * @author susan
 * 
 */

public class DemoMain extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_demo_main);
		Button showall = (Button) findViewById(R.id.showall);
		final Activity self = this;
		
		// sets the listener of the big button
		showall.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// start new activity/view
				Intent intent = new Intent(self, ShowAll.class);
				startActivity(intent);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_demo_main, menu);
		return true;
	}

}
