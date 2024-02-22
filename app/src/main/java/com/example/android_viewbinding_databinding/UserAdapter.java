package com.example.android_viewbinding_databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.example.android_viewbinding_databinding.databinding.ItemUserBinding;

import java.util.List;

public class UserAdapter extends  RecyclerView.Adapter<UserAdapter.UserViewHolder> {

    private final List<UserViewModal> mListUser;

    public UserAdapter(List<UserViewModal> mListUser) {
        this.mListUser = mListUser;
    }

    // Báo đỏ sẽ implement 3 method bắt buộc
    // Nơi tạo ra ViewHolder
    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        // cach 1

//        ItemUserBinding itemUserBinding = ItemUserBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);

        // Cach2
        ItemUserBinding itemUserBinding = DataBindingUtil.inflate(
                LayoutInflater.from(parent.getContext()),
                R.layout.item_user,
                parent,
                false);
        return new UserViewHolder((itemUserBinding));
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {
        UserViewModal userViewModal = mListUser.get(position);
        holder.itemUserBinding.setUserViewModal(userViewModal);
    }

    @Override
    public int getItemCount() {
        if(mListUser != null)
        {return mListUser.size();}
        return 0;
    }

    // Tạo 1 cái View Holder
    public static class UserViewHolder extends RecyclerView.ViewHolder{

        // Tạo đối tượng dataBinding
        private final ItemUserBinding itemUserBinding;

        public UserViewHolder(@NonNull ItemUserBinding itemUserBinding) {
            super(itemUserBinding.getRoot());

            this.itemUserBinding = itemUserBinding;
        }
    }
}
