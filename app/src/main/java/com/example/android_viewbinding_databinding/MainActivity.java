package com.example.android_viewbinding_databinding;

import androidx.fragment.app.FragmentTransaction;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.android_viewbinding_databinding.databinding.ActivityMainBinding;

/**
 Bài 3:View Binding in Adapter RecyclerView trong Android
 https://www.youtube.com/watch?v=Nv2rBNw8xdE&list=PL3Ob3F0T-08bzc9z1-bRif7w58C_J7pXJ&index=3

 Sẽ hướng dẫn ViewBinding từng ItemView bên trong 1 RecyclerView trong 1 Fragment trong 1 Activity
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