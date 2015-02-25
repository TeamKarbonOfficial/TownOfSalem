package com.teamkarbon.android.townofsalem;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

//import AdBuddiz SDK
import com.purplebrain.adbuddiz.sdk.AdBuddiz;

public class MainActivity extends Activity {

    private final String AD_KEY = "b016508d-a14e-4e27-9ca6-eef6bfa5d5f1";
    private final String ERROR = "ERROR";
    private int adcounter = 0;
    private int adcountermax = 20;

    Handler adhandler;

	Button ButtonRole;
	Button ButtonInno;
	Button ButtonMafia;
	Button ButtonNeutral;
	Button ButtonAchievements;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

        AdBuddiz.setPublisherKey(AD_KEY);
        AdBuddiz.cacheAds(this);
		
		//Initialize
        adhandler = new Handler();
		ButtonRole = (Button) findViewById(R.id.ButtonRole);
		ButtonInno = (Button) findViewById(R.id.ButtonInno);
		ButtonMafia = (Button) findViewById(R.id.ButtonMafia);
		ButtonNeutral = (Button) findViewById(R.id.ButtonNeutral);
		//ButtonAchievements = (Button) findViewById(R.id.ButtonAchievements);
		
		//Intent
		Intent RoleIntent = new Intent(this, ListActivity.class);
		Intent InnoIntent = new Intent(this, InnoActivity.class);
		Intent MafiaIntent = new Intent(this, MafiaActivity.class);
		Intent NeutralIntent = new Intent(this, NeutralActivity.class);
		//Intent AchievementsIntent = new Intent(this, AchievementsActivity.class);
		
		addListenerOnButtonRole(RoleIntent);
		addListenerOnButtonInno(InnoIntent);
		addListenerOnButtonMafia(MafiaIntent);
		addListenerOnButtonNeutral(NeutralIntent);
        //addListenerOnButtonAchievements(AchievementsIntent);

        //Try to display ads
        if(AdBuddiz.isReadyToShowAd(this)) {
            AdBuddiz.showAd(this);
        } else {
            //In case of slow internet speed, the application will try to display the ad for <adcountermax> times.
            while(adcounter < adcountermax) {
                if(AdBuddiz.isReadyToShowAd(this)) {
                    AdBuddiz.showAd(this);
                    adcounter = adcountermax + 1;
                }
                adcounter++;
            }
        }

	}

    @Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	private void addListenerOnButtonRole(final Intent RoleIntent) {
		ButtonRole.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				startActivity(RoleIntent);
			}
		});
	}

	private void addListenerOnButtonInno(final Intent InnoIntent) {
		ButtonInno.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				startActivity(InnoIntent);
			}
		});
	}

	private void addListenerOnButtonMafia(final Intent MafiaIntent) {
		ButtonMafia.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				startActivity(MafiaIntent);
			}
		});
	}

	private void addListenerOnButtonNeutral(final Intent NeutralIntent) {
		ButtonNeutral.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				startActivity(NeutralIntent);
			}
		});
	}

    private void addListenerOnButtonAchievements(final Intent AchievementsIntent) {
        ButtonAchievements.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) {
                startActivity(AchievementsIntent);
            }
        });
    }
}
