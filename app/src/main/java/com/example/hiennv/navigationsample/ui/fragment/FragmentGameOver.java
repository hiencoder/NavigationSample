package com.example.hiennv.navigationsample.ui.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hiennv.navigationsample.R;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class FragmentGameOver extends Fragment {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_game_over, container, false);
        ButterKnife.bind(this, view);
        return view;
    }

    @OnClick(R.id.play_btn4)
    void doClick(View v) {
        switch (v.getId()) {
            case R.id.play_btn4:
                break;
        }
    }
}
