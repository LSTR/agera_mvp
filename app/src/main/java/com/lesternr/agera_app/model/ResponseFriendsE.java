package com.lesternr.agera_app.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by LSTR on 4/20/16.
 */
public class ResponseFriendsE {
    @SerializedName("results")
    ArrayList<FriendE> friends;

    public ArrayList<FriendE> getFriends() {
        return friends;
    }

    public void setFriends(ArrayList<FriendE> friends) {
        this.friends = friends;
    }
}