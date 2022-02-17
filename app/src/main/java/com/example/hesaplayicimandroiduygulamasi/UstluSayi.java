package com.example.hesaplayicimandroiduygulamasi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class UstluSayi extends AppCompatActivity {
    EditText xsayisi;
    EditText ysayisi;
    Button btnust;
    TextView sonuc2;
    Button btndonus2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ustlu_sayi);
        xsayisi = findViewById(R.id.x_sayi);
        ysayisi = findViewById(R.id.y_sayi);
        sonuc2 = findViewById(R.id.sonuctxt2);
        al2();
        donme();
        tiklamadonme();
    }
    public void donme(){
        btndonus2 = findViewById(R.id.donus3);
    }
    public void gecisdonme(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void tiklamadonme(){
        btndonus2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gecisdonme();
            }
        });
    }
    public void al2(){
        btnust= findViewById(R.id.hesapla);
    }

    public void hesapla2(View v){
        int x2=Integer.parseInt(xsayisi.getText().toString());
        int y2 =Integer.parseInt(ysayisi.getText().toString());
        int carpim =1;
        for( int j= 1; j<=y2 ; j++){
            carpim = carpim * x2;
        }
        sonuc2.setText("Sonuc : " + carpim);
    }
}