package com.example.gpa_dauz1_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.graphics.Color;

public class MainActivity extends AppCompatActivity {

    TextView result;
    EditText gpa1, gpa2, gpa3, gpa4, gpa5;
    Button calcgpa;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        result = (TextView)findViewById(R.id.result);
        gpa1 = (EditText)findViewByID(R.id.gpa1);
        gpa2 = (EditText)findViewByID(R.id.gpa2);
        gpa3 = (EditText)findViewByID(R.id.gpa3);
        gpa4 = (EditText)ffindViewByID(R.id.gpa4);
        gpa5 = (EditText)findViewByID(R.id.gpa5);

        Button calcgpa = (Button) findViewByID(R.id.calcgpa);

        calcgpa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int gpaone = Integer.parseInt(gpa1.getText().toString());
                int gpatwo = Integer.parseInt(gpa2.getText().toString());
                int gpathree = Integer.parseInt(gpa3.getText().toString());
                int gpafour = Integer.parseInt(gpa4.getText().toString());
                int gpafive = Integer.parseInt(gpa5.getText().toString());
                int gparesult = (gpaone + gpatwo + gpathree + gpafour + gpafive)/5;
                result.setText(String.valueOf(gparesult));

                if (gparesult <= 4.0 ){
                    gparesult.setTextColor(this.getResources().getColor(R.color.GREEN));
                } else if (gparesult <= 3.0 ) {
                    gparesult.setTextColor(this.getResources().getColor(R.color.YELLOW));
                } else (gparesult = 0.0 ) {
                    gparesult.setTextColor(this.getResources().getColor(R.color.RED));
            }
            }
        }


}
