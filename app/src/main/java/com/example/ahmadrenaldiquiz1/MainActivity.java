package com.example.ahmadrenaldiquiz1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;



public class MainActivity extends AppCompatActivity {
    EditText kodeBarangEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        kodeBarangEditText = findViewById(R.id.input_kode_barang);
    }

    public void onProcessButtonClick(View view) {

        String kodeBarang = kodeBarangEditText.getText().toString().trim();


        Intent intent = null;
        if (kodeBarang.equalsIgnoreCase("sgs")) {
            intent = new Intent(MainActivity.this, sgs.class);
        } else if (kodeBarang.equalsIgnoreCase("pco")) {
            intent = new Intent(MainActivity.this, pco.class);
        } else if (kodeBarang.equalsIgnoreCase("o17")) {
            intent = new Intent(MainActivity.this, o17.class);
        }

        if (intent != null) {
            intent.putExtra("KODE_BARANG", kodeBarang);
            startActivity(intent);
        } else {

        }
    }
}
