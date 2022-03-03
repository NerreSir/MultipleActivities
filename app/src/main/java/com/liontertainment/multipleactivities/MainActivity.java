package com.liontertainment.multipleactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    String kullaniciadi;
    EditText kullaniciaditext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        kullaniciadi = "";
        kullaniciaditext = findViewById(R.id.kullaniciadigirisi);
    }

    public void changeActivity (View view){

        kullaniciadi = kullaniciaditext.getText().toString();

        Intent intentekrangecisi = new Intent(MainActivity.this,MainActivity2.class);

        intentekrangecisi.putExtra("userInput",kullaniciadi);

        startActivity(intentekrangecisi);


    }
}