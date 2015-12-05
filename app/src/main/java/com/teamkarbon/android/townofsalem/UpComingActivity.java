package com.teamkarbon.android.townofsalem;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class UpComingActivity extends Activity implements AdapterView.OnItemClickListener {

    // Declare
    ListView AchievementsListView;

    String[] Upcoming = { };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_up_coming);

        AchievementsListView = (ListView) findViewById(R.id.AchievementsListView);
        ArrayAdapter<String> Adapter = new ArrayAdapter<String> (this, android.R.layout.simple_list_item_1, Upcoming);
        AchievementsListView.setAdapter(Adapter);

        AchievementsListView.setOnItemClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_up_coming, menu);
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

    @Override
    public void onItemClick(AdapterView<?> arg0, View view, int arg2, long arg3) {
        //Getting Text
        TextView temp = (TextView) view;

        //Intent
        Intent DisplayIntent = new Intent(this, DisplayActivity.class);
        DisplayIntent.putExtra("Role", temp.getText());
        startActivity(DisplayIntent);
    }
}
