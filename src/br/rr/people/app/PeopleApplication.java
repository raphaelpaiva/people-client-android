package br.rr.people.app;

import android.app.Application;
import android.content.Context;

public class PeopleApplication extends Application {
	public static Context CONTEXT;
	
	@Override
	public void onCreate() {
		super.onCreate();
		CONTEXT = getApplicationContext();
	}
}
