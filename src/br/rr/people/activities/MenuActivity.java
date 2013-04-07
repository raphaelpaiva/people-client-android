package br.rr.people.activities;

import android.app.Activity;
import android.database.Cursor;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.widget.TextView;
import br.rr.people.R;
import br.rr.people.app.ContactsManager;

import com.googlecode.androidannotations.annotations.AfterViews;
import com.googlecode.androidannotations.annotations.Click;
import com.googlecode.androidannotations.annotations.EActivity;
import com.googlecode.androidannotations.annotations.Extra;
import com.googlecode.androidannotations.annotations.ViewById;

@EActivity(R.layout.menu)
public class MenuActivity extends Activity {

	@Extra
	protected String email;
	
	@ViewById
	protected TextView contactsList;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	}
	
	@Click
	protected void btnSendContactsClicked() {
		
	}
	
	@AfterViews
	protected void fillContactsList() {
		Cursor contactsCursor = ContactsManager.getContacts();
		
		while(contactsCursor.moveToNext()) {
			String displayName = contactsCursor.getString(contactsCursor.getColumnIndex(ContactsContract.Data.DISPLAY_NAME));
			contactsList.append(displayName + "\n");
		}
	}
	
}
