package id.falasyam.nembak;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class StepDua extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.stepdua);

        FloatingActionButton fab = findViewById(R.id.stepdua);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(StepDua.this, StepTiga.class);
                startActivity(i);
                overridePendingTransition(R.anim.from_right, R.anim.anim_left);
                finish();
            }
        });

        FloatingActionButton faback = findViewById(R.id.back);
        faback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(StepDua.this, MainActivity.class);
                startActivity(i);
                overridePendingTransition(R.anim.from_left, R.anim.anim_right);
                finish();
            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.from_left, R.anim.anim_right);
    }
}
