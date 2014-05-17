package com.example.myapp;

import java.io.IOException;

import android.app.Activity;
import android.content.Context;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

	MediaPlayer mp,ms;
	int totalButtons;
	boolean second, bMusic, bSound;
	int prev;
	int duration = Toast.LENGTH_SHORT;
	CharSequence text;
	Context context;
	Toast toast;
	
	Button button1;
	Button button2;
	Button button3;
	Button button4;
	Button button5;
	Button button6;
	Button sound;
	Button music;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		ms = MediaPlayer.create(this, R.raw.step);
		mp = MediaPlayer.create(this, R.raw.sakura);
		setContentView(R.layout.activity_main);
		mp.start();
		
		int[] selections = new int[6];
		for(int i = 0; i < 6; i++){
			
		}
		int selector = (int)(6*Math.random())+1;
		
		second = false;
		
		Button sound = (Button) findViewById(R.id.sound);
		Button music = (Button) findViewById(R.id.music);
		
		button1 = (Button) findViewById(R.id.button1);
		button2 = (Button) findViewById(R.id.button2);
		button3 = (Button) findViewById(R.id.button3);
		button4 = (Button) findViewById(R.id.button4);
		button5 = (Button) findViewById(R.id.button5);
		button6 = (Button) findViewById(R.id.button6);
		
		button1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				button1.setText(R.string.Value1);
				if(second){
					if(prev==4){
						text = "Match!";
						context = getApplicationContext(); 
						toast = Toast.makeText(context, text, duration) ;
						toast.show();
						second = false;
					}else{
						second = false;
					}
				}else{
					button1.setText(R.string.Value1);
					second = true;
					prev = 1;
				}
			}
		});
		
		button2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				button2.setText(R.string.Value1);
				if(second){
					if(prev==3){
						text = "Match!";
						context = getApplicationContext(); 
						toast = Toast.makeText(context, text, duration) ;
						toast.show();
						second = false;
					}else{
						second = false;
					}
				}else{
					second = true;
					prev = 2;
				}
			}
		});

		button3.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				button3.setText(R.string.Value1);
				if(second){
					if(prev==2){
						text = "Match!";
						context = getApplicationContext(); 
						toast = Toast.makeText(context, text, duration) ;
						toast.show();
						second = false;
					}else{
						second = false;
					}
				}else{
					second = true;
					prev = 3;
				}
			}
		});
		
		button4.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				button4.setText(R.string.Value1);
				if(second){
					if(prev==1){
						text = "Match!";
						context = getApplicationContext(); 
						toast = Toast.makeText(context, text, duration) ;
						toast.show();
						second = false;
					}else{
						second = false;
					}
				}else{
					second = true;
					prev = 4;
				}
			}
		});
		
		button5.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				button5.setText(R.string.Value1);
				if(second){
					if(prev==6){
						text = "Match!";
						context = getApplicationContext(); 
						toast = Toast.makeText(context, text, duration) ;
						toast.show();
						second = false;
					}else{
						second = false;
					}
				}else{
					second = true;
					prev = 5;
				}
			}
		});
		
		button6.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				button6.setText(R.string.Value1);
				if(second){
					if(prev==5){
						text = "Match!";
						context = getApplicationContext(); 
						toast = Toast.makeText(context, text, duration) ;
						toast.show();
						second = false;
					}else{
						second = false;
					}
				}else{
					second = true;
					prev = 6;
				}
			}
		});

		sound.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(bSound){
					try {
						ms.prepare();
					} catch (IllegalStateException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					ms.start();
					bSound = false;
				}else{
					bSound = true;
					ms.reset();
				}
			}
		});
		
		music.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(bMusic){
					mp.start();
					bMusic = false;
				}else{
					bMusic = true;
					mp.pause();
				}
			}
		});
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	protected void onDestroy(Bundle savedInstance){
		mp.stop();
	}
	
	protected void onFinish(Bundle savedInstance){
		mp.stop();
	}

}
