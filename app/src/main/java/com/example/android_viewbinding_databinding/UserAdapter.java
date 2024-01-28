package com.example.android_viewbinding_databinding;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.android_viewbinding_databinding.databinding.ItemUserBinding;

import java.util.List;

public class UserAdapter extends  RecyclerView.Adapter<UserAdapter.UserViewHolder> {

    private List<User> mListUser;

    // Constructor của Adapter
    public UserAdapter(List<User> mListUser) {
        this.mListUser = mListUser;
    }

//    Tạo 1 onCreateViewHolder sẽ trả ra 1 UserViewHolder
    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // ItemUserBinding chính là cái được tạo ra của item_user nhờ vào ViewBinding
        ItemUserBinding itemUserBinding = ItemUserBinding.inflate(
                LayoutInflater.from(parent.getContext()),
                parent,
                false);
        return new UserViewHolder((itemUserBinding));
    }

    // Hàm mà binding dữ liệu lên View
    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {
    User user = mListUser.get(position);

    if(user == null) {
        return;
    }
    holder.itemUserBinding.titleNameUser.setText(user.getName());
    }

    // Hàm thể hiện Rcv có bao nhiêu phần tử
    @Override
    public int getItemCount() {
        if (mListUser != null) {
            return mListUser.size();
        }
        return 0;
    }

    // Thiết kế UserViewHolder - Chính là cái View mà chứa từng Item bên trong
    public class UserViewHolder extends RecyclerView.ViewHolder {

        private ItemUserBinding itemUserBinding;

        public UserViewHolder(@NonNull ItemUserBinding itemUserBinding) {
            super(itemUserBinding.getRoot());

            this.itemUserBinding = itemUserBinding;
        }
    }


}
