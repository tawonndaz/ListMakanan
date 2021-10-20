package com.jimmy.listmakanan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {

    ImageView imageViewFotoMakanan;
    TextView textViewNamaMakanan, textViewInfoMakanan, textView2harga;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        imageViewFotoMakanan = findViewById(R.id.imageViewFotoMakanan);
        textViewNamaMakanan = findViewById(R.id.textViewNamaMakanan);
        textViewInfoMakanan = findViewById(R.id.textViewInfoMakanan);
        textView2harga = findViewById(R.id.textView2Harga);

        getIncomingExtra();
    }

    private void getIncomingExtra() {

        if(getIntent().hasExtra("foto makanan") && getIntent().hasExtra("nama makanan") && getIntent().hasExtra("info makanan") && getIntent().hasExtra("harga")) {

            String fotoMakanan = getIntent().getStringExtra("foto makanan");
            String namaMakanan = getIntent().getStringExtra("nama makanan");
            String infoMakanan = getIntent().getStringExtra("info makanan");
            String harga = getIntent().getStringExtra("harga");

            setDataActivity(fotoMakanan, namaMakanan, infoMakanan, harga);
        }

    }
    private void setDataActivity(String fotoMakanan, String namaMakanan, String infoMakanan, String harga) {

        Glide.with(this).asBitmap().load(fotoMakanan).into(imageViewFotoMakanan);
        textViewNamaMakanan.setText(namaMakanan);
        textViewInfoMakanan.setText(infoMakanan);
        textView2harga.setText(harga);
    }
}