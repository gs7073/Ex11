package com.example.ex11;
import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("UseSwitchCompatOrMaterialCode")
    Switch s1;
    RadioGroup rg1;
    Button btn1;
    ConstraintLayout lay1;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        s1 = findViewById(R.id.sw1);
        rg1 = findViewById(R.id.rg1);
        btn1 = findViewById(R.id.btn1);
        lay1 = findViewById(R.id.lay1);
    }

    public void doAuto(View v) {
        if (s1.isChecked()) {
            color();
        }
    }

    public void doManual(View v) {
        if (!s1.isChecked()) {
           color();
        }
    }

    public void color() {
        int pick = rg1.getCheckedRadioButtonId();
        if (pick == R.id.green) {
            lay1.setBackgroundColor(Color.GREEN);
        } else if (pick == R.id.yellow) {
            lay1.setBackgroundColor(Color.YELLOW);
        } else if (pick == R.id.red) {
            lay1.setBackgroundColor(Color.RED);
        } else if (pick == R.id.blue) {
            lay1.setBackgroundColor(Color.BLUE);
        }
    }
}
