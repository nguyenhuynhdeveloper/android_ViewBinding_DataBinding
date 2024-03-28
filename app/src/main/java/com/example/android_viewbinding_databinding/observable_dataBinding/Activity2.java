package com.example.android_viewbinding_databinding.observable_dataBinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.ObservableField;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;

import com.example.android_viewbinding_databinding.R;
import com.example.android_viewbinding_databinding.databinding.Activity2Binding;

/**
 Bài 12: Ràng buộc dữ liệu 2 chiều sử dụng phương pháp Observable fields
 Phương pháp có cách viết ngắn gọn hơn - tường minh và dễ sử lý thao tác hơn cách viết truyền thống


 */

public class Activity2 extends AppCompatActivity {
private Activity2Binding  activity2Binding;

private  Activity2ViewModal activity2ViewModal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        activity2Binding = Activity2Binding.inflate(getLayoutInflater());  // Tạo 1 ViewBinding

        activity2ViewModal = new Activity2ViewModal("Message of Activity2ViewModal");  // Tạo 1 ViewModal

        ObservableField<String> firstMessage2 =new ObservableField<>() ;  // Tạo ra 1 ObservableField
        firstMessage2.set("First Message");   // Set giá trị cho  ObservableField đó
        activity2ViewModal.setMessage2(firstMessage2);   // Set trường message2 cho ViewModal

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