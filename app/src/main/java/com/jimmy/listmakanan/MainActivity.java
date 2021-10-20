package com.jimmy.listmakanan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> fotoMakanan = new ArrayList<>();
    private ArrayList<String> namaMakanan = new ArrayList<>();
    private ArrayList<String> infoMakanan = new ArrayList<>();
    private ArrayList<String> harga = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getDataFromInternet();
    }

    private void prosesRecycleViewAdapter(){
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(fotoMakanan, namaMakanan, infoMakanan,harga,  this);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }

    private void getDataFromInternet() {

        namaMakanan.add("Mie kocok bandung");
        fotoMakanan.add("https://makananoleholeh.com/wp-content/uploads/2018/10/Mie-kocok-bandung.jpg");
        infoMakanan.add("Makanan pertama yang menjadi salah satu makanan khas dari negara ini adalah mie kocok bandung. Mie kocok merupakan makanan khas dari kota bandung yang memiliki rasa segar, gurih, dan juga nikmat. Salah satu mangkuk mie kocok anda akan menemukan beberapa bahan makanan seperti mie gepeng, sayur tauge, dan juga potongan kikil. ");
        harga.add("Rp 15.000");

        namaMakanan.add("Ayam betutu Bali");
        fotoMakanan.add("https://makananoleholeh.com/wp-content/uploads/2018/10/ayam-betutu-bali.jpg");
        infoMakanan.add("Cara masak ayam ini sangat unik sehingga menjadikan rasanya terasa berbeda dengan makanan dengan bahan ayam lainnya. Cara memasak ayam betutu ini adalah dengan ayam utuh yang di beri bumbu special kemudian dibakar.");
        harga.add("Rp 25.000");

        namaMakanan.add("Papeda irian jaya");
        fotoMakanan.add("https://makananoleholeh.com/wp-content/uploads/2018/10/Papeda-irian-jaya.jpg");
        infoMakanan.add("Makanan ini begitu unik karena memiliki tekstur seperti lem yang lengket. Bahan utama dari papeda adalah sagu yang dimasak dengan air. Meskipun tawar namun papeda akan terasa sangat nikmat apabila dinikmati dengan sayur atau pelengkap seperti ikan bumbu kuning, sambal, gulai dan yang lainnya.");
        harga.add("Rp 7.000");

        namaMakanan.add("Rendang padang");
        fotoMakanan.add("https://makananoleholeh.com/wp-content/uploads/2018/10/Rendang-padang.jpg");
        infoMakanan.add("Rendang merupakan makanan khas dari padang yang memiliki rasa begitu menggugah selera. Rendah menjadi salah satu makanan paling enak didunia karena memang rasanya begitu meninggalkan bekas di lidah dan dihati. Bahan yang digunakan untuk membuat makanan ini adalah daging sapi yang dimasak lama dengan bumbu rempah yang kaya.");
        harga.add("Rp 20.000");

        namaMakanan.add("Tinutuan Manado");
        fotoMakanan.add("https://makananoleholeh.com/wp-content/uploads/2018/10/Tinutuan-Manado.jpg");
        infoMakanan.add("Bahan dasar yang digunakan untuk membuat makanan ini adalah singkong atau bahkan ubi jalar yang dihaluskan. Bahan tersebut dicampur dengan jagung muda, ikan, sayuran dan juga bumbu khas dari Sulawesi utara.");
        harga.add("Rp 5.000");

        prosesRecycleViewAdapter();

    }

}