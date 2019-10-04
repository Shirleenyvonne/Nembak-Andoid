package id.falasyam.nembak;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class StepLima extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.steplima);

        FloatingActionButton faby = findViewById(R.id.btny);
        faby.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(StepLima.this, Terakhir.class);
                startActivity(i);
                overridePendingTransition(R.anim.from_right, R.anim.anim_left);
                finish();
            }
        });

        FloatingActionButton fabg = findViewById(R.id.btng);
        fabg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nextdialog();
            }
        });
    }

    private void nextdialog(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(false);
        builder.setMessage("Apakah kamu sudah yakin dengan jawabanmu?");
        builder.setNegativeButton("Ya", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                finish();
                overridePendingTransition(R.anim.from_left, R.anim.anim_right);
            }
        });
        builder.setPositiveButton("Tidak", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });

        AlertDialog alert = builder.create();
        alert.show();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.from_left, R.anim.anim_right);
    }
}
