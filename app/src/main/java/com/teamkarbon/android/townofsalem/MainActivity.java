package com.teamkarbon.android.townofsalem;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

	Button ButtonRole;
	Button ButtonInno;
	Button ButtonMafia;
	Button ButtonNeutral;
	Button ButtonCosmetic;
	//Temp
	Button ButtonKickStarter;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		//Initialize
		ButtonRole = (Button) findViewById(R.id.ButtonRole);
		ButtonInno = (Button) findViewById(R.id.ButtonInno);
		ButtonMafia = (Button) findViewById(R.id.ButtonMafia);
		ButtonNeutral = (Button) findViewById(R.id.ButtonNeutral);
		ButtonCosmetic = (Button) findViewById(R.id.ButtonCosmetic);
		//Temp
		ButtonKickStarter = (Button) findViewById(R.id.ButtonKickStarter);
		
		//Intent
		Intent RoleIntent = new Intent(this, ListActivity.class);
		Intent InnoIntent = new Intent(this, InnoActivity.class);
		Intent MafiaIntent = new Intent(this, MafiaActivity.class);
		Intent NeutralIntent = new Intent(this, NeutralActivity.class);
		Intent CosmeticIntent = new Intent(this, CosmeticActivity.class);
		//Temp
		Intent KickStarterIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.kickstarter.com/projects/2002718381/town-of-salem-mobile-steam-localization"));
		
		addListenerOnButtonRole(RoleIntent);
		addListenerOnButtonInno(InnoIntent);
		addListenerOnButtonMafia(MafiaIntent);
		addListenerOnButtonNeutral(NeutralIntent);
		addListenerOnButtonCosmetic(CosmeticIntent);
		addListenerOnButtonKickStarter(KickStarterIntent);
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
	
	private void addListenerOnButtonCosmetic(final Intent CosmeticIntent) {
		ButtonCosmetic.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				//startActivity(CosmeticIntent);
				Toast.makeText(getApplicationContext(), "Coming Soon!", Toast.LENGTH_SHORT).show();
			}
		});
	}
	
	//Temp
	private void addListenerOnButtonKickStarter(final Intent KickStarterIntent) {
		ButtonKickStarter.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				Toast.makeText(getApplicationContext(), "Thanks for supporting!", Toast.LENGTH_SHORT).show();
				Toast.makeText(getApplicationContext(), "You Rule!", Toast.LENGTH_SHORT).show();
				startActivity(KickStarterIntent);
			}
		});
	}

}
