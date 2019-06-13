package com.example.hiennv.navigationsample.ui.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.hiennv.navigationsample.R;
import com.example.hiennv.navigationsample.Rank;

import butterknife.BindView;
import butterknife.ButterKnife;

public class UserProfileFragment extends Fragment {
    @BindView(R.id.tv_user_name)
    TextView tvName;
    @BindView(R.id.tv_rank)
    TextView tvRank;
    @BindView(R.id.tv_point)
    TextView tvPoint;

    private Rank rank;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_user_profile, container, false);
        ButterKnife.bind(this, view);
        rank = (Rank) getArguments().getSerializable("key_name");
        tvName.setText(rank.getName());
        tvRank.setText(rank.getRank());
        tvPoint.setText(rank.getPoint());
        return view;
    }

    //https://codelabs.developers.google.com/
}
