package com.manrajsingh.example.lesson2;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static java.lang.String.*;


public class MainActivity extends AppCompatActivity {

    private Button answerYes,answerNo;
    private EditText userName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        answerYes = (Button) findViewById(R.id.answer_yes_button);
        answerNo = (Button) findViewById(R.id.answer_no_button);
        userName = (EditText) findViewById(R.id.users_name);
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

    public void onYesButtonClick(View view) {
        String usersName = valueOf(userName.getText());
        String yourYesResponse = "That is great "+ usersName;
        Toast.makeText(this,yourYesResponse,Toast.LENGTH_LONG).show();
    }

    public void onNoButtonClick(View view) {
        String usersName = valueOf(userName.getText());
        String yourNoResponse = "Too Bad "+ usersName;
        Toast.makeText(this,yourNoResponse,Toast.LENGTH_LONG).show();
    }
}
