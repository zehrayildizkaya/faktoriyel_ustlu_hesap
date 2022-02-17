package com.example.hesaplayicimandroiduygulamasi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn1;
    Button btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        al3();
        tiklama3();
        al4();
        tiklama4();
    }
    public void al3(){
        btn1 = findViewById(R.id.faktgec);
    }
    public void gecisYap3(){
        Intent intent = new Intent(this, faktoriyel.class);
        startActivity(intent);
    }
    public void tiklama3(){
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gecisYap3();
                Toast.makeText(getApplicationContext(), "Faktöriyel sayfası", Toast.LENGTH_SHORT).show();
            }
        });
    }


    public void al4(){
        btn2 = findViewById(R.id.ustlu);
    }
    public void gecisYap4(){
        Intent intent = new Intent(this, UstluSayi.class);
        startActivity(intent);
    }
    public void tiklama4(){
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gecisYap4();
                Toast.makeText(getApplicationContext(), "Üstlü sayilar", Toast.LENGTH_SHORT).show();
            }
        });
    }
}