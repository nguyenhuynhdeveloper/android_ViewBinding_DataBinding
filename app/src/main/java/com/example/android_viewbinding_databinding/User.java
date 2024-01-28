package com.example.android_viewbinding_databinding;

// Tạo 1 đối tượng modal -- thể hiện đối tượng dữ liệu
public class User {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
