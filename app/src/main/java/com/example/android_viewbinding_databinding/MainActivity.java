package com.example.android_viewbinding_databinding;

//import android.app.FragmentTransaction;
//import android.databinding.DataBindingUtil;
//import android.support.v4.app.FragmentTransaction;
//import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.android_viewbinding_databinding.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;

/**
  TinCoder #7 :Data Biding in Adapter RecyclerView with MVVM - [View Binding & Data Binding - #7]

 Hướng dẫn sử dụng DataBinding trong 1 RecyclerView


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

        // Tạo 1 đối tượng ViewBinding
        mActivityViewBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        // Tạo đối tượng MainViewModel
        MainViewModel  mainViewModel = new MainViewModel("TinCoder Android Java ");

        // Set View Model cho đối tượng DataBinding
        mActivityViewBinding.setMainViewModal(mainViewModel);



        View view = mActivityViewBinding.getRoot();
        setContentView(view);
//        openMyFragment();


        displayListUser();
//        setContentView(mActivityViewBinding.getRoot());

//        setContentView(R.layout.activity_main);
    }

    private void displayListUser() {
        // Ánh xạ View
        RecyclerView rcvUser = mActivityViewBinding.rcvUser;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        rcvUser.setLayoutManager(linearLayoutManager);

        DividerItemDecoration itemDecoration = new DividerItemDecoration(this, DividerItemDecoration.VERTICAL);
        rcvUser.addItemDecoration(itemDecoration);
        UserAdapter userAdapter = new UserAdapter(getListUser());
        rcvUser.setAdapter(userAdapter);
    }

    private List<UserViewModal> getListUser() {
        List<UserViewModal> list = new ArrayList<>();
        list.add(new UserViewModal( "User 1", "Tay Ho Ha noi"));
        list.add(new UserViewModal( "User 1", "Tay Ho Ha noi"));
        list.add(new UserViewModal( "User 1", "Tay Ho Ha noi"));
        list.add(new UserViewModal( "User 1", "Tay Ho Ha noi"));
        list.add(new UserViewModal( "User 1", "Tay Ho Ha noi"));
        return list;
    }

//    public  void openMyFragment () {
//        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
//        fragmentTransaction.replace(R.id.content_layout, new MyFragment());
//        fragmentTransaction.commitAllowingStateLoss();
//    }


}