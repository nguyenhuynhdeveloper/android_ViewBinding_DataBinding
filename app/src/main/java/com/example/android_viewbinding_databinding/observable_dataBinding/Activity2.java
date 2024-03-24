package com.example.android_viewbinding_databinding.observable_dataBinding;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;

import com.example.android_viewbinding_databinding.R;
import com.example.android_viewbinding_databinding.databinding.Activity2Binding;

/**
 Bài 10:  Ràng buộc dữ liệu 1 chiều (One-way Data Binding) - [View Binding & Data Binding - #10]

 thay đổi logic khiên giá trị thay đổi . lập tức thay đổi hiển thị trên view

 Ràng buộc 1 chiểu là khi ấn vào nút nhấn thì giá trị TextView thay đổi



 Bài 11 : Ràng buộc dữ liệu 2 chiều (Two-way Data Binding) - [View Binding & Data Binding - #11]
 Ràng buộc 2 chiều  là : Thay đổi EditText -- giá trị của TextView thay đổi luôn
 chỉ đơn giản là thêm phần @={} vào trong phần xml

 */

public class Activity2 extends AppCompatActivity {
private Activity2Binding  activity2Binding;

private  Activity2ViewModal activity2ViewModal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        activity2Binding = Activity2Binding.inflate(getLayoutInflater());  // Tạo 1 ViewBinding

        activity2ViewModal = new Activity2ViewModal("Message of Activity2ViewModal");  // Tạo 1 ViewModal
        activity2Binding.setActivity2ViewModal(activity2ViewModal);   // Gán ViewModal vào trong  ViewBinding

        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_2);
        setContentView((activity2Binding.getRoot()));

        // Gán hàm khi thay đổi nhập Text trên TextEdit
        activity2Binding.editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });
    }





}