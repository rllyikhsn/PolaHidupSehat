package com.example.polahidupsehat;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class definisipolahidup extends AppCompatActivity implements View.OnClickListener{

    CardView definisi,gizi,pola;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_definisipolahidup);

        definisi = findViewById(R.id.df_definisi);
        gizi = findViewById(R.id.df_gizi);
        pola = findViewById(R.id.df_pola);
        definisi.setOnClickListener(this);
        gizi.setOnClickListener(this);
        pola.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.df_definisi:
                intent = new Intent(this, detail.class);
                intent.putExtra("status","definisi");
                startActivity(intent);
                break;
            case R.id.df_gizi:
                intent = new Intent(this, detail.class);
                intent.putExtra("status","gizi");
                startActivity(intent);
                break;
            case R.id.df_pola:
                intent = new Intent(this, detail.class);
                intent.putExtra("status","pola");
                startActivity(intent);
                break;
        }
    }
}
