package com.example.teste;

import android.app.Activity;
import android.os.Bundle;

import com.googlecode.androidannotations.annotations.EActivity;
import com.googlecode.androidannotations.annotations.Extra;

@EActivity(R.layout.menu)
public class MenuActivity extends Activity {

	@Extra
	protected String email;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	}
}
