package com.moravec.radnetandroid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	public void dataInput(View view){
		//do something when user clicks on the data input button
		Intent intent = new Intent(this, DataInputScreen.class);
		startActivity(intent);
	}
	
	public void learnData(View view){
		//do something when click learn data

	}
	
	public void about(View view){
		//about button
	}
}
