package com.example.android_viewbinding_databinding.observable_dataBinding;

import android.database.Observable;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.databinding.ObservableField;

import com.example.android_viewbinding_databinding.BR;

public class Activity2ViewModal extends BaseObservable {
    private  String message ;

    public ObservableField<String> message2 = new ObservableField<>();

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

//        setMessage(" New Value Text when click ");
        message2.set("Second Message");

        // Không được
//        ObservableField<String> firstMessage2 =new ObservableField<>() ;  // Tạo ra 1 ObservableField
//        firstMessage2.set("First Message");   // Set giá trị cho  ObservableField đó
//        this.setMessage2(firstMessage2);
    }


    // Tạo getter and seter cho trường ObservableField
    public ObservableField<String> getMessage2() {
        return message2;
    }

    public void setMessage2(ObservableField<String> message2) {
        this.message2 = message2;
    }
}
