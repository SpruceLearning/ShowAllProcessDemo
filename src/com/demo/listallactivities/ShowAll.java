package com.demo.listallactivities;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * The list of all activities
 * 
 * @author susan
 * 
 */

public class ShowAll extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.showall_layout);
		showProcesses();
	}

	private void showProcesses() {
		// gets all activity names from Activity manager, then display them in a
		// list view
		ArrayList<String> content = new ArrayList<String>();

		ActivityManager manager = (ActivityManager) this
				.getSystemService(ACTIVITY_SERVICE);
		List<RunningAppProcessInfo> processes = manager
				.getRunningAppProcesses();

		// puts all names in an arraylist
		for (RunningAppProcessInfo process : processes) {
			content.add(process.processName);
		}

		ListView view = (ListView) findViewById(R.id.all);
		view.setAdapter(new ArrayAdapter<String>(this,
				R.layout.layout_dropdown, content));

	}

}
