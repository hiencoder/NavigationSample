package com.example.hiennv.navigationsample.ui.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;

import com.example.hiennv.navigationsample.R;

import androidx.navigation.Navigation;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnCheckedChanged;

public class FragmentInGame extends Fragment {
    @BindView(R.id.cb_answer1)
    CheckBox cnAnswer1;
    @BindView(R.id.cb_answer2)
    CheckBox cnAnswer2;
    @BindView(R.id.cb_answer3)
    CheckBox cnAnswer3;
    @BindView(R.id.cb_answer4)
    CheckBox cnAnswer4;
    View view;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_in_game, container, false);
        ButterKnife.bind(this, view);

        return view;
    }

    @OnCheckedChanged({R.id.cb_answer1,R.id.cb_answer2,R.id.cb_answer3,R.id.cb_answer4})
    void onCheckedChanged(CompoundButton button, boolean isChecked){
        switch (button.getId()){
            case R.id.cb_answer1:
                Navigation.findNavController(view).navigate(R.id.action_to_result_winner);
                break;
            case R.id.cb_answer2:
            case R.id.cb_answer3:
            case R.id.cb_answer4:
                Navigation.findNavController(view).navigate(R.id.action_to_game_over);
                break;
        }
    }
}
