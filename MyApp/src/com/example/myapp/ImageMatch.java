package com.example.myapp;

import java.io.IOException;

import android.app.Activity;
import android.content.Context;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class ImageMatch extends Activity {
	
	MediaPlayer mp,ms;
	int totalButtons;
	boolean second, bMusic, bSound;
	int prev, countScr=0, countHgh=0;
	int duration = Toast.LENGTH_SHORT;
	CharSequence text;
	Context context;
	Toast toast;
	//TextView score= (TextView) findViewById(R.id.score);
	//TextView highscore= (TextView) findViewById(R.id.highscore);
	
	ImageButton button1;
	ImageButton button2;
	ImageButton button3;
	ImageButton button4;
	ImageButton button5;
	ImageButton button6;
	ToggleButton sound;
	ToggleButton music;
	Button exit;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_image);
		ms = MediaPlayer.create(this, R.raw.step);
		mp = MediaPlayer.create(this, R.raw.sakura);
		
		mp.start();
		
		second = false;
		
		sound = (ToggleButton) findViewById(R.id.imSound);
		music = (ToggleButton) findViewById(R.id.imMusic);
		exit = (Button) findViewById(R.id.imExit);
		
		/*button1 = (ImageButton) findViewById(R.id.imageButton1);
		button2 = (ImageButton) findViewById(R.id.imageButton2);
		button3 = (ImageButton) findViewById(R.id.imageButton3);
		button4 = (ImageButton) findViewById(R.id.imageButton4);
		button5 = (ImageButton) findViewById(R.id.imageButton5);
		button6 = (ImageButton) findViewById(R.id.imageButton6);*/
		
		/*button1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				button1.setBackgroundResource(R.raw.batman);
				//ms.start();
				if(second){
					if(prev==4){
						text = "Match!";
						context = getApplicationContext(); 
						toast = Toast.makeText(context, text, duration) ;
						toast.show();
						second = false;
						countScr++;
					}else{
						second = false;
					}
				}else{
					button1.setBackgroundResource(R.raw.secret);
					second = true;
					prev = 1;
				}
			}
		});
		
		button2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				button2.setBackgroundResource(R.raw.red);
				//ms.start();
				if(second){
					if(prev==3){
						text = "Match!";
						context = getApplicationContext(); 
						toast = Toast.makeText(context, text, duration) ;
						toast.show();
						second = false;
						countScr++;
					}else{
						second = false;
					}
				}else{
					button2.setBackgroundResource(R.raw.secret);
					second = true;
					prev = 2;
				}
			}
		});

		button3.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				//ms.start();
				button3.setBackgroundResource(R.raw.red);
				if(second){
					if(prev==2){
						text = "Match!";
						context = getApplicationContext(); 
						toast = Toast.makeText(context, text, duration) ;
						toast.show();
						second = false;
						countScr++;
					}else{
						second = false;
					}
				}else{
					button3.setBackgroundResource(R.raw.secret);
					second = true;
					prev = 3;
				}
			}
		});
		
		button4.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				//ms.start();
				button4.setBackgroundResource(R.raw.batman);
				if(second){
					if(prev==1){
						text = "Match!";
						context = getApplicationContext(); 
						toast = Toast.makeText(context, text, duration) ;
						toast.show();
						second = false;
						countScr++;
					}else{
						second = false;
					}
				}else{
					button4.setBackgroundResource(R.raw.secret);
					second = true;
					prev = 4;
				}
			}
		});
		
		button5.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				//ms.start();
				button5.setBackgroundResource(R.raw.robin);
				if(second){
					if(prev==6){
						text = "Match!";
						context = getApplicationContext(); 
						toast = Toast.makeText(context, text, duration) ;
						toast.show();
						second = false;
						countScr++;
					}else{
						second = false;
					}
				}else{
					button5.setBackgroundResource(R.raw.secret);
					second = true;
					prev = 5;
				}
			}
		});
		
		button6.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				//ms.start();
				button6.setBackgroundResource(R.raw.robin);
				if(second){
					if(prev==5){
						text = "Match!";
						context = getApplicationContext(); 
						toast = Toast.makeText(context, text, duration) ;
						toast.show();
						second = false;
						countScr++;
					}else{
						second = false;
					}
				}else{
					button6.setBackgroundResource(R.raw.secret);
					second = true;
					prev = 6;
				}
			}
		});*/

		sound.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				/*if(bSound){
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
					bSound = true;
				}else{
					bSound = false;
					ms.reset();
				}*/
			}
		});
		
		music.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
			/*	if(bMusic){
					mp.start();
					bMusic = false;
				}else{
					bMusic = true;
					mp.pause();
				}*/
			}
		});
		exit.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				//ms.stop();
				//mp.stop();
				finish();
			}
		});
	}
}
