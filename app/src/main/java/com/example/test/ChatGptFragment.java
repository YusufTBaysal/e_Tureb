package com.example.test;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;

public class ChatGptFragment extends Fragment {

    public ChatGptFragment() {
        // Gerekli boş kurucu metod
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Fragment'ın görünümünü oluşturun
        return inflater.inflate(R.layout.activity_chatgpt, container, false);
    }

    public void openAnotherActivity() {
        Intent intent = new Intent(getActivity(), ChatGptFragment.class);
        startActivity(intent);
    }

}