package com.example.b_billing.activities;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.util.Pair;

import com.example.b_billing.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.datepicker.MaterialDatePicker;

public class ReportActivity extends AppCompatActivity {
    MaterialButton pickDate, pickDateRange;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report);
        //Elements
        pickDate = findViewById(R.id.pickDate);
        pickDateRange = findViewById(R.id.pickDateRange);

        //Clicks
        pickDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MaterialDatePicker datePicker =
                        MaterialDatePicker.Builder.datePicker()
                                .setTitleText("Select date").setSelection(MaterialDatePicker.todayInUtcMilliseconds())
                                .build();
                datePicker.show(getSupportFragmentManager(),"datepicker");
            }
        });
        pickDateRange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MaterialDatePicker dateRangePicker =
                        MaterialDatePicker.Builder.dateRangePicker()
                                .setTitleText("Select dates")
                                .setSelection(Pair.create(MaterialDatePicker.thisMonthInUtcMilliseconds(),
                                        MaterialDatePicker.todayInUtcMilliseconds()))
                                .build();

                dateRangePicker.show(getSupportFragmentManager(),"daterangepicker");
            }
        });

    }
}
