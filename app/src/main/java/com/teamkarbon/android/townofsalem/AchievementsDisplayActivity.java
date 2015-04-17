package com.teamkarbon.android.townofsalem;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

public class AchievementsDisplayActivity extends Activity {

    String[] General = {"Initiation", "Novice", "Apprentice", "Dedicated", "Patriarch", "Zealous", "Iconic", "Marathon", "Close Call", "Fifty-Fifty", "Town of Salem Expert"};

    String[] AllTown = {""};

    String[] Bodyguard = {""};

    String[] Doctor = {""};

    String[] Escort = {""};

    String[] Investigator = {""};

    String[] Jailor = {""};

    String[] Lookout = {""};

    String[] Mayor = {""};

    String[] Medium = {""};

    String[] Retributionist = {""};

    String[] Sheriff = {""};

    String[] Spy = {""};

    String[] Transporter = {""};

    String[] Veteran = {""};

    String[] Vigilante = {""};

    String[] AllMafia = {""};

    String[] Blackmailer = {""};

    String[] Consigliere = {""};

    String[] Consort = {""};

    String[] Disguiser = {""};

    String[] Framer = {""};

    String[] Janitor = {""};

    String[] Godfather = {""};

    String[] Mafioso = {""};

    String[] AllNeutrals = {""};

    String[] Amnesiac = {""};

    String[] Survivor = {""};

    String[] Witch = {""};

    String[] Jester = {""};

    String[] Executioner = {""};

    String[] Arsonist = {""};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_achievements_display);

        Intent DisplayIntent = getIntent();
        String Achievement = DisplayIntent.getExtras().getString("Achievement");

        ImageView ImageAchievement = (ImageView) findViewById(R.id.ImageAchievement);

        //TODO: http://www.androidinterview.com/android-custom-listview-with-checkbox-example/
        // http://town-of-salem.wikia.com/wiki/Achievements

        if (Achievement.equals("All Town")) {
            ImageAchievement.setImageResource(R.drawable.achievement_general);

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

        }
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
