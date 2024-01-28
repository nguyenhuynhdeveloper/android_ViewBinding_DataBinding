package com.example.android_viewbinding_databinding;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.android_viewbinding_databinding.databinding.FragmentMyBinding;

import java.util.ArrayList;
import java.util.List;


public class MyFragment extends Fragment {




    public MyFragment() {

    }

// ánh xạ Text View bằng VienBinding trong Thằng MyFragment
    // View Fragment Cũng tạo ra 1 file Binding để có thể chấm tới View được

    FragmentMyBinding mFragmentMyBinding ;  // Để có thể đưa vào hàm onCreate để có thể sử dụng để tạo view và Binding

    // Các trường hợp phải sủ dụng View ở phạm vi khác
    private View mView;  // Có thể sử đụng ở đâu đó nếu cần thiết
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {



        mFragmentMyBinding =  FragmentMyBinding.inflate(inflater, container, false);
        // Inflate the layout for this fragment
        mView = mFragmentMyBinding.getRoot();

        // Từ đây có thể ảnh xạ tới 1 View và sử dụng bình thường
        mFragmentMyBinding.tvName.setText("Tin Coder ");
        // Phải return ra 1 cái View

        // Trong Fragment có 1 RecyclerView -- Đoạn khai báo tạo - gán data cho rcvView
        RecyclerView rcvUser = mFragmentMyBinding.rcvUser;

        LinearLayoutManager  linearLayoutManager = new LinearLayoutManager(mView.getContext()); // Tạo 1 LinearLayoutManager
        rcvUser.setLayoutManager(linearLayoutManager);

        // Tạo phân cách cho từng Item trong RecyclerView
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(mView.getContext(), DividerItemDecoration.VERTICAL);
        rcvUser.addItemDecoration(dividerItemDecoration);

        // Tạo 1 Adapter cho 1 RecyclerView
        UserAdapter userAdapter = new UserAdapter(getListUsers());
        rcvUser.setAdapter(userAdapter);
    return mView;
//        return mFragmentMyBinding.getRoot();
//        return inflater.inflate(R.layout.fragment_my, container, false);
    }

    private List<User> getListUsers() {
        List<User> list = new ArrayList<>();
        list.add(new User("User 1"));
        list.add(new User("User 2"));
        list.add(new User("User 3"));
        list.add(new User("User 4"));
        list.add(new User("User 5"));
        list.add(new User("User 6"));
        list.add(new User("User 7"));
        return list;
    }
}