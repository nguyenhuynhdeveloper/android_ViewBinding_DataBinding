package com.example.android_viewbinding_databinding;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.android_viewbinding_databinding.databinding.ActivityMainBinding;

/**
 Bài 2:ViewBinding in Fragment trong android #2
 https://www.youtube.com/watch?v=QcliXVGFRdw&list=PL3Ob3F0T-08bzc9z1-bRif7w58C_J7pXJ&index=2&t=1s
 Hướng dẫn ViewBinding ở trong 1 Fragment trong 1 activity
 */
public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding mActivityViewBinding ;   //  Tên Class Trùng với bên của XML+ Binding
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mActivityViewBinding= ActivityMainBinding.inflate((getLayoutInflater()));
        View view = mActivityViewBinding.getRoot();
        setContentView(view);
//        setContentView(mActivityViewBinding.getRoot());

//        setContentView(R.layout.activity_main);
        mActivityViewBinding.btnClick.setOnClickListener(mView -> openMyFragment());
    }

    private void openMyFragment() {
        MyFragment myFragment= new MyFragment();
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.content_layout , myFragment);
        transaction.commitAllowingStateLoss();

    }
}