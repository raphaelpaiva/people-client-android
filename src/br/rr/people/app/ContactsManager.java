package br.rr.people.app;

import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract;
import android.support.v4.content.CursorLoader;

public class ContactsManager {
	
	public static Cursor getContacts() {
        Uri uri = ContactsContract.Contacts.CONTENT_URI;
        String[] projection = new String[] { ContactsContract.Contacts._ID, ContactsContract.Contacts.DISPLAY_NAME };
        String selection = ContactsContract.Contacts.IN_VISIBLE_GROUP + " = '" + ("1") + "'";
        String[] selectionArgs = null;
        String sortOrder = ContactsContract.Contacts.DISPLAY_NAME+ " COLLATE LOCALIZED ASC";
        
        CursorLoader cursorLoader = new CursorLoader(PeopleApplication.CONTEXT, uri, projection, selection, selectionArgs, sortOrder);
        return cursorLoader.loadInBackground();
    }
}
