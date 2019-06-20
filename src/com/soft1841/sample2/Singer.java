package com.soft1841.sample2;

public class Singer {
    //封装歌手的名字属性
    private String name;
    //封装歌手的头像属性
    private  String avatar;

    public Singer(String name, String avatar) {
        this.name = name;
        this.avatar = avatar;
    }

    public Singer() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    @Override
    public String toString() {
        return "Singer{" +
                "name='" + name + '\'' +
                ", avatar='" + avatar + '\'' +
                '}';
    }
}
