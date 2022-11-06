package com.example.pizzarestaurant;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class OrderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
    }

    public void toast(View view) {
        Toast.makeText(this, "Terima kasih Asep sudah memesan ditoko kami, Metode pengiriman pesanan Pepperoni Pizza anda dikirim menggunakan ", Toast.LENGTH_SHORT).show();
    }
}