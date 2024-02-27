package com.example.android_viewbinding_databinding;

import android.util.Log;
import android.view.View;

public class MainViewModel {
    private String name;
    public MainViewModel(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



// Phải có 1 tham số là View là bắt buộc
    public void showLongMessage (View view) {
        Log.e("Tincoder", "TinCoder Android Java");
    }


    // Cách 2: Sử dụng Listener Binding
    public void showLongMessage2 (String name) {
        Log.e("Tincoder", name);
    }


    // Nếu cần sử lý gì liên quan tới View
    public void showLongMessage3 (View view, String name) {
        Log.e("Tincoder", name);
    }

    // Trường hợp cần truyền Object làm params

    public void showLongMessage4 (UserViewModal userViewModal) {
        Log.e("Tincoder", userViewModal.getName() + userViewModal.getAddress());
    }
}
