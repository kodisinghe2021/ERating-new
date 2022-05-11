package com.example.eratingappv_02;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.eratingappv_02.databinding.FragmentNewsBinding;

public class NewsFragment extends Fragment {
    private String s1[], s2[], image_main_url[],image_logo_url[];
    // data binding
    private FragmentNewsBinding binding;
    private RecyclerView recyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentNewsBinding.inflate(inflater, container, false);
        View view = binding.getRoot();
//        s1 = getResources().getStringArray(R.array.games_names);
//        s2 = getResources().getStringArray(R.array.games_types);
//        image_main_url = getResources().getStringArray(R.array.image_main_url);
//        image_logo_url = getResources().getStringArray(R.array.image_logo_url);
//        recyclerView = view.findViewById(R.id.recycler_view);
//        RecyclerViewAdapterGames recyclerViewAdapterGames = new RecyclerViewAdapterGames(view.getContext(), s1, s2, image_main_url,image_logo_url);
//        recyclerView.setAdapter(recyclerViewAdapterGames);
//        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));


        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}