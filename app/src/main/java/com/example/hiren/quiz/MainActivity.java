package com.example.hiren.quiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String questOneAnswer = "Personal Computer";
    String questTwoAnswer = "Central Processing Unit";
    boolean hasMotherboard;
    boolean hasMonitor;
    boolean hasPSU;
    boolean hasCPU;
    boolean hasGames;
    boolean hasYoutube;
    boolean hasVideoEdit;
    boolean hasSocial;
    boolean hasApple;
    boolean hasSamsung;
    boolean hasGoogle;
    boolean hasMicrosoft;
    int numOfCorrect = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Checks whether the user response for question one is correct
    private void checkQuestOne() {

        EditText questOne = findViewById(R.id.Quest_one_answer);
        String thing = questOne.getText().toString();

        if (questOneAnswer.equals(thing)) {
            numOfCorrect++;
        }
    }

    //Checks whether the user response for question two is correct
    private void checkQuestTwo() {

        EditText questTwo = findViewById(R.id.Quest_two_answer);
        String component = questTwo.getText().toString();

        if (questTwoAnswer.equals(component)) {
            numOfCorrect++;
        }

    }

    //Checks if user has selected the correct checkboxes for question three
    private void checkQuestThree() {
        CheckBox motherboard = findViewById(R.id.quest_three_checkbox1);
        hasMotherboard = motherboard.isChecked();
        CheckBox monitor = findViewById(R.id.quest_three_checkbox2);
        hasMonitor = monitor.isChecked();
        CheckBox psu = findViewById(R.id.quest_three_checkbox3);
        hasPSU = psu.isChecked();
        CheckBox cpu = findViewById(R.id.quest_three_checkbox4);
        hasCPU = cpu.isChecked();

        if (hasMotherboard && hasMonitor && hasPSU && hasCPU) {
            numOfCorrect++;
        }


    }

    //Checks if user has selected the correct checkboxes for question four
    private void checkQuestFour() {
        CheckBox playGames = findViewById(R.id.quest_four_checkbox1);
        hasGames = playGames.isChecked();
        CheckBox youtube = findViewById(R.id.quest_four_checkbox2);
        hasYoutube = youtube.isChecked();
        CheckBox videoEdit = findViewById(R.id.quest_four_checkbox3);
        hasVideoEdit = videoEdit.isChecked();
        CheckBox social = findViewById(R.id.quest_four_checkbox4);
        hasSocial = social.isChecked();

        if (hasGames && hasVideoEdit) {
            numOfCorrect++;
        }

    }

    //Checks if the user has selected the correct radio button response for question five
    private void checkQuestFive() {
        RadioButton apple = findViewById(R.id.quest_five_radio_one);
        hasApple = apple.isChecked();
        RadioButton samsung = findViewById(R.id.quest_five_radio_two);
        hasSamsung = samsung.isChecked();
        RadioButton google = findViewById(R.id.quest_five_radio_three);
        hasGoogle = google.isChecked();
        RadioButton microsoft = findViewById(R.id.quest_five_radio_four);
        hasMicrosoft = microsoft.isChecked();

        if (hasMicrosoft) {
            numOfCorrect++;
        }

    }

    //Calculates how many response the user had correct out of the total questions
    public void evaluate(View view) {
        checkQuestOne();
        checkQuestTwo();
        checkQuestThree();
        checkQuestFour();
        checkQuestFive();

        Toast.makeText(this, "You have" + numOfCorrect + " Questions correctly answered", Toast.LENGTH_SHORT).show();

        numOfCorrect = 0;

    }


}