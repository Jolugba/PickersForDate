package com.tinuade.pickersfordate;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

/**
 * This activity shows a button to trigger the date picker.
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /**
     * Handles the button click to create a new date picker fragment and
     * show it.
     *
     * @param view View that was clicked
     */

    public void showDatePicker(View view) {
        DialogFragment newFragment= new DatePickerFragment();
        newFragment.show(getSupportFragmentManager(),"datePicker");
    }
    /**
     * Process the date picker result into strings that can be displayed in
     * a Toast.
     *
     * @param Year Chosen year
     * @param Month Chosen month
     * @param Day Chosen day
     */
    public void processDatePickerResult(int Year,int Month,int Day){
        String string_month=Integer.toString(Month+1);
        String day_string=Integer.toString(Day);
        String year_string=Integer.toString(Year);
        String dateMessage=(string_month +"/"+day_string +"/"+year_string);

        Toast.makeText(this, "Date: " + dateMessage,
                Toast.LENGTH_SHORT).show();
    }
}
