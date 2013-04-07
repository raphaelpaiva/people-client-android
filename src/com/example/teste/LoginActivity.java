package com.example.teste;

import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;

import com.googlecode.androidannotations.annotations.Click;
import com.googlecode.androidannotations.annotations.EActivity;
import com.googlecode.androidannotations.annotations.ViewById;

@EActivity(R.layout.login)
public class LoginActivity extends Activity {

	@ViewById
	protected EditText txtEmail;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	}

	@Click
	protected void btnLoginClicked() {
		if (txtEmail.getText().length() == 0) {
			txtEmail.setError(getString(R.string.error_empty_email));
		} else {
			MenuActivity_.intent(this).email(txtEmail.getText().toString())
					.start();
		}
	}
}
