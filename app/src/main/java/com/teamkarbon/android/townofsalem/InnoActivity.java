package com.teamkarbon.android.townofsalem;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.purplebrain.adbuddiz.sdk.AdBuddiz;

public class InnoActivity extends Activity implements OnItemClickListener {
	
	// Declare
	ListView RoleListView;
	
	String[] InnoRole = { "Bodyguard", "Doctor", "Escort",
			"Investigator", "Jailor", "Lookout", "Mayor", "Medium",
			"Retributionist", "Sheriff", "Spy", "Transporter", "Veteran",
			"Vigilante", "Vampire Hunter" };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_inno);
		
		RoleListView = (ListView) findViewById(R.id.RoleListView);
		ArrayAdapter<String> Adapter = new ArrayAdapter<String> (this, android.R.layout.simple_list_item_1, InnoRole);
		RoleListView.setAdapter(Adapter);
		
		RoleListView.setOnItemClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.inno, menu);
		return true;
	}

	@Override
	public void onItemClick(AdapterView<?> arg0, View view, int arg2, long arg3) {
        if (Extras.randomads())
            AdBuddiz.showAd(this);

		//Getting Text
		TextView temp = (TextView) view;

		//Intent
		Intent DisplayIntent = new Intent(this, DisplayActivity.class);
		DisplayIntent.putExtra("Role", temp.getText());
		startActivity(DisplayIntent);
	}
}
