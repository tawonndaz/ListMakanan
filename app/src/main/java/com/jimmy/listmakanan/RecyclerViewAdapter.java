package com.jimmy.listmakanan;

import android.content.Context;
import android.content.Intent;
import android.icu.text.Transliterator;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private ArrayList<String> fotoMakanan = new ArrayList<>();
    private ArrayList<String> namaMakanan = new ArrayList<>();
    private ArrayList<String> infoMakanan = new ArrayList<>();
    private ArrayList<String> harga = new ArrayList<>();
    private Context context;

    public RecyclerViewAdapter(ArrayList<String> fotoMakanan, ArrayList<String> namaMakanan, ArrayList<String> infoMakanan, ArrayList<String> harga, Context context) {
        this.fotoMakanan = fotoMakanan;
        this.namaMakanan = namaMakanan;
        this.infoMakanan = infoMakanan;
        this.harga = harga;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.desain_layout_adapter, parent, false);
        ViewHolder holder = new ViewHolder(view);

        return holder;
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {

        Glide.with(context).asBitmap().load(fotoMakanan.get(position)).into(holder.imageViewFotoMakanan);

        holder.textViewNamaMakanan.setText(namaMakanan.get(position));

        holder.textView2harga.setText(harga.get(position));


        holder.constraintLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Toast.makeText(context, namaMakanan.get(position), Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(context, DetailActivity.class);

                intent.putExtra("foto makanan", fotoMakanan.get(position));
                intent.putExtra("nama makanan", namaMakanan.get(position));
                intent.putExtra("info makanan", infoMakanan.get(position));
                intent.putExtra("harga", harga.get(position));

                context.startActivity(intent);


            }
        });
    }

    @Override
    public int getItemCount() {
        return namaMakanan.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageViewFotoMakanan;
        TextView textViewNamaMakanan;
        TextView textView2harga;
        ConstraintLayout constraintLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageViewFotoMakanan = itemView.findViewById(R.id.imageViewFotoMakanan);
            textViewNamaMakanan = itemView.findViewById(R.id.textViewNamaMakanan);
            textView2harga = itemView.findViewById(R.id.textView2Harga);
            constraintLayout = itemView.findViewById(R.id.constraintLayout);
        }
    }
}
