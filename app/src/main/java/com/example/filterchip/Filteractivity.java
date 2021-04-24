package com.example.filterchip;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.RadioGroup;

import com.google.android.material.chip.Chip;

import java.util.ArrayList;

public class Filteractivity extends AppCompatActivity {

    private Chip chipWriting, chipWeb, chipMarketing, chipApp, chipGraphics, chipUI, chipeditor, chipwriter, chipphoto, chipanimate, chipvocal;
    private Chip chipHack, chipWorkshop, chipSeminars, chipshows, chipconferences, chipwebniars, chipmusic, chipsales;

    private Button btnApply;
    private ArrayList<String> selectedChipData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filteractivity);

        chipWriting = findViewById(R.id.chipWriting);
        chipWeb = findViewById(R.id.chipWeb);
        chipMarketing = findViewById(R.id.chipMarketing);
        chipApp = findViewById(R.id.chipApp);
        chipGraphics = findViewById(R.id.chipGraphics);
        chipUI = findViewById(R.id.chipUI);
        chipeditor = findViewById(R.id.chipeditor);
        chipwriter = findViewById(R.id.chipwriter);
        chipphoto = findViewById(R.id.chipphoto);
        chipanimate = findViewById(R.id.chipanimate);
        chipvocal = findViewById(R.id.chipvocal);

        chipHack = findViewById(R.id.chipHack);
        chipWorkshop = findViewById(R.id.chipWorkshop);
        chipSeminars = findViewById(R.id.chipSeminars);
        chipshows = findViewById(R.id.chipshows);
        chipconferences = findViewById(R.id.chipconferences);
        chipwebniars = findViewById(R.id.chipwebniars);
        chipmusic = findViewById(R.id.chipmusic);
        chipsales = findViewById(R.id.chipsales);


        selectedChipData = new ArrayList<>();

        CompoundButton.OnCheckedChangeListener checkedChangeListener = new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)

                {
                    selectedChipData.add(buttonView.getText().toString());
                }
                else
                {
                    selectedChipData.remove(buttonView.getText().toString());
                }
            }
        };
        chipWriting.setOnCheckedChangeListener(checkedChangeListener);
        chipWeb.setOnCheckedChangeListener(checkedChangeListener);
        chipMarketing.setOnCheckedChangeListener(checkedChangeListener);
        chipApp.setOnCheckedChangeListener(checkedChangeListener);
        chipGraphics.setOnCheckedChangeListener(checkedChangeListener);
        chipUI.setOnCheckedChangeListener(checkedChangeListener);
        chipeditor.setOnCheckedChangeListener(checkedChangeListener);
        chipwriter.setOnCheckedChangeListener(checkedChangeListener);
        chipphoto.setOnCheckedChangeListener(checkedChangeListener);
        chipanimate.setOnCheckedChangeListener(checkedChangeListener);
        chipvocal.setOnCheckedChangeListener(checkedChangeListener);

        chipHack.setOnCheckedChangeListener(checkedChangeListener);
        chipWorkshop.setOnCheckedChangeListener(checkedChangeListener);
        chipSeminars.setOnCheckedChangeListener(checkedChangeListener);
        chipshows.setOnCheckedChangeListener(checkedChangeListener);
        chipconferences.setOnCheckedChangeListener(checkedChangeListener);
        chipwebniars.setOnCheckedChangeListener(checkedChangeListener);
        chipmusic.setOnCheckedChangeListener(checkedChangeListener);
        chipsales.setOnCheckedChangeListener(checkedChangeListener);

        btnApply = findViewById(R.id.btnApply);
        btnApply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent resultIntent = new Intent();
                resultIntent.putExtra("data", selectedChipData.toString());
                setResult(101,resultIntent);
                finish();
            }
        });
    }
}
