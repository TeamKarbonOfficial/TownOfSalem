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


public class AchievementsActivity extends Activity implements OnItemClickListener {

    // Declare
    ListView AchievementsListView;

    String[] Achievements = { "General" ,"All Town" ,"Bodyguard", "Doctor", "Escort",
            "Investigator", "Jailor", "Lookout", "Mayor", "Medium",
            "Retributionist", "Sheriff", "Spy", "Transporter", "Veteran",
            "Vigilante","All Mafia" , "Blackmailer", "Consigliere", "Consort", "Disguiser",
            "Framer", "Janitor", "Godfather", "Mafioso","All Neutrals" , "Amnesiac",
            "Survivor", "Witch", "Jester", "Executioner", "Arsonist",
            "Serial Killer" };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_achievements);

        AchievementsListView = (ListView) findViewById(R.id.AchievementsListView);
        ArrayAdapter<String> Adapter = new ArrayAdapter<String> (this, android.R.layout.simple_list_item_1, Achievements);
        AchievementsListView.setAdapter(Adapter);

        AchievementsListView.setOnItemClickListener(this);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_achievements, menu);
        return true;
    }

    @Override
    public void onItemClick(AdapterView<?> arg0, View view, int arg2, long arg3) {
        //Getting Text
        TextView temp = (TextView) view;

        //Intent
        Intent AchievementsDisplayIntent = new Intent(this, AchievementsDisplayActivity.class);
        AchievementsDisplayIntent.putExtra("Achievement", temp.getText());
        startActivity(AchievementsDisplayIntent);
    }
}
