package com.raza.muhammadrazasaeed.myfontsstunning;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.raza.fontstunning.FontStunning;

public class MainActivity extends AppCompatActivity {

    TextView robotoTxt, ostrichTxt, androidNationTxt, captureItTxt, caviarTxt, droidTxt, droidSerifTxt, freedomTxt,
            greenAvocadoTxt, proximaTxt, funTxt, recognitionTxt, tangerineTxt, walkwayTxt, windsongTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        robotoTxt=findViewById(R.id.robotoTxt);
        ostrichTxt=findViewById(R.id.ostrichTxt);
        androidNationTxt=findViewById(R.id.androidNationTxt);
        captureItTxt=findViewById(R.id.captureItTxt);
        caviarTxt=findViewById(R.id.caviarTxt);
        droidTxt=findViewById(R.id.droidTxt);
        droidSerifTxt=findViewById(R.id.droidSerifTxt);
        freedomTxt=findViewById(R.id.freedomTxt);
        greenAvocadoTxt=findViewById(R.id.greenAvocadoTxt);
        proximaTxt=findViewById(R.id.proximaTxt);
        funTxt=findViewById(R.id.funTxt);
        recognitionTxt=findViewById(R.id.recognitionTxt);
        tangerineTxt=findViewById(R.id.tangerineTxt);
        walkwayTxt=findViewById(R.id.walkwayTxt);
        windsongTxt=findViewById(R.id.windsongTxt);

        robotoTxt.setTypeface(FontStunning.robotoBlack(this));
        ostrichTxt.setTypeface(FontStunning.ostrichBlack(this));
        androidNationTxt.setTypeface(FontStunning.androidNation(this));
        captureItTxt.setTypeface(FontStunning.captureIt(this));
        caviarTxt.setTypeface(FontStunning.caviarDreams(this));
        droidTxt.setTypeface(FontStunning.droidRobot(this));
        droidSerifTxt.setTypeface(FontStunning.droidSerifRegular(this));
        freedomTxt.setTypeface(FontStunning.freedom(this));
        greenAvocadoTxt.setTypeface(FontStunning.greenAvocado(this));
        proximaTxt.setTypeface(FontStunning.proxima_nova_reg(this));
        funTxt.setTypeface(FontStunning.funRaiser(this));
        recognitionTxt.setTypeface(FontStunning.recognition(this));
        tangerineTxt.setTypeface(FontStunning.tangerineRegular(this));
        walkwayTxt.setTypeface(FontStunning.walkwayBlack(this));
        windsongTxt.setTypeface(FontStunning.windSong(this));

    }
}
