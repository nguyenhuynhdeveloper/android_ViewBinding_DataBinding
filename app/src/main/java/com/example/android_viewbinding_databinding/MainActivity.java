package com.example.android_viewbinding_databinding;

import android.databinding.DataBindingUtil;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.android_viewbinding_databinding.databinding.ActivityMainBinding;

/**
 Bài 5: TinCoder : Khái quát về Data Binding Library trong Android - [View Binding & Data Binding - #5]
 https://www.youtube.com/watch?v=hatCiXlL5og&list=PL3Ob3F0T-08bzc9z1-bRif7w58C_J7pXJ&index=5
 Hướng dẫn sử dụng DataBinding trong 1 activity

 cho phép : Ánh xạ View + đưa data vào View
 Đưa Data vào view thông qua khai báo chứ không phải chạy chương trình


 */
public class MainActivity extends AppCompatActivity {


    private ActivityMainBinding mActivityViewBinding ;   //  Tên Class Trùng với bên của XML+ Binding
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        // Tạo ra đối tượng DataBinding
        // Cách 1: Giống y như ViewBinding
//        mActivityViewBinding= ActivityMainBinding.inflate((getLayoutInflater()));

        // Cách 2: Sử dụng DataBindingUtil
        mActivityViewBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        View view = mActivityViewBinding.getRoot();


        // Tạo đối tượng MainViewModel
        MainViewModel  mainViewModel = new MainViewModel("TinCoder Android Java ");
        mActivityViewBinding.setMainViewModal(mainViewModel);   // Set View Model cho đối tượng DataBinding


        setContentView(view);

//        setContentView(mActivityViewBinding.getRoot());

//        setContentView(R.layout.activity_main);

    }


}