package com.example.hiennv.navigationsample.ui.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hiennv.navigationsample.R;
import com.example.hiennv.navigationsample.Rank;
import com.example.hiennv.navigationsample.adapter.UserAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class LeaderBoardFragment extends Fragment{
    @BindView(R.id.rv_leader_board)
    RecyclerView rvLeaderBoard;
    private UserAdapter userAdapter;
    private List<Rank> users;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_leader_board,container,false);
        ButterKnife.bind(this,view);
        users = new ArrayList<>();
        users.add(new Rank(R.drawable.avatar_1_raster,"Mr.A","1000pts","1"));
        users.add(new Rank(R.drawable.avatar_2_raster,"Mr.B","900pts","2"));
        users.add(new Rank(R.drawable.avatar_3_raster,"Mr.C","850pts","3"));
        users.add(new Rank(R.drawable.avatar_4_raster,"Mr.D","800pts","4"));
        userAdapter = new UserAdapter(users);
        rvLeaderBoard.setAdapter(userAdapter);

        return view;
    }
}
