package com.example.toasterlibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.toasterlibrary.databinding.ActivityAddBinding;

public class AddActivity extends AppCompatActivity {
    static ActivityAddBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= ActivityAddBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        binding.btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e("getSum"," "+getAdd());
                ToasterMessage.callback(new SumCallBack() {
                    @Override
                    public int getSum() {
                        finish();
                        return getAdd();
                    }
                });


            }
        });
    }


    public int getAdd(){
         return Integer.parseInt(binding.et1.getText().toString())
                 +Integer.parseInt(binding.et2.getText().toString());

    }
}