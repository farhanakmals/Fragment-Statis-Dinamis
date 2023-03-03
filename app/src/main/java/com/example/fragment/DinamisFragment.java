package com.example.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link DinamisFragment} factory method to
 * create an instance of this fragment.
 */
public class DinamisFragment extends Fragment {

    public DinamisFragment() {
        // Required empty public constructor
    }

    public static DinamisFragment newInstance() {
        return new DinamisFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_dinamis, container, false);
    }
}