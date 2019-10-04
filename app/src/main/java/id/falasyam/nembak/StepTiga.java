package id.falasyam.nembak;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class StepTiga extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.steptiga);

        FloatingActionButton fab = findViewById(R.id.steptiga);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(StepTiga.this, StepEmpat.class);
                startActivity(i);
                overridePendingTransition(R.anim.from_right, R.anim.anim_left);
                finish();
            }
        });

        FloatingActionButton faback = findViewById(R.id.back);
        faback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(StepTiga.this, StepDua.class);
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
