package com.teamkarbon.android.townofsalem;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.ListView;

public class AchievementsDisplayActivity extends Activity {

    ListView lv;
    Model[] Model;

    SharedPreferences.Editor editor;
    SharedPreferences sharedPref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_achievements_display);

        //Intent
        Intent DisplayIntent = getIntent();
        String Achievement = DisplayIntent.getExtras().getString("Achievement");

        lv = (ListView) findViewById(R.id.listView);

        Model = new Model[1];
        Model[0] = new Model("ERROR!", "Sorry that happened :(", "0");

        ImageView ImageAchievement = (ImageView) findViewById(R.id.ImageAchievement);

        //SharedPreferences
        //sharedPref = getPreferences(Context.MODE_PRIVATE);
        //editor = sharedPref.edit();

        //TODO: http://www.androidinterview.com/android-custom-listview-with-checkbox-example/
        //TODO: http://techlovejump.com/android-listview-with-checkbox/
        //TODO: Make shared preferences to save achievements completed
        //TODO: https://devtut.wordpress.com/2011/06/09/custom-arrayadapter-for-a-listview-android/
        // http://town-of-salem.wikia.com/wiki/Achievements

        if (Achievement.equals("General")) {
            ImageAchievement.setImageResource(R.drawable.achievement_general);
            Model = new Model[11];
            Model[0] = new Model("Initiation", "Win your first game of Town of Salem", "5");
            Model[1] = new Model("Novice", "Win 5 games of Town of Salem", "5");
            Model[2] = new Model("Apprentice", "Win 10 games of Town of Salem", "5");
            Model[3] = new Model("Dedicated", "Win 25 games of Town of Salem", "10");
            Model[4] = new Model("Patriarch", "Win 50 games of Town of Salem", "10");
            Model[5] = new Model("Zealous", "Win 100 games of Town of Salem", "10");
            Model[6] = new Model("Iconic", "Win 250 games of Town of Salem", "25");
            Model[7] = new Model("Marathon", "Have a game last 10 days", "5");
            Model[8] = new Model("Close Call", "Be acquitted by a tie vote", "5");
            Model[9] = new Model("Fifty-Fifty", "Win with half of the roles", "25");
            Model[10] = new Model("Town of Salem Expert", "Win with every role", "25");

        } else if (Achievement.equals("All Town")) {
            ImageAchievement.setImageResource(R.drawable.achievement_general);
            Model = new Model[3];
            Model[0] = new Model("Half Way There", "Win with half of the Town roles.", "10");
            Model[1] = new Model("Adept of the Town", "Win with all of the Town roles.", "25");
            Model[2] = new Model("The Perfect Town", "Win with all Town members still alive.", "25");

        } else if (Achievement.equals("Bodyguard")) {
            ImageAchievement.setImageResource(R.drawable.achievement_bodyguard);
            Model = new Model[7];
            Model[0] = new Model("Chaperon", "Win 1 game as a Bodyguard", "5");
            Model[1] = new Model("Safeguard", "Win 5 games as a Bodyguard", "5");
            Model[2] = new Model("Protector", "Win 10 games as a Bodyguard", "10");
            Model[3] = new Model("Warden", "Win 25 games as a Bodyguard", "25");
            Model[4] = new Model("I'll save you", "Successfully protect someone from being attacked.", "5");
            Model[5] = new Model("Bulletproof", "Have your bulletproof vest save you from death.", "5");
            Model[6] = new Model("Tango Down", "Kill the Godfather while protecting someone.", "10");

        } else if (Achievement.equals("Doctor")) {
            ImageAchievement.setImageResource(R.drawable.achievement_doctor);
            Model = new Model[7];
            Model[0] = new Model("Practitioner", "Win 1 game as a Doctor", "5");
            Model[1] = new Model("Healer", "Win 5 games as a Doctor", "5");
            Model[2] = new Model("Medic", "Win 10 games as a Doctor", "10");
            Model[3] = new Model("Surgeon", "Win 25 games as a Doctor", "25");
            Model[4] = new Model("Stitch Yourself", "Heal yourself after being attacked.", "5");
            Model[5] = new Model("Need Medical Attention?", "Heal someone who was attacked.", "5");
            Model[6] = new Model("Where does it hurt?", "Save 3 people in one game.", "10");

        } else if (Achievement.equals("Escort")) {
            ImageAchievement.setImageResource(R.drawable.achievement_escort);
            Model = new Model[7];
            Model[0] = new Model("Attendant", "Win 1 game as an Escort", "5");
            Model[1] = new Model("Tailgater", "Win 5 games as an Escort", "5");
            Model[2] = new Model("Great Company", "Win 10 games as an Escort", "10");
            Model[3] = new Model("Master of Distraction", "Win 25 games as an Escort", "25");
            Model[4] = new Model("Hey There", "Successfully role block someone.", "5");
            Model[5] = new Model("Dangerous Work", "Die from visiting a SerialKiller.", "5");
            Model[6] = new Model("I look good!", "Role block yourself.", "25");

        } else if (Achievement.equals("Investigator")) {
            ImageAchievement.setImageResource(R.drawable.achievement_investigator);
            Model = new Model[6];
            Model[0] = new Model("Detective", "Win 1 game as an Investigator", "5");
            Model[1] = new Model("Gumshoe", "Win 5 games as an Investigator", "5");
            Model[2] = new Model("Private Eye", "Win 10 games as an Investigator", "10");
            Model[3] = new Model("Sherlock Holmes", "Win 25 games as an Investigator", "25");
            Model[4] = new Model("Who are you?", "Successfully investigate someone.", "5");
            Model[5] = new Model("Who am I?", "Investigate yourself.", "10");

        } else if (Achievement.equals("Jailor")) {
            ImageAchievement.setImageResource(R.drawable.achievement_jailor);
            Model = new Model[7];
            Model[0] = new Model("Prison Warden", "Win 1 game as a Jailor", "5");
            Model[1] = new Model("Correctional Officer", "Win 5 games as a Jailor", "5");
            Model[2] = new Model("Locked up", "Win 10 games as a Jailor", "10");
            Model[3] = new Model("Penitentiary", "Win 25 games as a Jailor", "25");
            Model[4] = new Model("Execution", "Successfully execute someone.", "5");
            Model[5] = new Model("I knew it!", "Be killed by the Serial Killer you jailed.", "10");
            Model[6] = new Model("Flawless Executioner.", "Execute 3 non-Town members in a game.", "25");

        } else if (Achievement.equals("Lookout")) {
            ImageAchievement.setImageResource(R.drawable.achievement_lookout);
            Model = new Model[6];
            Model[0] = new Model("Sentry", "Win 1 game as a Lookout", "5");
            Model[1] = new Model("Eagle Eye", "Win 5 games as a Lookout", "5");
            Model[2] = new Model("Hawk", "Win 10 games as a Lookout", "10");
            Model[3] = new Model("Sentinel", "Win 25 games as a Lookout", "25");
            Model[4] = new Model("I see you", "Successfully watch someone at night.", "5");
            Model[5] = new Model("It's a party", "Have 5 or more people visit your target.", "10");

        } else if (Achievement.equals("Mayor")) {
            ImageAchievement.setImageResource(R.drawable.achievement_mayor);
            Model = new Model[7];
            Model[0] = new Model("Supervisor", "Win 1 game as a Mayor", "5");
            Model[1] = new Model("Ambassador", "Win 5 games as a Mayor", "5");
            Model[2] = new Model("Executive", "Win 10 games as a Mayor", "10");
            Model[3] = new Model("Commander and Chief", "Win 25 games as a Mayor", "25");
            Model[4] = new Model("Fearless", "Reveal yourself as Mayor on day 1.", "5");
            Model[5] = new Model("Incognito", "Win without revealing yourself as the Mayor.", "10");
            Model[6] = new Model("Faith in the Town", "Be acquitted without revealing to the Town.", "25");

        } else if (Achievement.equals("Medium")) {
            ImageAchievement.setImageResource(R.drawable.achievement_medium);
            Model = new Model[7];
            Model[0] = new Model("Oracle", "Win 1 game as a Medium", "5");
            Model[1] = new Model("Prophet", "Win 5 games as a Medium", "5");
            Model[2] = new Model("Deviner", "Win 10 games as a Medium", "10");
            Model[3] = new Model("Harbinger", "Win 25 games as a Medium", "25");
            Model[4] = new Model("Talk to a Pyro", "Communicate with an Arsonist.", "5");
            Model[5] = new Model("Talk to the Mob", "Communicate with the Godfather.", "5");
            Model[6] = new Model("Talk to a Psychopath.", "Communicate with a Serial Killer.", "5");

        } else if (Achievement.equals("Retributionist")) {
            ImageAchievement.setImageResource(R.drawable.achievement_retributionist);
            Model = new Model[7];
            Model[0] = new Model("The Avenger", "Win 1 game as a Retributionist", "5");
            Model[1] = new Model("Vengeance", "Win 5 games as a Retributionist", "5");
            Model[2] = new Model("Revitalize", "Win 10 games as a Retributionist", "10");
            Model[3] = new Model("Reanimate", "Win 25 games as a Retributionist", "25");
            Model[4] = new Model("Welcome back Doc", "Resurrect a Doctor.", "5");
            Model[5] = new Model("Encore", "Resurrect a Sheriff.", "5");
            Model[6] = new Model("Second Chance", "Resurrect a Jailor.", "5");

        } else if (Achievement.equals("Sheriff")) {
            ImageAchievement.setImageResource(R.drawable.achievement_sheriff);
            Model = new Model[7];
            Model[0] = new Model("Enforce the Law", "Win 1 game as a Sheriff", "5");
            Model[1] = new Model("Marshall", "Win 5 games as a Sheriff", "5");
            Model[2] = new Model("Constable", "Win 10 games as a Sheriff", "10");
            Model[3] = new Model("Deputy", "Win 25 games as a Sheriff", "25");
            Model[4] = new Model("Got You", "Find a Serial Killer.", "5");
            Model[5] = new Model("Not Suspicious", "Find someone to not be suspicious.", "5");
            Model[6] = new Model("Busted", "Find a member of the Mafia.", "5");

        } else if (Achievement.equals("Spy")) {
            ImageAchievement.setImageResource(R.drawable.achievement_spy);
            Model = new Model[7];
            Model[0] = new Model("Espionage", "Win 1 game as a Spy", "5");
            Model[1] = new Model("Sleuth", "Win 5 games as a Spy", "5");
            Model[2] = new Model("Undercover Agent", "Win 10 games as a Spy", "10");
            Model[3] = new Model("CIA", "Win 25 games as a Spy", "25");
            Model[4] = new Model("Big Ears", "Listen to a private message.", "5");
            Model[5] = new Model("Saw it coming!", "See a member of the Mafia targeting you.", "10");
            Model[6] = new Model("Too Many Mafia", "See 4 or more Mafia visit people at night.", "25");

        } else if (Achievement.equals("Transporter")) {
            ImageAchievement.setImageResource(R.drawable.achievement_transporter);
            Model = new Model[6];
            Model[0] = new Model("Courier", "Win 1 game as a Transporter", "5");
            Model[1] = new Model("Envoy", "Win 5 games as a Transporter", "5");
            Model[2] = new Model("Public Transportation", "Win 10 games as a Transporter", "10");
            Model[3] = new Model("Precious Cargo", "Win 25 games as a Transporter", "25");
            Model[4] = new Model("Can't Touch Me!", "Transport yourself with someone else.", "5");
            Model[5] = new Model("Stop hittin' yourself", "Make someone attack themself.", "10");

        } else if (Achievement.equals("Veteran")) {
            ImageAchievement.setImageResource(R.drawable.achievement_veteran);
            Model = new Model[7];
            Model[0] = new Model("Battle-Hardened", "Win 1 game as a Veteran", "5");
            Model[1] = new Model("Soldier", "Win 5 games as a Veteran", "5");
            Model[2] = new Model("Warrior", "Win 10 games as a Veteran", "10");
            Model[3] = new Model("Sergeant", "Win 25 games as a Veteran", "25");
            Model[4] = new Model("Not Paranoid", "Win without going on alert all game.", "5");
            Model[5] = new Model("Lucky Paranoia", "Win a game without killing any town members.", "10");
            Model[6] = new Model("Massacre", "Kill three people in one night.", "25");

        } else if (Achievement.equals("Vigilante")) {
            ImageAchievement.setImageResource(R.drawable.achievement_vigilante);
            Model = new Model[7];
            Model[0] = new Model("Mercenary", "Win 1 game as a Vigilante", "5");
            Model[1] = new Model("Justice", "Win 5 games as a Vigilante", "5");
            Model[2] = new Model("Smoking Gun", "Win 10 games as a Vigilante", "10");
            Model[3] = new Model("Judicatory", "Win 25 games as a Vigilante", "25");
            Model[4] = new Model("Ouch", "Shoot yourself at night.", "10");
            Model[5] = new Model("Why Won't They Die?", "Shoot 3 people who can't die at night.", "10");
            Model[6] = new Model("Perfect Shot", "Shoot 3 Non-Town in a single game.", "25");

        } else if (Achievement.equals("All Mafia")) {
            ImageAchievement.setImageResource(R.drawable.achievement_general);
            Model = new Model[3];
            Model[0] = new Model("Discipline for Crime", "Win with half of the Mafia roles.", "10");
            Model[1] = new Model("Adept of the Mafia", "Win with all of the Mafia roles.", "25");
            Model[2] = new Model("The Sicilian Mafia", "Win with all Mafia members still alive.", "25");

        } else if (Achievement.equals("Blackmailer")) {
            ImageAchievement.setImageResource(R.drawable.achievement_blackmailer);
            Model = new Model[7];
            Model[0] = new Model("Extortion", "Win 1 game as a Blackmailer", "5");
            Model[1] = new Model("Hush Money", "Win 5 games as a Blackmailer", "5");
            Model[2] = new Model("Deceitful", "Win 10 games as a Blackmailer", "10");
            Model[3] = new Model("Treachery", "Win 25 games as a Blackmailer", "25");
            Model[4] = new Model("Gag Order", "Blackmail the same person 3 times", "10");
            Model[5] = new Model("Self-Conscious", "Blackmail yourself.", "10");
            Model[6] = new Model("Oops", "Blackmail a member of the Mafia.", "10");

        } else if (Achievement.equals("Consigliere")) {
            ImageAchievement.setImageResource(R.drawable.achievement_consigliere);
            Model = new Model[7];
            Model[0] = new Model("Private Detective", "Win 1 game as a Consigliere", "5");
            Model[1] = new Model("Interrogate", "Win 5 games as a Consigliere", "5");
            Model[2] = new Model("Cross-Examine", "Win 10 games as a Consigliere", "10");
            Model[3] = new Model("Snooper", "Win 25 games as a Consigliere", "25");
            Model[4] = new Model("How'd that happen?", "Find a Godfather.", "5");
            Model[5] = new Model("Uh Oh", "Find a Veteran.", "5");
            Model[6] = new Model("Kill him, Quick!", "Find a Sheriff.", "5");

        } else if (Achievement.equals("Consort")) {
            ImageAchievement.setImageResource(R.drawable.achievement_consort);
            Model = new Model[7];
            Model[0] = new Model("Accompany", "Win 1 game as a Consort", "5");
            Model[1] = new Model("Companion", "Win 5 games as a Consort", "5");
            Model[2] = new Model("Divert Your Attention", "Win 10 games as a Consort", "10");
            Model[3] = new Model("Entertainer", "Win 25 games as a Consort", "25");
            Model[4] = new Model("Dangerous Profession", "Die to the Serial Killer you visited.", "5");
            Model[5] = new Model("Distracting", "Role block yourself.", "10");
            Model[6] = new Model("It's a trap!", "Role block the Godfather.", "25");

        } else if (Achievement.equals("Disguiser")) {
            ImageAchievement.setImageResource(R.drawable.achievement_disguiser);
            Model = new Model[6];
            Model[0] = new Model("Camouflage", "Win 1 game as a Disguiser", "5");
            Model[1] = new Model("Masquerade", "Win 5 games as a Disguiser", "5");
            Model[2] = new Model("Smoke Screen", "Win 10 games as a Disguiser", "10");
            Model[3] = new Model("Master of Disguise", "Win 25 games as a Disguiser", "25");
            Model[4] = new Model("Slippery Chameleon", "Successfully disguise 3 times in one game", "5");
            Model[5] = new Model("Who Needs a Disguise?", "Win a game without attempting to disguise", "5");

        } else if (Achievement.equals("Forger")) {
            ImageAchievement.setImageResource(R.drawable.achievement_forger);
            Model = new Model[8];
            Model[0] = new Model("Counterfeit Connoisseur", "Successfully forge a will.", "5");
            Model[1] = new Model("Fabricate", "Win your first game as a Forger.", "5");
            Model[2] = new Model("Misdirection", "Win 5 games as a Forger.", "5");
            Model[3] = new Model("Counterfeiter", "Win 10 games as a Forger.", "10");
            Model[4] = new Model("The Proof Is In The Pudding", "Win 25 games as a Forger.", "25");
            Model[5] = new Model("Derailed", "Forge a will on an Investigator.", "10");
            Model[6] = new Model("Could Be Worse?", "Forge a will on yourself.", "10");
            Model[7] = new Model("Whoops!", "Forge a will on a Mafia member.", "10");

        } else if (Achievement.equals("Framer")) {
            ImageAchievement.setImageResource(R.drawable.achievement_framer);
            Model = new Model[6];
            Model[0] = new Model("Slander", "Win 1 game as a Framer", "5");
            Model[1] = new Model("Incriminate", "Win 5 games as a Framer", "5");
            Model[2] = new Model("Forger", "Win 10 games as a Framer", "10");
            Model[3] = new Model("Shift the Blame", "Win 25 games as a Framer", "25");
            Model[4] = new Model("That was pointless", "Frame a member of the Mafia.", "5");
            Model[5] = new Model("Whoops", "Frame yourself.", "5");

        } else if (Achievement.equals("Janitor")) {
            ImageAchievement.setImageResource(R.drawable.achievement_janitor);
            Model = new Model[7];
            Model[0] = new Model("Custodian", "Win 1 game as a Janitor", "5");
            Model[1] = new Model("Clean as a Whistle", "Win 5 games as a Janitor", "5");
            Model[2] = new Model("Neat as a Button", "Win 10 games as a Janitor", "10");
            Model[3] = new Model("Sanitary Duty", "Win 25 games as a Janitor", "25");
            Model[4] = new Model("On Strike", "Win the game without cleaning any bodies.", "5");
            Model[5] = new Model("Impossible!", "Manage to clean your own dead body.", "25");
            Model[6] = new Model("", "", "");

        } else if (Achievement.equals("Godfather")) {
            ImageAchievement.setImageResource(R.drawable.achievement_godfather);
            Model = new Model[5];
            Model[0] = new Model("Leader of the Mafia", "Win 1 game as a Godfather", "5");
            Model[1] = new Model("Cosa Nostra", "Win 5 games as a Godfather", "5");
            Model[2] = new Model("Organized Crime", "Win 10 games as a Godfather", "10");
            Model[3] = new Model("Evil Syndicate", "Win 25 games as a Godfather", "25");
            Model[4] = new Model("Mastermind", "Win the game without dying.", "5");

        } else if (Achievement.equals("Mafioso")) {
            ImageAchievement.setImageResource(R.drawable.achievement_mafioso);
            Model = new Model[6];
            Model[0] = new Model("Mobster", "Win 1 game as a Mafioso", "5");
            Model[1] = new Model("Gangster", "Win 5 games as a Mafioso", "5");
            Model[2] = new Model("Hoodlum", "Win 10 games as a Mafioso", "10");
            Model[3] = new Model("Thug", "Win 25 games as a Mafioso", "25");
            Model[4] = new Model("Michael Corleone", "Be promoted to the Godfather.", "5");
            Model[5] = new Model("Loyal Servant", "Win without dying or becoming the Godfather.", "5");

        } else if (Achievement.equals("All Neutrals")) {
            ImageAchievement.setImageResource(R.drawable.achievement_general);
            Model = new Model[2];
            Model[0] = new Model("Pacifist in Training", "Win with half of the Neutral roles.", "10");
            Model[1] = new Model("Indifferent", "Win with all of the Neutral roles.", "25");

        } else if (Achievement.equals("Amnesiac")) {
            ImageAchievement.setImageResource(R.drawable.achievement_amnesiac);
            Model = new Model[7];
            Model[0] = new Model("Oblivious", "Win 1 game as a Amnesiac", "5");
            Model[1] = new Model("Forgetful", "Win 5 games as a Amnesiac", "5");
            Model[2] = new Model("Clouded Mind", "Win 10 games as a Amnesiac", "10");
            Model[3] = new Model("Blackout", "Win 25 games as a Amnesiac", "25");
            Model[4] = new Model("Still Neutral", "Remember that you were a Survivor.", "5");
            Model[5] = new Model("I am who I am.", "Remember that you were an Amnesiac.", "5");
            Model[6] = new Model("Taking Sides", "Remember that you were a member of the Mafia.", "5");

        } else if (Achievement.equals("Survivor")) {
            ImageAchievement.setImageResource(R.drawable.achievement_survivor);
            Model = new Model[7];
            Model[0] = new Model("I'm not gon' give up!", "Win 1 game as a Survivor", "5");
            Model[1] = new Model("Refuse to Die", "Win 5 games as a Survivor", "5");
            Model[2] = new Model("Persevere", "Win 10 games as a Survivor", "10");
            Model[3] = new Model("Still Standing", "Win 25 games as a Survivor", "25");
            Model[4] = new Model("Trusting a Psycho", "Win with a Serial Killer.", "5");
            Model[5] = new Model("Not Afraid", "Win without using a bulletproof vest.", "5");
            Model[6] = new Model("Kevlar", "Have your bulletproof vest save you from death.", "5");

        } else if (Achievement.equals("Witch")) {
            ImageAchievement.setImageResource(R.drawable.achievement_witch);
            Model = new Model[7];
            Model[0] = new Model("Occultist", "Win 1 game as a Witch", "5");
            Model[1] = new Model("Enchantress", "Win 5 games as a Witch", "5");
            Model[2] = new Model("Voodoo", "Win 10 games as a Witch", "10");
            Model[3] = new Model("Warlock", "Win 25 games as a Witch", "25");
            Model[4] = new Model("Double-Edged Sword", "Force 2 Town members to die to a Veteran in a game.", "10");
            Model[5] = new Model("Directing the Blade", "Control a Serial Killer 5 times in a game.", "25");
            Model[6] = new Model("Two Birds, One Stone", "Make a Vigilante shoot another town member.", "25");

        } else if (Achievement.equals("Jester")) {
            ImageAchievement.setImageResource(R.drawable.achievement_jester);
            Model = new Model[7];
            Model[0] = new Model("Joker", "Win 1 game as a Jester", "5");
            Model[1] = new Model("Trickster", "Win 5 games as a Jester", "5");
            Model[2] = new Model("Suicidal", "Win 10 games as a Jester", "10");
            Model[3] = new Model("Lunatic", "Win 25 games as a Jester", "25");
            Model[4] = new Model("Arsonist's Evil Spirit", "Haunt an Arsonist.", "5");
            Model[5] = new Model("Godfather's Phantom", "Haunt the Godfather.", "5");
            Model[6] = new Model("Serial Killer's Spectre", "Haunt a Serial Killer.", "5");

        } else if (Achievement.equals("Executioner")) {
            ImageAchievement.setImageResource(R.drawable.achievement_executioner);
            Model = new Model[7];
            Model[0] = new Model("Firing Squad", "Win 1 game as a Executioner", "5");
            Model[1] = new Model("Guillotine", "Win 5 games as a Executioner", "5");
            Model[2] = new Model("lynch 'Em", "Win 10 games as a Executioner", "10");
            Model[3] = new Model("Gas Chamber", "Win 25 games as a Executioner", "25");
            Model[4] = new Model("Quick Execution", "Get your target lynched on day 2.", "25");
            Model[5] = new Model("Popular Target", "Be attacked 5 or more times in a game.", "25");
            Model[6] = new Model("Live once, Die twice", "Get your target lynched twice.", "25");

        } else if (Achievement.equals("Arsonist")) {
            ImageAchievement.setImageResource(R.drawable.achievement_arsonist);
            Model = new Model[7];
            Model[0] = new Model("Pyromaniac", "Win 1 game as a Arsonist", "5");
            Model[1] = new Model("Firebug", "Win 5 games as a Arsonist", "5");
            Model[2] = new Model("Incendiary", "Win 10 games as a Arsonist", "10");
            Model[3] = new Model("Ifrit", "Win 25 games as a Arsonist", "25");
            Model[4] = new Model("It's gettin' hot in here", "Ignite yourself.", "10");
            Model[5] = new Model("There can be only one", "Ignite a Serial Killer and Godfather in the same night.", "25");
            Model[6] = new Model("Disco Inferno", "Ignite 5 or more people in one night.", "25");

        } else if (Achievement.equals("Serial Killer")) {
            ImageAchievement.setImageResource(R.drawable.achievement_serialkiller);
            Model = new Model[7];
            Model[0] = new Model("Lonely Killer", "Win 1 game as a Serial Killer", "5");
            Model[1] = new Model("Murderer", "Win 5 games as a Serial Killer", "5");
            Model[2] = new Model("Psychopath", "Win 10 games as a Serial Killer", "10");
            Model[3] = new Model("Sociopath", "Win 25 games as a Serial Killer", "25");
            Model[4] = new Model("Psychopathic Pact", "Win the game with another Serial Killer.", "5");
            Model[5] = new Model("Dexter Morgan", "Kill the Jailor who jailed you.", "5");
            Model[6] = new Model("Bay Harbor Butcher", "Kill 5 or more people in one game.", "25");

        } else {
            Model = new Model[1];
            Model[0] = new Model("ERROR!", "Sorry that happened :(", "0");
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
