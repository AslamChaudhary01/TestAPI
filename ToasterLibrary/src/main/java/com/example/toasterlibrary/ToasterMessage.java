package com.example.toasterlibrary;

import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class ToasterMessage {

    public static void s(Context c, String message){
        Toast.makeText(c,message,Toast.LENGTH_SHORT).show();

    }

    public static void start(Context c){
        c.startActivity(new Intent(c,AddActivity.class));
        AddActivity addActivity=new AddActivity();
        addActivity.getSum(new SumCallBack() {
            @Override
            public void getSum(int sum) {
               s(c,"Sum: "+sum);
            }
        });

    }
}
