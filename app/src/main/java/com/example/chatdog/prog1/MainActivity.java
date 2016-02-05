package com.example.chatdog.prog1;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.EditText;
import java.util.HashMap;
import java.lang.Double;

public class MainActivity extends AppCompatActivity {
    private String exerciseType;
    private int exerciseCount;
    private HashMap<String, Integer> exerciseRates;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        exerciseType = "";
        exerciseCount = -1;
        exerciseRates = new HashMap<String, Integer>();
        exerciseRates.put("Pushups", 350);
        exerciseRates.put("Situps", 200);
        exerciseRates.put("Jumping Jacks", 10);
        exerciseRates.put("Jogging", 12);
        exerciseRates.put("Squats", 225);
        exerciseRates.put("Leg Lifts", 25);
        exerciseRates.put("Planks", 25);
        exerciseRates.put("Pullups", 100);
        exerciseRates.put("Cycling", 12);
        exerciseRates.put("Walking", 20);
        exerciseRates.put("Swimming", 13);
        exerciseRates.put("Stair Climbing", 15);
    }

    public void pushupButtonOnClick(View v){
        exerciseType = "Pushups";
        setValues();
    }

    public void situpButtonOnClick(View v){
        exerciseType = "Situps";
        setValues();
    }

    public void jackButtonOnClick(View v){
        exerciseType = "Jumping Jacks";
        setValues();
    }

    public void joggingButtonOnClick(View v){
        exerciseType = "Jogging";
        setValues();
    }

    public void squatsButtonOnClick(View v){
        exerciseType = "Squats";
        setValues();
    }

    public void legliftButtonOnClick(View v){
        exerciseType = "Leg Lifts";
        setValues();
    }

    public void plankButtonOnClick(View v){
        exerciseType = "Planks";
        setValues();
    }

    public void pullupButtonOnClick(View v){
        exerciseType = "Pullups";
        setValues();
    }

    public void cyclingButtonOnClick(View v){
        exerciseType = "Cycling";
        setValues();
    }

    public void walkingButtonOnClick(View v){
        exerciseType = "Walking";
        setValues();
    }

    public void swimmingButtonOnClick(View v){
        exerciseType = "Swimming";
        setValues();
    }

    public void stairsButtonOnClick(View v){
        exerciseType = "Stair Climbing";
        setValues();
    }

    protected void setValues(){
        String input = ((EditText)(findViewById(R.id.inputText))).getText().toString();
        if (exerciseType.equals("") || input.equals("")){
            return;
        }
        exerciseCount = Integer.valueOf(input);
        Double rate = exerciseRates.get(exerciseType) / 100.0;
        int calorie =  (int) (exerciseCount / rate);
        ((TextView) findViewById(R.id.caloriesText)).setText(Integer.toString(calorie));

        Double pushupRate = exerciseRates.get("Pushups") / 100.0;
        int pushups = (int) (calorie * pushupRate);
        ((TextView) findViewById(R.id.pushupEquivalent)).setText(Integer.toString(pushups));

        Double situpRate = exerciseRates.get("Situps") / 100.0;
        int situps = (int) (calorie * situpRate);
        ((TextView) findViewById(R.id.situpEquivalent)).setText(Integer.toString(situps));

        Double jackRate = exerciseRates.get("Jumping Jacks") / 100.0;
        int jacks = (int) (calorie * jackRate);
        ((TextView) findViewById(R.id.jackEquivalent)).setText(Integer.toString(jacks));

        Double joggingRate = exerciseRates.get("Jogging") / 100.0;
        int jogging = (int) (calorie * joggingRate);
        ((TextView) findViewById(R.id.joggingEquivalent)).setText(Integer.toString(jogging));

        Double squatsRate = exerciseRates.get("Squats") / 100.0;
        int squats = (int) (calorie * squatsRate);
        ((TextView) findViewById(R.id.squatEquivalent)).setText(Integer.toString(squats));

        Double legliftRate = exerciseRates.get("Leg Lifts") / 100.0;
        int leglift = (int) (calorie * legliftRate);
        ((TextView) findViewById(R.id.legliftEquivalent)).setText(Integer.toString(leglift));

        Double plankRate = exerciseRates.get("Planks") / 100.0;
        int planks = (int) (calorie * plankRate);
        ((TextView) findViewById(R.id.plankEquivalent)).setText(Integer.toString(planks));

        Double pullupRate = exerciseRates.get("Pullups") / 100.0;
        int pullups = (int) (calorie * pullupRate);
        ((TextView) findViewById(R.id.pullupEquivalent)).setText(Integer.toString(pullups));

        Double cyclingRate = exerciseRates.get("Cycling") / 100.0;
        int cycling = (int) (calorie * cyclingRate);
        ((TextView) findViewById(R.id.cyclingEquivalent)).setText(Integer.toString(cycling));

        Double walkingRate = exerciseRates.get("Walking") / 100.0;
        int walking = (int) (calorie * walkingRate);
        ((TextView) findViewById(R.id.walkingEquivalent)).setText(Integer.toString(walking));

        Double swimmingRate = exerciseRates.get("Swimming") / 100.0;
        int swimming = (int) (calorie * swimmingRate);
        ((TextView) findViewById(R.id.swimmingEquivalent)).setText(Integer.toString(swimming));

        Double stairsRate = exerciseRates.get("Stair Climbing") / 100.0;
        int stairs = (int) (calorie * stairsRate);
        ((TextView) findViewById(R.id.stairsEquivalent)).setText(Integer.toString(stairs));

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
