package mx.edu.tesoem.isc.cesar.proyecto1njrc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Frm_MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frm__main);
    }

    public void pantalla3(View v) {
        Intent frm2 = new Intent(this, Frm2_MainActivity.class);
        startActivity(frm2);
        finish();
    }

    public void pantalla4(View v) {
        Intent frm3 = new Intent(this, Frm3_MainActivity.class);
        startActivity(frm3);
        finish();
    }

    public void pantalla5(View v) {
        Intent frm4 = new Intent(this, Frm4_MainActivity.class);
        startActivity(frm4);
        finish();
    }

    public void pantalla6(View v) {
        Intent frm5 = new Intent(this, Frm5_MainActivity.class);
        startActivity(frm5);
        finish();
    }

    public void pantalla7(View v) {
        Intent frm6 = new Intent(this, Frm6_MainActivity.class);
        startActivity(frm6);
        finish();
    }
}

