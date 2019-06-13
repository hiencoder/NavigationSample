package com.example.hiennv.navigationsample.ui.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.hiennv.navigationsample.R;

import androidx.navigation.Navigation;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class TitleScreenFragment extends Fragment {
    @BindView(R.id.btn_play)
    Button btnPlay;
    @BindView(R.id.btn_leader_board)
    TextView btnLeaderBoard;
    View view;
    public TitleScreenFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view =  inflater.inflate(R.layout.fragment_title_screen, container, false);
        ButterKnife.bind(this,view);
        return view;
    }

    @OnClick({R.id.btn_play,R.id.btn_leader_board})
    void doClick(View v){
        switch (v.getId()){
            case R.id.btn_play:
                Navigation.findNavController(view).navigate(R.id.action_register);
                break;
            case R.id.btn_leader_board:
                Navigation.findNavController(view).navigate(R.id.action_fragment_leader_board);
                break;
        }
    }
}
