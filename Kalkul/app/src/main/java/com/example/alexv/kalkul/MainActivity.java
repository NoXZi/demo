package com.example.alexv.kalkul;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.app.Activity;
import android.app.AlertDialog;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button b0;
    Button b1;
    Button b2;
    Button b3;
    Button b4;
    Button b5;
    Button b6;
    Button b7;
    Button b8;
    Button b9;
    Button bpls;
    Button bdel;
    Button bmin;
    Button bc;
    Button btoch;
    Button bum;
    Button brav;
    EditText txt;
    EditText txt2;
    TextView res2;
    Float res;
    Float num1;
    Float num2;
    String oper;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        res = 0f;
        res2 = (TextView) findViewById(R.id.textView2);
        txt = (EditText) findViewById(R.id.editText);
        b0 = (Button) findViewById(R.id.button0);
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt.setText(txt.getText() + "0");
                res2.setText(res2.getText() + "0");
            }
        });
        b1 = (Button) findViewById(R.id.button1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt.setText(txt.getText() + "1");
                res2.setText(res2.getText() + "1");
            }
        });

        b2 = (Button) findViewById(R.id.button2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt.setText(txt.getText() + "2");
                res2.setText(res2.getText() + "2");
            }
        });
        b3 = (Button) findViewById(R.id.button3);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt.setText(txt.getText() + "3");
                res2.setText(res2.getText() + "3");
            }
        });
        b4 = (Button) findViewById(R.id.button4);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt.setText(txt.getText() + "4");
                res2.setText(res2.getText() + "4");
            }
        });
        b5 = (Button) findViewById(R.id.button5);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt.setText(txt.getText() + "5");
                res2.setText(res2.getText() + "5");
            }
        });
        b6 = (Button) findViewById(R.id.button6);
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt.setText(txt.getText() + "6");
                res2.setText(res2.getText() + "6");
            }
        });
        b7 = (Button) findViewById(R.id.button7);
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt.setText(txt.getText() + "7");
                res2.setText(res2.getText() + "7");
            }
        });
        b8 = (Button) findViewById(R.id.button8);
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt.setText(txt.getText() + "8");
                res2.setText(res2.getText() + "8");
            }
        });
        b9 = (Button) findViewById(R.id.button9);
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt.setText(txt.getText() + "9");
                res2.setText(res2.getText() + "9");
            }
        });
        btoch = (Button) findViewById(R.id.buttontoch);
        btoch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt.setText(txt.getText() + ".");
                res2.setText(res2.getText() + ".");
            }
        });
        bc = (Button) findViewById(R.id.buttonc);
        bc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (txt.getText().length()!=0){
                txt.getText().delete(txt.length() - 1, txt.length());
                }
                String str = res2.getText().toString().trim();
                if(str.length()!=0){
                    str  = str.substring( 0, str.length() - 1 );
                    res2.setText ( str );
                }
            }
        });
        bpls = (Button) findViewById(R.id.buttonpl);
        bpls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vvd(view);
                oper = "+";
                res2.setText(res2.getText()+" " + oper + " " );
                if (txt.getText().length() == 0 && res != null  ){
                    res2.setText(num1+" "+ oper + " " );
                }
                txt.setText("");

            }
        });
        bdel = (Button) findViewById(R.id.buttondel);
        bdel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vvd(view);
                oper = "/";
                res2.setText(res2.getText()+" " + oper + " " );
                if (txt.getText().length() == 0 && res != null ){
                    res2.setText(num1+" "+ oper + " " );
                }
                txt.setText("");
            }
        });
        bmin = (Button) findViewById(R.id.buttonmin);
        bmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vvd(view);
                oper = "-";
                res2.setText(res2.getText()+" " + oper + " " );
                if (txt.getText().length() == 0 && res != null ){
                    res2.setText(num1+" "+ oper + " " );
                }
                txt.setText("");
            }
        });
        bum = (Button) findViewById(R.id.buttonum);
        bum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vvd(view);
                oper = "*";
                res2.setText(res2.getText()+" " + oper + " " );
                if (txt.getText().length() == 0 && res != null ){
                    res2.setText(num1+" "+ oper + " " );
                }
                txt.setText("");
            }
        });
        brav = (Button) findViewById(R.id.buttonrav);
        brav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (num1 == null || txt.getText().length() == 0){
                    Snackbar.make(view, "Введите значения", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();
                } else switch (oper) {
                    case "+": {
                        num2 = Float.parseFloat(txt.getText().toString());
                        res = num1 + num2;
                        res2.setText(res2.getText()+ " " +  " = " + res + "\n");
                        num1 = res;
                        txt.setText("");
                        break;
                    }
                    case "-": {
                        num2 = Float.parseFloat(txt.getText().toString());
                        res = num1 - num2;
                        res2.setText(res2.getText()+ " " +  " = " + res+ "\n");
                        num1 = res;
                        txt.setText("");
                        break;
                    }
                    case "*": {
                        num2 = Float.parseFloat(txt.getText().toString());
                        res = num1 * num2;
                        res2.setText(res2.getText()+ " " +  " = " + res+ "\n");
                        num1 = res;
                        txt.setText("");
                        break;
                    }
                    case "/": {
                        num2 = Float.parseFloat(txt.getText().toString());
                        res = num1 / num2;
                        if (num2 == 0 || num1 == 0) {
                            Snackbar.make(view, "Деление на ноль", Snackbar.LENGTH_LONG)
                                    .setAction("Action", null).show();
                        } else  res2.setText(res2.getText()+ " " +  " = " + res+ "\n" );
                        num1 = res;
                        txt.setText("");
                        break;
                    }
                }

            }
        });



        txt.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {


            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {

                if (txt.getText().length() != 0) {
                    bc.setEnabled(true);
                } else {
                    bc.setEnabled(false);
                }
                if (res2.getText().length() != 0) {
                    bc.setEnabled(true);
                } else {
                    bc.setEnabled(false);
                }

            }
        });
    }
    public void vvd(View v) {
        if (res == null) {
            Snackbar.make(v , "Введите значения", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show();
        }
        if (txt.getText().length() != 0) {
            num1 = Float.parseFloat(txt.getText().toString());
        } else {
            num1 = res;
        }
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
