package com.example.smarthome;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.TextView;

public class LampActivity extends AppCompatActivity {
    private SeekBar  seekBar;
    private TextView tv_value;
    private ImageView img_lamp;
    private Switch aSwitch_lamp;
    private int save_value;
    private Bundle outState;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_lamp);
        InitWidget();

        //event
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                if(i == 0){
                    aSwitch_lamp.setChecked(false);
                    img_lamp.setImageResource(R.drawable.lamp_off);
                }
                else{
                    aSwitch_lamp.setChecked(true);
                    img_lamp.setImageResource(R.drawable.lamp_on);
                }
                tv_value.setText("" + i + "%");
                save_value = i;

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }

    private void InitWidget() {
        seekBar = findViewById(R.id.seekBar_Light);
        tv_value = findViewById(R.id.tv_value_seekbar);
        img_lamp = findViewById(R.id.img_lamp);
        aSwitch_lamp = findViewById(R.id.switch_lamp);
    }
}