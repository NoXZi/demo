package com.example.alexv.demoprojekt;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.util.StringBuilderPrinter;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.app.Activity;
import android.os.Bundle;

import android.view.View;
import android.widget.TextView;

import java.util.Scanner;

public class MainActivity extends AppCompatActivity {

    EditText txt1;
    EditText txt2;
    EditText txt3;
    TextView txt4;

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

        Log.i("[OUR DEBUG]", "My debug msg");





         txt1 = (EditText) findViewById(R.id.editText);
         txt2 = (EditText) findViewById(R.id.editText2);
         txt3 = (EditText) findViewById(R.id.editText3);
         final Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener()
        {         @Override
            public void onClick (View view){
            StringBuffer sr = new StringBuffer(txt1.getText().toString());
            StringBuffer sr2 = new StringBuffer(txt2.getText().toString());
                String r1 = sr.reverse().toString();
                String r2 = sr2.reverse().toString();
                txt3.setText(r1+" "+r2);


            }
        });
        Button button = (Button) findViewById(R.id.button3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String sr = new String(txt1.getText().toString());
                String sr2 = new String(txt2.getText().toString());
                String reverse = "";
                String reverse2 = "";
                int length = sr.length();
                int length2 = sr2.length();

                for (int i = length - 1; i >= 0; i--) {
                    reverse = reverse + sr.charAt(i);

                }
                for (int i = length2 - 1; i >= 0; i--) {
                    reverse2 = reverse2 + sr2.charAt(i);

                }
                txt3.setText(reverse+" "+reverse2);
            }
            });


    }

    public void hello (View v){
        Snackbar.make(v, "Привет всем из этой строки!", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show();

    };

    public void clik (View v) {
        Log.i("from outter func", "hello");
        StringBuffer fr = new StringBuffer(txt1.getText().toString());
        Integer index=0;
        txt4 = (TextView) findViewById(R.id.textView3);

        while (index<fr.length()/2){
            swap(fr, index, txt1.length() - index - 1);
            ++index;
        }
        txt3.setText(fr);
    }

    public void swap(StringBuffer str, Integer index1, Integer index2  ){
        Log.e("Swap: ", index1 + "(" + str.charAt(index1) + ") & " + index2 + "(" + str.charAt(index2) + ")");
        txt4.setText(txt4.getText() + "\nSwap: "+ index1 + "(" + str.charAt(index1) + ") & " + index2 + "(" + str.charAt(index2) + ")");
        str.insert(index2.intValue() + 1, str.charAt(index1));
        str.setCharAt(index1, str.charAt(index2));
        str.deleteCharAt(index2);
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
