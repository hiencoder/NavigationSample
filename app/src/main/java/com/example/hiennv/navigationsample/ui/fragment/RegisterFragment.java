package com.example.hiennv.navigationsample.ui.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hiennv.navigationsample.R;

import androidx.navigation.Navigation;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class RegisterFragment extends Fragment {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    View view;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_register, container, false);
        ButterKnife.bind(this, view);

        return view;
    }

    @OnClick(R.id.btn_sign_up)
    void doClick(View view) {
        switch (view.getId()) {
            case R.id.btn_sign_up:
                Navigation.findNavController(view).navigate(R.id.action_fragment_match);
                break;
        }
    }
}
