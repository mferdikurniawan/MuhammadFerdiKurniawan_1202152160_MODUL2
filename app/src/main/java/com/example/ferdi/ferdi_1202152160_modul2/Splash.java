package com.example.ferdi.ferdi_1202152160_modul2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Toast;

public class Splash extends Activity {

    // method ketika dijalankan saat activity dibuat
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Toast.makeText(this, "MUHAMMAD FERDI KURNIAWAN_1202152160", Toast.LENGTH_SHORT).show(); //akan menampilkan pesan RIZKY ALAMSYAH_1202154185
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {

            // method untuk mengarahkan ke aktivitas selanjutnya
            @Override
            public void run() {
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
                finish();
            }
        }, 5000L); //5000 L = 5 detik
    }
}
