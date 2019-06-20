package com.soft1841.spy;

public class Spy {
    //封装间谍的名字属性
    private String name;
    //封装间谍的头像属性
    private  String avatar;

    public Spy(String name, String avatar) {
        this.name = name;
        this.avatar = avatar;
    }

    public Spy() {
    }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getAvatar() { return avatar; }

    public void setAvatar(String avatar) { this.avatar = avatar; }

    @Override
    public String toString() {
        return "Spy{" +
                "name='" + name + '\'' +
                ", avatar='" + avatar + '\'' +
                '}';
    }
}
