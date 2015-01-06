package com.artinianv.quickquiz;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;


public class QuickQuiz extends Activity {

    public TextView questionText;
    public Button buttontrue;
    public Button buttonfalse;

    public ArrayList<Question> questions;

    public int index = 0;
    public int questionCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quick_quiz);

        questions.add(new Questions("There are 24 hours in one day.","true"));

        questionCount = questions.size()

        questionText = (TextView)findViewById(R.id.questionText);
        buttontrue = (Button)findViewById(R.id.buttontrue);
        buttonfalse = (Button)findViewById(R.id.buttonfalse);

        questionText.setText("This statement is false.");
        @Override
        public void onClick(View v) {
         if (questions.get())
            Toast toast = Toast.makeText(getApplicationContext(), "Correct!", Toast.LENGTH_SHORT);
            toast.show();



            Toast toast = Toast.makeText(getApplicationContext(), "Incorrect!", Toast.LENGTH_SHORT);
            toast.show();
        }
    }

}
