package com.example.hellogalaxy;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	public void switchC(View v){
		EditText tv1 = (EditText)findViewById(R.id.editText1);
		EditText tv2 = (EditText)findViewById(R.id.editText2);
		tv1.setText("");
		tv2.setText("");
	}

	public void switchO(View v){
		EditText tv1 = (EditText)findViewById(R.id.editText1);
		EditText tv2 = (EditText)findViewById(R.id.editText2);
		TextView tv3 = (TextView)findViewById(R.id.textView3);
		tv3.setText("Welcome!" + tv1.getText().toString() + " " + tv2.getText().toString());
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
