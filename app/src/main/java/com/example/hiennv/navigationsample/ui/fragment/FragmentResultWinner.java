package com.example.hiennv.navigationsample.ui.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.hiennv.navigationsample.R;

import androidx.navigation.Navigation;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class FragmentResultWinner extends Fragment {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    View view;
    @BindView(R.id.btn_next)
    Button btnNext;
    @BindView(R.id.btn_leader_board)
    Button btnLeaderBoard;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_result_winner, container, false);
        ButterKnife.bind(this, view);
        return view;
    }

    @OnClick({R.id.btn_next,R.id.btn_leader_board})
    void doClick(View v){
        switch (v.getId()){
            case R.id.btn_next:
                Navigation.findNavController(view).navigate(R.id.action_result_winner_match);
                break;
            case R.id.btn_leader_board:
                Navigation.findNavController(view).navigate(R.id.action_fragment_leader_board);
                break;
        }
    }
}
