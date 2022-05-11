package com.example.eratingappv_02;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.eratingappv_02.databinding.FragmentMoviesBinding;

public class MoviesFragment extends Fragment {
    private String s1[], s2[], image_main_url[],image_logo_url[];
    // data binding
    private FragmentMoviesBinding binding;
    private RecyclerView recyclerView;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentMoviesBinding.inflate(inflater, container, false);
        View view = binding.getRoot();
        s1 = getResources().getStringArray(R.array.movies_names);
        s2 = getResources().getStringArray(R.array.movies_types);
        image_main_url = getResources().getStringArray(R.array.movies_image_main_url);
        image_logo_url = getResources().getStringArray(R.array.movies_image_logo_url);
        recyclerView = view.findViewById(R.id.movies_recycler_view);
        RecyclerViewAdapterMovies recyclersViewAdapterMovies = new RecyclerViewAdapterMovies(view.getContext(), s1, s2, image_main_url,image_logo_url);
        recyclerView.setAdapter(recyclersViewAdapterMovies);
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));
        // Inflate the layout for this fragment
        return view;
    }
}