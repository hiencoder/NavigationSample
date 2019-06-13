package com.example.hiennv.navigationsample.adapter;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.hiennv.navigationsample.R;
import com.example.hiennv.navigationsample.Rank;

import java.util.List;

import androidx.navigation.Navigation;

import butterknife.BindView;
import butterknife.ButterKnife;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.UserHolder> {
    private List<Rank> users;

    public UserAdapter(List<Rank> users) {
        this.users = users;
    }

    @NonNull
    @Override
    public UserHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_view_item, parent, false);
        return new UserHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UserHolder userHolder, int position) {
        Rank rank = users.get(position);
        userHolder.bindRank(rank);
        userHolder.itemView.setOnClickListener(v -> {
            Bundle bundle = new Bundle();
            bundle.putSerializable("key_name", rank);
            Navigation.findNavController(userHolder.itemView).navigate(R.id.action_user_profile, bundle);
        });
    }

    @Override
    public int getItemCount() {
        return users != null ? users.size() : 0;
    }

    public class UserHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.iv_avatar)
        ImageView ivAvatar;
        @BindView(R.id.tv_user_name)
        TextView tvUserName;
        @BindView(R.id.tv_user_points)
        TextView tvUserPoint;
        @BindView(R.id.tv_user_rank)
        TextView tvUserRank;

        public UserHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }

        public void bindRank(Rank rank) {
            ivAvatar.setImageResource(rank.getAvatar());
            tvUserName.setText(rank.getName());
            tvUserPoint.setText(rank.getPoint());
            tvUserRank.setText("#" + rank.getRank());
        }
    }
}
