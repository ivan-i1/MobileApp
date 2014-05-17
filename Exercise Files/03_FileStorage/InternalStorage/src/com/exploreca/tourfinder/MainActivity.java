package com.exploreca.tourfinder;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.Log;
import android.view.Menu;
import android.view.View;

import com.exploreca.tourfinder.utils.UIHelper;

public class MainActivity extends Activity {
	
	public static final String LOGTAG="EXPLORECA";
	public static final String USERNAME="pref_username";
	public static final String VIEWIMAGE="pref_viewimages";
	
	private SharedPreferences settings;
	
	private OnSharedPreferenceChangeListener listener;
	
	MediaPlayer mp;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		mp.create(this, R.raw.sakura);
		settings = PreferenceManager.getDefaultSharedPreferences(this);
		
		listener = new OnSharedPreferenceChangeListener() {
			
			@Override
			public void onSharedPreferenceChanged(SharedPreferences sharedPreferences,
					String key) {
				MainActivity.this.refreshDisplay(null);
			}
		};
		settings.registerOnSharedPreferenceChangeListener(listener);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

	public void setPreference(View v) {
		Log.i(LOGTAG, "Clicked set");
		Intent intent = new Intent(this, SettingsActivity.class);
		startActivity(intent);
	}

	public void refreshDisplay(View v) {
		Log.i(LOGTAG, "Clicked show");
		
		String prefValue = settings.getString(USERNAME, "Not found");
		UIHelper.displayText(this, R.id.textView1, prefValue);
	
	}
	
	public void createFile(View v) {
		
	}
	
	public void readFile(View v) {
		
	}
	
}
