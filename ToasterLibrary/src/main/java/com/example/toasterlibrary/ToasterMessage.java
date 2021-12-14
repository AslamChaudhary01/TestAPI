package com.example.toasterlibrary;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class ToasterMessage {
    private static Context context;
    static String mainTitle;

    public static void s(Context c, String message){
        Toast.makeText(c,message,Toast.LENGTH_SHORT).show();
    }
    public static void start(Context c,String message){
        c.startActivity(new Intent(c,AddActivity.class));
        context=c;
        mainTitle=message;
    }
    public static void callback(SumCallBack sumCallBack){
        Toast.makeText(context, mainTitle+" "+sumCallBack.getSum(), Toast.LENGTH_SHORT).show();
    }


 }
