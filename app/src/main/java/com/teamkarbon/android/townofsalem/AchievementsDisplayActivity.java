package com.teamkarbon.android.townofsalem;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.ListView;

public class AchievementsDisplayActivity extends Activity {

    ListView lv;
    Model[] Model;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_achievements_display);

        Intent DisplayIntent = getIntent();
        String Achievement = DisplayIntent.getExtras().getString("Achievement");

        lv = (ListView) findViewById(R.id.listView);

        Model = new Model[1];
        Model[0] = new Model("ERROR!", "", 0);

        ImageView ImageAchievement = (ImageView) findViewById(R.id.ImageAchievement);

        //TODO: http://www.androidinterview.com/android-custom-listview-with-checkbox-example/
        //TODO: http://techlovejump.com/android-listview-with-checkbox/
        //TODO: Make shared preferences to save achievements completed
        // http://town-of-salem.wikia.com/wiki/Achievements

        if (Achievement.equals("General")) {
            ImageAchievement.setImageResource(R.drawable.achievement_general);
            Model = new Model[11];
            Model[0] = new Model("Initiation", "Win your first game of Town of Salem", 0);
            Model[1] = new Model("Novice", "Win 5 games of Town of Salem", 0);
            Model[2] = new Model("Apprentice", "Win 10 games of Town of Salem", 0);
            Model[3] = new Model("Dedicated", "Win 25 games of Town of Salem", 0);
            Model[4] = new Model("Patriarch", "Win 50 games of Town of Salem", 0);
            Model[5] = new Model("Zealous", "Win 100 games of Town of Salem", 0);
            Model[6] = new Model("Iconic", "Win 250 games of Town of Salem", 0);
            Model[7] = new Model("Marathon", "Have a game last 10 days", 0);
            Model[8] = new Model("Close Call", "Be acquitted by a tie vote", 0);
            Model[9] = new Model("Fifty-Fifty", "Win with half of the roles", 0);
            Model[10] = new Model("Town of Salem Expert", "Win with every role", 0);

        } else if (Achievement.equals("All Town")) {
            ImageAchievement.setImageResource(R.drawable.achievement_general);
            Model = new Model[5];
            Model[0] = new Model("Option 1", "sss", 0);
            Model[1] = new Model("Option 2", "", 0);
            Model[2] = new Model("Option 3", "", 0);
            Model[3] = new Model("Option 4", "", 0);
            Model[4] = new Model("Option 5", "", 0);

        } else if (Achievement.equals("Bodyguard")) {
            ImageAchievement.setImageResource(R.drawable.achievement_bodyguard);

        } else if (Achievement.equals("Doctor")) {
            ImageAchievement.setImageResource(R.drawable.achievement_doctor);

        } else if (Achievement.equals("Escort")) {
            ImageAchievement.setImageResource(R.drawable.achievement_escort);

        } else if (Achievement.equals("Investigator")) {
            ImageAchievement.setImageResource(R.drawable.achievement_investigator);

        } else if (Achievement.equals("Jailor")) {
            ImageAchievement.setImageResource(R.drawable.achievement_jailor);

        } else if (Achievement.equals("Lookout")) {
            ImageAchievement.setImageResource(R.drawable.achievement_lookout);

        } else if (Achievement.equals("Mayor")) {
            ImageAchievement.setImageResource(R.drawable.achievement_mayor);

        } else if (Achievement.equals("Medium")) {
            ImageAchievement.setImageResource(R.drawable.achievement_medium);

        } else if (Achievement.equals("Retributionist")) {
            ImageAchievement.setImageResource(R.drawable.achievement_retributionist);

        } else if (Achievement.equals("Sheriff")) {
            ImageAchievement.setImageResource(R.drawable.achievement_sheriff);

        } else if (Achievement.equals("Spy")) {
            ImageAchievement.setImageResource(R.drawable.achievement_spy);

        } else if (Achievement.equals("Transporter")) {
            ImageAchievement.setImageResource(R.drawable.achievement_transporter);

        } else if (Achievement.equals("Veteran")) {
            ImageAchievement.setImageResource(R.drawable.achievement_veteran);

        } else if (Achievement.equals("Vigilante")) {
            ImageAchievement.setImageResource(R.drawable.achievement_vigilante);

        } else if (Achievement.equals("All Mafia")) {
            ImageAchievement.setImageResource(R.drawable.achievement_general);

        } else if (Achievement.equals("Blackmailer")) {
            ImageAchievement.setImageResource(R.drawable.achievement_blackmailer);

        } else if (Achievement.equals("Consigliere")) {
            ImageAchievement.setImageResource(R.drawable.achievement_consigliere);

        } else if (Achievement.equals("Consort")) {
            ImageAchievement.setImageResource(R.drawable.achievement_consort);

        } else if (Achievement.equals("Disguiser")) {
            ImageAchievement.setImageResource(R.drawable.achievement_disguiser);

        } else if (Achievement.equals("Framer")) {
            ImageAchievement.setImageResource(R.drawable.achievement_framer);

        } else if (Achievement.equals("Janitor")) {
            ImageAchievement.setImageResource(R.drawable.achievement_janitor);

        } else if (Achievement.equals("Godfather")) {
            ImageAchievement.setImageResource(R.drawable.achievement_godfather);

        } else if (Achievement.equals("Mafioso")) {
            ImageAchievement.setImageResource(R.drawable.achievement_mafioso);

        } else if (Achievement.equals("All Neutrals")) {
            ImageAchievement.setImageResource(R.drawable.achievement_general);

        } else if (Achievement.equals("Amnesiac")) {
            ImageAchievement.setImageResource(R.drawable.achievement_amnesiac);

        } else if (Achievement.equals("Survivor")) {
            ImageAchievement.setImageResource(R.drawable.achievement_survivor);

        } else if (Achievement.equals("Witch")) {
            ImageAchievement.setImageResource(R.drawable.achievement_witch);

        } else if (Achievement.equals("Jester")) {
            ImageAchievement.setImageResource(R.drawable.achievement_jester);

        } else if (Achievement.equals("Executioner")) {
            ImageAchievement.setImageResource(R.drawable.achievement_executioner);

        } else if (Achievement.equals("Arsonist")) {
            ImageAchievement.setImageResource(R.drawable.achievement_arsonist);

        } else if (Achievement.equals("Serial Killer")) {
            ImageAchievement.setImageResource(R.drawable.achievement_serialkiller);

        } else {
            Model = new Model[1];
            Model[0] = new Model("ERROR!", "", 0);
        }

        //Set items
        CustomAdapter adapter = new CustomAdapter(this, Model);
        lv.setAdapter(adapter);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_achievements_display, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
