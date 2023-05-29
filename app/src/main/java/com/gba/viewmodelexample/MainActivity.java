package com.gba.viewmodelexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    MainActivityViewModel mainActivityViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = findViewById(R.id.textView);
        Button button = findViewById(R.id.button);

        mainActivityViewModel = new ViewModelProvider(this).get(MainActivityViewModel.class);

        textView.setText("Count = " + mainActivityViewModel.getCounter());


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainActivityViewModel.incrementCounter();
                textView.setText("Count = " + mainActivityViewModel.getCounter());
            }
        });
    }
}