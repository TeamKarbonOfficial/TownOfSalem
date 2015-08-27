package com.teamkarbon.android.townofsalem;

import java.util.Arrays;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.text.Html;
import android.view.Menu;
import android.widget.TextView;

public class DisplayActivity extends Activity {
	
	// Declare
	final private String UNKNOWN = "Unknown";
	final private String ERROR = "Oh No! That's Embarrassing, it seems an error have occurred. If the error persist, please email support@teamkarbon.com with the revalent steps you did to achieve this error. Thank you!\n\nTeamKarbon";
	final private String TOWN_PROTECTIVE = "Town Protective";
	final private String TOWN_SUPPORT = "Town Support";
	final private String TOWN_INVESTIGATIVE = "Town Investigative";
	final private String TOWN_KILLING = "Town Killing";
	final private String MAFIA_SUPPORT = "Mafia Support";
	final private String MAFIA_DECEPTION = "Mafia Deception";
	final private String MAFIA_KILLING = "Mafia Killing";
	final private String NEUTRAL_BENIGN = "Neutral Benign";
	final private String NEUTRAL_EVIL = "Neutral Evil";
	final private String NEUTRAL_KILLING = "Neutral Killing";

	
	//Innocent
	String[] InnoRole = { "Bodyguard", "Doctor", "Escort",
			"Investigator", "Jailor", "Lookout", "Mayor", "Medium",
			"Retributionist", "Sheriff", "Spy", "Transporter", "Veteran",
			"Vigilante", "Vampire Hunter" };
	
	String[] InnoRoleProtective = { "Bodyguard", "Doctor"};
	
	String[] InnoRoleSupport = { "Transporter", "Escort", "Mayor", "Medium",
			"Retributionist"};
	
	String[] InnoRoleInvestigative = {"Investigator", "Lookout", "Sheriff", "Spy"};
	
	String[] InnoRoleKilling = { "Veteran", "Vigilante", "Jailor", "Vampire Hunter" };
	
	//Mafia
	String[] MafiaRole = { "Blackmailer", "Consigliere", "Consort", "Disguiser",
			"Forger", "Framer", "Janitor", "Godfather", "Mafioso" };
	
	String[] MafiaSupport = { "Blackmailer", "Consigliere", "Consort"};
	
	String[] MafiaDeception = { "Disguiser", "Forger", "Framer", "Janitor"};
	
	String[] MafiaKilling = { "Godfather", "Mafioso" };
	
	//Neutral
	String[] NeutralRole = { "Amnesiac", "Survivor", "Witch", "Jester",
			"Executioner", "Arsonist", "Serial Killer", "Werewolf", "Vampire" };
	
	String[] NeutralBenign = { "Amnesiac", "Survivor" };
	
	String[] NeutralEvil = { "Witch", "Jester", "Executioner", "Vampire" };
	
	String[] NeutralKilling = { "Arsonist", "Serial Killer", "Werewolf" };

	TextView textViewRole;
	TextView textViewAlign;
	TextView textViewDetails;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_display);
		
		Intent DisplayIntent = getIntent();
		String Role = DisplayIntent.getExtras().getString("Role");
		
		textViewRole = (TextView) findViewById(R.id.textViewRole);
		textViewAlign = (TextView) findViewById(R.id.textViewAlign);
		textViewDetails = (TextView) findViewById(R.id.textViewDetails);
		textViewRole.setText(Html.fromHtml("<b>" + Role + "</b>"));

		if (Arrays.asList(InnoRole).contains(Role)) {
			// Color of Role
			textViewRole.setTextColor(getResources().getColor(R.color.Green));
			
			if (Arrays.asList(InnoRoleProtective).contains(Role)) {
				// textViewAlign
				textViewAlign.setText(Html.fromHtml("<u>" + TOWN_PROTECTIVE + "</u>"));
				//textViewDetails
				if (Role.equals("Bodyguard")) {
					textViewDetails.setText(Html.fromHtml(getResources().getString(R.string.Bodyguard)));
				} else if (Role.equals("Doctor")) {
					textViewDetails.setText(Html.fromHtml(getResources().getString(R.string.Doctor)));
				} else {
					textViewDetails.setText(UNKNOWN);
				}
			} else if (Arrays.asList(InnoRoleSupport).contains(Role)) {
				// textViewAlign
				textViewAlign.setText(Html.fromHtml("<u>" + TOWN_SUPPORT + "</u>"));
				//textViewDetails
				if (Role.equals("Mayor")) {
					textViewDetails.setText(Html.fromHtml(getResources().getString(R.string.Mayor)));
				} else if (Role.equals("Escort")) {
					textViewDetails.setText(Html.fromHtml(getResources().getString(R.string.Escort)));
				} else if (Role.equals("Medium")) {
					textViewDetails.setText(Html.fromHtml(getResources().getString(R.string.Medium)));
				} else if (Role.equals("Retributionist")) {
					textViewDetails.setText(Html.fromHtml(getResources().getString(R.string.Retributionist)));
				} else if (Role.equals("Transporter")) {
					textViewDetails.setText(Html.fromHtml(getResources().getString(R.string.Transporter)));
				} else {
					textViewDetails.setText(UNKNOWN);
				}
			} else if (Arrays.asList(InnoRoleInvestigative).contains(Role)) {
				// textViewAlign
				textViewAlign.setText(Html.fromHtml("<u>" + TOWN_INVESTIGATIVE + "</u>"));
				//textViewDetails
				if (Role.equals("Sheriff")) {
					textViewDetails.setText(Html.fromHtml(getResources().getString(R.string.Sheriff)));
				} else if (Role.equals("Investigator")) {
					textViewDetails.setText(Html.fromHtml(getResources().getString(R.string.Investigator)));
				} else if (Role.equals("Spy")) {
					textViewDetails.setText(Html.fromHtml(getResources().getString(R.string.Spy)));
				} else if (Role.equals("Lookout")) {
					textViewDetails.setText(Html.fromHtml(getResources().getString(R.string.Lookout)));
				} else {
					textViewDetails.setText(UNKNOWN);
				}
			} else if (Arrays.asList(InnoRoleKilling).contains(Role)) {
				// textViewAlign
				textViewAlign.setText(Html.fromHtml("<u>" + TOWN_KILLING + "</u>"));
				//textViewDetails
				if (Role.equals("Jailor")) {
					textViewDetails.setText(Html.fromHtml(getResources().getString(R.string.Jailor)));
				} else if (Role.equals("Veteran")) {
					textViewDetails.setText(Html.fromHtml(getResources().getString(R.string.Veteran)));
				} else if (Role.equals("Vigilante")) {
					textViewDetails.setText(Html.fromHtml(getResources().getString(R.string.Vigilante)));
				} else if (Role.equals("Vampire Hunter")) {
					textViewDetails.setText(Html.fromHtml(getResources().getString(R.string.Vampire_Hunter)));
				} else {
					textViewDetails.setText(UNKNOWN);
				}
			} else {
				// textViewAlign
				textViewAlign.setText(Html.fromHtml("<u>" + UNKNOWN + "</u>"));
				//textViewDetails
				textViewDetails.setText(ERROR);
			}
		} else if (Arrays.asList(MafiaRole).contains(Role)) {
			// Color of Role
			textViewRole.setTextColor(getResources().getColor(R.color.Red));
			
			if (Arrays.asList(MafiaSupport).contains(Role)) {
				// textViewAlign
				textViewAlign.setText(Html.fromHtml("<u>" + MAFIA_SUPPORT + "</u>"));
				//textViewDetails
				if (Role.equals("Blackmailer")) {
					textViewDetails.setText(Html.fromHtml(getResources().getString(R.string.Blackmailer)));
				} else if (Role.equals("Consigliere")) {
					textViewDetails.setText(Html.fromHtml(getResources().getString(R.string.Consigliere)));
				} else if (Role.equals("Consort")) {
					textViewDetails.setText(Html.fromHtml(getResources().getString(R.string.Consort)));
				} else {
					textViewDetails.setText(UNKNOWN);
				}
			} else if (Arrays.asList(MafiaDeception).contains(Role)) {
				// textViewAlign
				textViewAlign.setText(Html.fromHtml("<u>" + MAFIA_DECEPTION + "</u>"));
				//textViewDetails
				if (Role.equals("Disguiser")) {
					textViewDetails.setText(Html.fromHtml(getResources().getString(R.string.Disguiser)));
				} else if (Role.equals("Forger")) {
					//TODO: Change this!
					textViewDetails.setText(Html.fromHtml(getResources().getString(R.string.Forger)));
				} else if (Role.equals("Framer")) {
					textViewDetails.setText(Html.fromHtml(getResources().getString(R.string.Framer)));
				} else if (Role.equals("Janitor")) {
					textViewDetails.setText(Html.fromHtml(getResources().getString(R.string.Janitor)));
				} else {
					textViewDetails.setText(UNKNOWN);
				}
			} else if (Arrays.asList(MafiaKilling).contains(Role)) {
				// textViewAlign
				textViewAlign.setText(Html.fromHtml("<u>" + MAFIA_KILLING + "</u>"));
				//textViewDetails
				if (Role.equals("Godfather")) {
					textViewDetails.setText(Html.fromHtml(getResources().getString(R.string.Godfather)));
				} else if (Role.equals("Mafioso")) {
					textViewDetails.setText(Html.fromHtml(getResources().getString(R.string.Mafioso)));
				} else {
					textViewDetails.setText(UNKNOWN);
				}
			} else {
				// textViewAlign
				textViewAlign.setText("<u>" + UNKNOWN + "</u>");
				//textViewDetails
				textViewDetails.setText(ERROR);
			}
		} else if (Arrays.asList(NeutralRole).contains(Role)) {
			// Color of Role
			textViewRole.setTextColor(getResources().getColor(R.color.Blue));
			
			if (Arrays.asList(NeutralBenign).contains(Role)) {
				// textViewAlign
				textViewAlign.setText(Html.fromHtml("<u>" + NEUTRAL_BENIGN + "</u>"));
				//textViewDetails
				if (Role.equals("Amnesiac")) {
					textViewDetails.setText(Html.fromHtml(getResources().getString(R.string.Amnesiac)));
				} else if (Role.equals("Survivor")) {
					textViewDetails.setText(Html.fromHtml(getResources().getString(R.string.Survivor)));
				} else {
					textViewDetails.setText(UNKNOWN);
				}
			} else if (Arrays.asList(NeutralEvil).contains(Role)) {
				// textViewAlign
				textViewAlign.setText(Html.fromHtml("<u>" + NEUTRAL_EVIL + "</u>"));
				//textViewDetails
				if (Role.equals("Witch")) {
					textViewDetails.setText(Html.fromHtml(getResources().getString(R.string.Witch)));
				} else if (Role.equals("Executioner")) {
					textViewDetails.setText(Html.fromHtml(getResources().getString(R.string.Executioner)));
				} else if (Role.equals("Jester")) {
					textViewDetails.setText(Html.fromHtml(getResources().getString(R.string.Jester)));
				} else if (Role.equals("Vampire")) {
					textViewDetails.setText(Html.fromHtml(getResources().getString(R.string.Vampire)));
				} else {
					textViewDetails.setText(UNKNOWN);
				}
			} else if (Arrays.asList(NeutralKilling).contains(Role)) {
				// textViewAlign
				textViewAlign.setText(Html.fromHtml("<u>" + NEUTRAL_KILLING + "</u>"));
				//textViewDetails
				if (Role.equals("Arsonist")) {
					textViewDetails.setText(Html.fromHtml(getResources().getString(R.string.Arsonist)));
				} else if (Role.equals("Serial Killer")) {
					textViewDetails.setText(Html.fromHtml(getResources().getString(R.string.Serial_Killer)));
				} else if (Role.equals("Werewolf")) {
                    textViewDetails.setText(Html.fromHtml(getResources().getString(R.string.Werewolf)));
                } else {
					textViewDetails.setText(UNKNOWN);
				}
			} else {
				// textViewAlign
				textViewAlign.setText(Html.fromHtml("<u>" + UNKNOWN + "</u>"));
				//textViewDetails
				textViewDetails.setText(ERROR);
			}
		}

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.display, menu);
		return true;
	}
}
