package com.example.hafronkasrt.view.fagment.pengeluaran;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hafronkasrt.R;

public class PengeluaranFragment extends Fragment {

    private PengeluaranViewModel mViewModel;

    public static PengeluaranFragment newInstance() {
        return new PengeluaranFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_pengeluaran, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(PengeluaranViewModel.class);
        // TODO: Use the ViewModel
    }

}