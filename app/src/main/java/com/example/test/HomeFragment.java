package com.example.test;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;


public class HomeFragment extends Fragment {

    public HomeFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.activity_kategoriler, container, false);
    }

    public void openAnotherActivity() {
        Intent intent = new Intent(getActivity(), HomeFragment.class);
        startActivity(intent);
    }
}
