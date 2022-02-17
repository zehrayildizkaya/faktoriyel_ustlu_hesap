package com.example.hesaplayicimandroiduygulamasi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class faktoriyel extends AppCompatActivity {
    EditText x_giris;
    Button btnfktr;
    TextView sonuc;
    Button btndonus1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faktoriyel);
        x_giris= findViewById(R.id.x_sayi);
        sonuc =findViewById(R.id.sonuctxt);
        al();
        donme2();
        tiklamadonme2();

    }
    public void al(){
        btnfktr = findViewById(R.id.hesapla);
    }
    public void donme2(){
        btndonus1 = findViewById(R.id.donus2);
    }
    public void gecisdonme2(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void tiklamadonme2(){
        btndonus1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gecisdonme2();
            }
        });
    }

    public void hesapla(View view){
        int xsayi =Integer.parseInt(x_giris.getText().toString());
        int sum =1;
        for( int i=1 ; i<=xsayi ; i++) {
            sum *= i;

        }
        sonuc.setText("Sonuc : " + sum);

    }
}