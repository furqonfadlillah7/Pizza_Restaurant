package com.example.pizzarestaurant;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class DetailMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_menu);
    }

    public void pindah(View view){
        Intent intent = new Intent(DetailMenuActivity.this, OrderActivity.class);
        startActivity(intent);
    }

    public void kembali(View view){
        Intent intent = new Intent(DetailMenuActivity.this, MenusActivity.class);
        startActivity(intent);
    }
}