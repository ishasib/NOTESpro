package com.example.notespro;

import android.content.Context;
import android.widget.Toast;

public class Utility {
    static void showToast(Context context, String messege){
        Toast.makeText(context,messege,Toast.LENGTH_SHORT).show();
    }
}
