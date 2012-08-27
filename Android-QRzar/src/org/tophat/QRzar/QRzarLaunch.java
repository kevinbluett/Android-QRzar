package org.tophat.QRzar;

import org.tophat.android.networking.ApiCommunicator;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class QRzarLaunch extends Activity {
	
	public static ApiCommunicator apic;
	public static Constants constants;
	
    /* Called when the app is first started. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loadingscreen);
        
        constants = new Constants();
        apic = new ApiCommunicator(constants);
    }
    
    @Override
    public void onStart(){
    	super.onStart();
    	
    	Intent signInIntent = new Intent(this, MainScreenActivity.class);
    	startActivity(signInIntent);
    }
    
    @Override
    public void onResume(){
    	super.onResume();
    	
    	Intent signInIntent = new Intent(this, MainScreenActivity.class);
    	startActivity(signInIntent);
    }
    
	/**
	 * Makes Toast twice as fast, without burning!
	 * @param data
	 */
	public static void showNotification(String data)
	{
		MainScreenActivity.showNotification(data, Toast.LENGTH_SHORT);
	}
}
