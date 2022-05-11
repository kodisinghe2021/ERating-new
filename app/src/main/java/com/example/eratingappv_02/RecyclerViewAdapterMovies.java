package com.example.eratingappv_02;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

public class RecyclerViewAdapterMovies extends RecyclerView.Adapter<RecyclerViewAdapterMovies.RVAHolder>{

    String s1[], s2[], image_main_url[],image_logo_url[];
    Context context;

    public RecyclerViewAdapterMovies(Context context, String[] s1, String[] s2, String image_main_url[], String image_logo_url[]) {
        this.s1 = s1;
        this.s2 = s2;
        this.context = context;
        this.image_main_url = image_main_url;
        this.image_logo_url = image_logo_url;
    }

    @NonNull
    @Override
    public RecyclerViewAdapterMovies.RVAHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.movies_single_card, parent, false);
        return new RecyclerViewAdapterMovies.RVAHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapterMovies.RVAHolder holder, int position) {
        holder.header.setText(s1[position]);
        holder.type.setText(s2[position]);
        holder.setLogoImageView(image_logo_url[position]);
        holder.setMainImageView(image_main_url[position]);
    }

    @Override
    public int getItemCount() {
        return s1.length;
    }

    public class RVAHolder extends RecyclerView.ViewHolder {
        TextView header, type;
        ImageView main, logo;
        public RVAHolder(@NonNull View itemView) {
            super(itemView);
            header = itemView.findViewById(R.id.movie_header_name);
            type = itemView.findViewById((R.id.type));
        }
        // method for load image from url

        public void setMainImageView(String url){
            main = itemView.findViewById(R.id.movie_main_image);
            Glide.with(context).load(url).into(main);
        }
        public void setLogoImageView(String url){
            logo = itemView.findViewById(R.id.movie_logo);
            Glide.with(context).load(url).into(logo);
        }

    }
}
