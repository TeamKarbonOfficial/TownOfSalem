package com.teamkarbon.android.townofsalem;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import com.purplebrain.adbuddiz.sdk.AdBuddiz;


public class SearchActivity extends Activity implements AdapterView.OnItemClickListener {

    // Declare
    ListView SearchListView;
    ArrayAdapter<String> adapter;
    EditText SearchInput;

    //Roles
    String[] AllRole = { "Bodyguard", "Doctor", "Escort",
            "Investigator", "Jailor", "Lookout", "Mayor", "Medium",
            "Retributionist", "Sheriff", "Spy", "Transporter", "Veteran",
            "Vigilante", "Blackmailer", "Consigliere", "Consort", "Disguiser",
            "Framer", "Janitor", "Godfather", "Mafioso", "Amnesiac",
            "Survivor", "Witch", "Jester", "Executioner", "Arsonist",
            "Serial Killer", "Werewolf" };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        //Initialize
        SearchListView = (ListView) findViewById(R.id.list_view);
        SearchInput = (EditText) findViewById(R.id.inputSearch);

        //Adding items
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, AllRole);
        SearchListView.setAdapter(adapter);

        //Search Filtering
         SearchInput.addTextChangedListener(new TextWatcher() {

            @Override
            public void onTextChanged(CharSequence cs, int arg1, int arg2, int arg3) {
                // TODO Auto-generated method stub
                SearchActivity.this.adapter.getFilter().filter(cs);
            }

            @Override
            public void beforeTextChanged(CharSequence arg0, int arg1, int arg2,
                                          int arg3) {
                // TODO Auto-generated method stub
            }

            @Override
            public void afterTextChanged(Editable arg0) {
                // TODO Auto-generated method stub
            }
        });

        SearchListView.setOnItemClickListener(this);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_search, menu);
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