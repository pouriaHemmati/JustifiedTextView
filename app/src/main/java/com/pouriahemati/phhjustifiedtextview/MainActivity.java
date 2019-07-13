package com.pouriahemati.phhjustifiedtextview;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.TypedValue;

public class MainActivity extends AppCompatActivity {
    private PHJustifiedTextView phJustifiedTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       phJustifiedTextView=(PHJustifiedTextView) findViewById(R.id.txt_test);
       phJustifiedTextView.setText(getResources().getString(R.string.txt_test));
       phJustifiedTextView.setTextSize(TypedValue.COMPLEX_UNIT_SP,15);
       phJustifiedTextView.setLineSpacing(15);

        phJustifiedTextView.setAlignment(Paint.Align.RIGHT);
    }
}
