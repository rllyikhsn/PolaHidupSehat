package com.example.polahidupsehat;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    CardView definisi, olahraga, berfikir;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        definisi = findViewById(R.id.definisi);
        olahraga = findViewById(R.id.olahraga);
        berfikir = findViewById(R.id.berfikir);
        definisi.setOnClickListener(this);
        olahraga.setOnClickListener(this);
        berfikir.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.definisi:
                intent = new Intent(this, definisipolahidup.class);
                startActivity(intent);
                break;
            case R.id.olahraga:
                intent = new Intent(this, detail.class);
                intent.putExtra("status","olahraga");
                startActivity(intent);
                break;
            case R.id.berfikir:
                intent = new Intent(this, detail.class);
                intent.putExtra("status","berfikir");
                startActivity(intent);
                break;
        }

    }
}
