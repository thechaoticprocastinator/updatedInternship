package com.example.updatedinternship;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView t1;
    EditText e1;
    String i1 = "1801106392";
    String i2 = "1801106310";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button b1 = (Button)findViewById(R.id.button);
        t1 = (TextView)findViewById(R.id.textView);
        e1 = (EditText)findViewById(R.id.editText);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override


            public void onClick(View view) {

                String t = e1.getText().toString();
                if(t.equals(i1))
                    t1.setText("ROHAN NAYAK");

                if(t.equals(i2))
                    t1.setText("NIKHIL PATRO");

            }
        });
    }
}
