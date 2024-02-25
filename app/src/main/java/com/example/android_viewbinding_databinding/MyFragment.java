package com.example.android_viewbinding_databinding;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.android_viewbinding_databinding.databinding.FragmentMyBinding;

public class MyFragment extends Fragment {

    private FragmentMyBinding mFragmentMyBinding ;

    @Nullable

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        // Cách 1: Giống như View Binding
//        mFragmentMyBinding = FragmentMyBinding.inflate(inflater, container, false);


        // Cách 2:
        mFragmentMyBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_my, container, false);
        MyFragmentViewModal myFragmentViewModal = new MyFragmentViewModal("Databinding in Fragment");
        mFragmentMyBinding.setMyFragmentViewModal(myFragmentViewModal);

        return mFragmentMyBinding.getRoot();
//        return super.onCreateView(inflater, container, savedInstanceState);
    }
}
