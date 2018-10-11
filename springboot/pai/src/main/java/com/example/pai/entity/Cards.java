package com.example.pai.entity;

import lombok.Data;

@Data
public class Cards {
    private String avatar;
    private String nickName;
    private String time;
    private String title;
    private String info;
    private String logo;

    public Cards() {
    }

    public Cards(String avatar, String nickName, String time, String title, String info, String logo) {
        this.avatar = avatar;
        this.nickName = nickName;
        this.time = time;
        this.title = title;
        this.info = info;
        this.logo = logo;
    }
}
