package com.example.hiennv.navigationsample;

import java.io.Serializable;

public class Rank implements Serializable {
    private int avatar;
    private String name;
    private String point;
    private String rank;

    public Rank(int avatar, String name, String point, String rank) {
        this.avatar = avatar;
        this.name = name;
        this.point = point;
        this.rank = rank;
    }

    public Rank() {
    }

    public int getAvatar() {
        return avatar;
    }

    public String getName() {
        return name;
    }

    public String getPoint() {
        return point;
    }

    public String getRank() {
        return rank;
    }
}
