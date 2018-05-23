package com.sste9512.sste9512.snapchatclone.MainActivity.Models;

public class User {
    public String uid = "";
    public String email = "";
    public String firebaseToken = "";
    public String name = "";
    public String location = "";
    public String username = "";
    public String account_pic_url = "";



    public User() {
    }

    public User(String name, String  userName) {
        this.name = name;
        this.username = userName;

    }



    public User(String uid, String email, String firebaseToken, String user_name, String location) {
        this.uid = uid;
        this.email = email;
        this.firebaseToken = firebaseToken;
        this.username = user_name;
        this.location = location;

    }


    public User(String uid, String email, String firebaseToken, String user_name,String name, String location) {
        this.uid = uid;
        this.email = email;
        this.name = name;
        this.firebaseToken = firebaseToken;
        this.username = user_name;
        this.location = location;

    }


}
