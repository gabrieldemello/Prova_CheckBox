package com.example.prova_ckeckbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private CheckBox mGoogleCheck, mBingCheck, mYahooCheck;
    private Button mWriteResultButton;
    private TextView mResultTextView;
    private ArrayList<String> mResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mGoogleCheck = findViewById(R.id.check_google);
        mBingCheck = findViewById(R.id.check_bing);
        mYahooCheck = findViewById(R.id.check_yahoo);

        mWriteResultButton = findViewById(R.id.write_result);
        mResultTextView = findViewById(R.id.result);
        mResult = new ArrayList<>();
        mResultTextView.setEnabled(false);

        mGoogleCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mGoogleCheck.isChecked())
                    mResult.add("Google");
                else
                    mResult.remove("Google");

            }
        });
        mBingCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mBingCheck.isChecked())
                    mResult.add("Bing");
                else
                    mResult.remove("Bing");

            }
        });

        mYahooCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               if (mYahooCheck.isChecked())
                   mResult.add("Yahoo");
               else
                   mResult.remove("Yahoo");

            }
        });

        mWriteResultButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuilder stringBuilder = new StringBuilder();
                for (String s :  mResult)
                    stringBuilder.append(s).append("\n");

                mResultTextView.setText(stringBuilder.toString());
                mResultTextView.setEnabled(false);
            }
        });

    }
}