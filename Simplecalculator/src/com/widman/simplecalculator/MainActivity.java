package com.widman.simplecalculator;




//This is the app that I made, Jacob Widman Himself


import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
	EditText num1;
	EditText num2;
	TextView tv;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Button add = (Button) findViewById(R.id.add);
		 Button sub = (Button) findViewById(R.id.sub);
		 Button mult = (Button) findViewById(R.id.mult);
		 Button div = (Button) findViewById(R.id.div);
		num1 = (EditText) findViewById(R.id.et1);
		num2 = (EditText) findViewById(R.id.et2);
		tv = (TextView) findViewById(R.id.textView1);
		
        add.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
            	String nug = num1.getText().toString();
            	int x = Integer.parseInt(nug);
            	String nur = num2.getText().toString();
            	int y = Integer.parseInt(nur);
            	
            	int re = x+y;
            	
            	tv.setText("" + re);
           }
        });
		
        
        sub.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
            	String nug = num1.getText().toString();
            	int x = Integer.parseInt(nug);
            	String nur = num2.getText().toString();
            	int y = Integer.parseInt(nur);
            	int re = x-y;
            	
            	tv.setText("" + re);
            	
           }
        });
        
        mult.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
            	String nug = num1.getText().toString();
            	int x = Integer.parseInt(nug);
            	String nur = num2.getText().toString();
            	int y = Integer.parseInt(nur);
            	int re = x*y;
            	tv.setText("" + re);
           }
        });
        
        div.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
            	String nug = num1.getText().toString();
            	int x = Integer.parseInt(nug);
            	String nur = num2.getText().toString();
            	int y = Integer.parseInt(nur);
            	int re = x/y;
            	tv.setText("" + re);
            	
            	
            
       
            }
            });
	
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}
