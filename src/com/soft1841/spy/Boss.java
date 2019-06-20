package com.soft1841.spy;

public class Boss {
    private String bossName;
    private String singer;
    private String bossUrl;
    private String logo;
    private String time;

    public Boss(String bossName, String singer, String bossUrl, String logo, String time) {
        this.bossName = bossName;
        this.singer = singer;
        this.bossUrl = bossUrl;
        this.logo = logo;
        this.time = time;
    }

    public Boss() {
    }

    public String getBossName() {
        return bossName;
    }

    public void setBossName(String bossName) {
        this.bossName = bossName;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getBossUrl() {
        return bossUrl;
    }

    public void setBossUrl(String bossUrl) {
        this.bossUrl = bossUrl;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Boss{" +
                "bossName='" + bossName + '\'' +
                ", singer='" + singer + '\'' +
                ", bossUrl='" + bossUrl + '\'' +
                ", logo='" + logo + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
}
