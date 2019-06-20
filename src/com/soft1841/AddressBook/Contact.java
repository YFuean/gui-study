package com.soft1841.AddressBook;

public class Contact {
    private String name;
    private String address;
    private String phoneNumber;
    private String avatar;
    private String gender;
    private String dormID;

    public Contact() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDormID() {
        return dormID;
    }

    public void setDormID(String dormID) {
        this.dormID = dormID;
    }

    public Contact(String name, String address, String phoneNumber, String avatar, String gender, String dormID) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.avatar = avatar;
        this.gender = gender;
        this.dormID = dormID;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", avatar='" + avatar + '\'' +
                ", gender='" + gender + '\'' +
                ", dormID='" + dormID + '\'' +
                '}';
    }
}
