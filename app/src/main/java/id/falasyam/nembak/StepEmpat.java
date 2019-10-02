package id.falasyam.nembak;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class StepEmpat extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.stepempat);

        FloatingActionButton fab = findViewById(R.id.stepempat);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(StepEmpat.this, StepLima.class);
                startActivity(i);
                finish();
            }
        });

        FloatingActionButton faback = findViewById(R.id.back);
        faback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(StepEmpat.this, StepTiga.class);
                startActivity(i);
                finish();
            }
        });
    }
}
