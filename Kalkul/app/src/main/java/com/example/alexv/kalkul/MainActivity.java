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

        res2 = (TextView) findViewById(R.id.textView2);
        txt = (EditText) findViewById(R.id.editText);



        b0 = (Button) findViewById(R.id.button0);
        b0.setOnClickListener(new View.OnClickListener()
        {         @Override
        public void onClick (View view){
            txt.setText(txt.getText() + "0");
        }
        });
        b1 = (Button) findViewById(R.id.button1);
        b1.setOnClickListener(new View.OnClickListener()
        {         @Override
        public void onClick (View view){
            txt.setText(txt.getText() + "1");
        }
        });
        b2 = (Button) findViewById(R.id.button2);
        b2.setOnClickListener(new View.OnClickListener()
        {         @Override
        public void onClick (View view){
            txt.setText(txt.getText() + "2");
        }
        });
        b3 = (Button) findViewById(R.id.button3);
        b3.setOnClickListener(new View.OnClickListener()
        {         @Override
        public void onClick (View view){
            txt.setText(txt.getText() + "3");
        }
        });
        b4 = (Button) findViewById(R.id.button4);
        b4.setOnClickListener(new View.OnClickListener()
        {         @Override
        public void onClick (View view){
            txt.setText(txt.getText() + "4");
        }
        });
        b5 = (Button) findViewById(R.id.button5);
        b5.setOnClickListener(new View.OnClickListener()
        {         @Override
        public void onClick (View view){
            txt.setText(txt.getText() + "5");
        }
        });
        b6 = (Button) findViewById(R.id.button6);
        b6.setOnClickListener(new View.OnClickListener()
        {         @Override
        public void onClick (View view){
            txt.setText(txt.getText() + "6");
        }
        });
        b7 = (Button) findViewById(R.id.button7);
        b7.setOnClickListener(new View.OnClickListener()
        {         @Override
        public void onClick (View view){
            txt.setText(txt.getText() + "7");;
        }
        });
        b8 = (Button) findViewById(R.id.button8);
        b8.setOnClickListener(new View.OnClickListener()
        {         @Override
        public void onClick (View view){
            txt.setText(txt.getText() + "8");
        }
        });
        b9 = (Button) findViewById(R.id.button9);
        b9.setOnClickListener(new View.OnClickListener()
        {         @Override
        public void onClick (View view){
            txt.setText(txt.getText() + "9");
        }
        });
        bpls = (Button) findViewById(R.id.buttonpl);
        bpls.setOnClickListener(new View.OnClickListener()
        {         @Override
        public void onClick (View view){
            num1 = Float.parseFloat(txt.getText().toString());
            txt.setText("");
            oper = "+";
            if (txt.getText().length() != 0 ){
                num1=res;
            }
        }
        });
        bdel = (Button) findViewById(R.id.buttondel);
        bdel.setOnClickListener(new View.OnClickListener()
        {         @Override
        public void onClick (View view){
            txt.setText(txt.getText() + " / ");
        }
        });
        bmin = (Button) findViewById(R.id.buttonmin);
        bmin.setOnClickListener(new View.OnClickListener()
        {         @Override
        public void onClick (View view){

            num1 = Float.parseFloat(txt.getText().toString());
            if (txt.getText().length() != 0 ){
                num1=res;
            }
            txt.setText("");
            oper = "-";

        }
        });
        bum = (Button) findViewById(R.id.buttonum);
        bum.setOnClickListener(new View.OnClickListener()
        {         @Override
        public void onClick (View view){
            num1 = Float.parseFloat(txt.getText().toString());
            txt.setText("");
            oper = "*";
            if (txt.getText().length() != 0 ){
                num1=res;
            }

        }
        });
        btoch = (Button) findViewById(R.id.buttontoch);
        btoch.setOnClickListener(new View.OnClickListener()
        {         @Override
        public void onClick (View view){
            txt.setText(txt.getText() + ".");
        }
        });
        bc = (Button) findViewById(R.id.buttonc);
        bc.setOnClickListener(new View.OnClickListener()
        {         @Override
            public void onClick (View view) {
                txt.getText().delete(txt.length() - 1, txt.length());
            }
        });
        brav = (Button) findViewById(R.id.buttonrav);
        brav.setOnClickListener(new View.OnClickListener()
        {         @Override
        public void onClick (View view){
            switch (oper) {
                case "+": {
                    num2=Float.parseFloat(txt.getText().toString());
                    res= num1+num2;
                    res2.setText(num1+ " "+ oper +" "+  num2 + " = " + res );
                    num1 = res;
                    txt.setText("");
                    break;

                }
                case "-": {
                    num2=Float.parseFloat(txt.getText().toString());
                    res= num1-num2;
                    res2.setText(num1+ " "+ oper +" "+  num2 + " = " + res );
                    num1 = res;
                    txt.setText("");
                    break;

                }
                case "*": {
                    num2=Float.parseFloat(txt.getText().toString());
                    res= num1*num2;
                    res2.setText(num1+ " "+ oper +" "+  num2 + " = " + res );
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
               /*Log.i("txt", "before");*/

           }

           @Override
           public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

           }

           @Override
           public void afterTextChanged(Editable editable) {

               if (txt.getText().length() != 0 ){
                   bc.setEnabled(true);
               }else {bc.setEnabled(false);}


           }
        });
          /*  if (txt.getText().length() != 0) {

                txt.getText().delete(txt.length()-1,txt.length());
            }else {bc.setEnabled(false);}*/



          /*  if(TextUtils.isEmpty(txt.getText().toString())){

                Snackbar.make(view, "Строка пуста", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
            else {
                txt.getText().delete(txt.length()-1,txt.length());
            }*/


   }

   /* public void  OnClick (View v){
        float res = 0;
        String oper = "";
        float num1 = Float.parseFloat(txt.getText().toString());
        float num2 = Float.parseFloat(txt2.getText().toString());
        TextView res2 = (TextView) findViewById(R.id.textView2);
    switch (v.getId()) {
        case R.id.buttonpl:
            oper = "+";
            res = num1 + num2;
            break;

        default:
            break;
}
res2.setText(num1 + " "+oper+" "+num2 +" = "+res);

    }*/

    // формируем строку вывода

/*public void pls (String str, Integer index1, Integer index2 ){
     String s = txt.getText().toString();
  if  (s.matches("([\\d]*)")){
if (s.matches("([\\+]*)")){

}


      }

  }*/
public void vvd() {
    if (res != 0){

        num1 = Float.parseFloat(txt.getText().toString());
    }else if (txt.getText().length() != 0 ){
        num1=res;

    }

    txt.setText("");
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
