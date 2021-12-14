package com.example.toasterlibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.toasterlibrary.databinding.ActivityAddBinding;

public class AddActivity extends AppCompatActivity {
    ActivityAddBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= ActivityAddBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());




    }

//    public static void sum(){
//        binding.btnAdd.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                ToasterMessage.s(AddActivity.this,"Sum= "+sum);
//            }
//        });
//
//    }


    void getSum(SumCallBack sumCallBack){
        sumCallBack.getSum(Integer.parseInt(binding.et1.getText().toString())
                +Integer.parseInt(binding.et2.getText().toString()));
    }
}