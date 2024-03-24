package com.example.android_viewbinding_databinding.observable_dataBinding;

import android.database.Observable;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

import com.example.android_viewbinding_databinding.BR;

public class Activity2ViewModal extends BaseObservable {
    private  String message ;

    public Activity2ViewModal(String message) {
        this.message = message;
    }

    // Hàm get gía trị trong  View Modal
    @Bindable
    public String getMessage() {
        return message;
    }

    // Phần set giá trị thay đổi trong View Modal
    public void setMessage(String message) {
        this.message = message;
        notifyPropertyChanged(BR.message);
    }

    // Hàm sẽ chạy khi mà TextEdit được nhập text
    public void changeValueTextView() {
        setMessage(" New Value Text when click ");
    }
}
