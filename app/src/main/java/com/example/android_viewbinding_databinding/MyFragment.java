package com.example.android_viewbinding_databinding;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.android_viewbinding_databinding.databinding.FragmentMyBinding;


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

        // Từ đây có thể ảnh xạ tới 1 View và sử dụng bình thường
        mFragmentMyBinding.tvName.setText("Tin Coder ");
        // Phải return ra 1 cái View

        mView = mFragmentMyBinding.getRoot();
        return mView;
//        return mFragmentMyBinding.getRoot();
//        return inflater.inflate(R.layout.fragment_my, container, false);
    }
}