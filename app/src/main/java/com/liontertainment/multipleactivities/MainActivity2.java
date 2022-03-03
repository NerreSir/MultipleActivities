package com.liontertainment.multipleactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity2 extends AppCompatActivity {

    TextView kullaniciadi2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        kullaniciadi2 = findViewById(R.id.textView2);

        Intent intentScreen1denVeriCeken = getIntent();
        String ilkekrandanalinanuserverisi= intentScreen1denVeriCeken.getStringExtra("userInput");
        kullaniciadi2.setText(ilkekrandanalinanuserverisi);
    }

    public void changeScreen (View view){
        Intent intentekrangecisi2 = new Intent(MainActivity2.this,MainActivity.class);
        startActivity(intentekrangecisi2);
    }
}