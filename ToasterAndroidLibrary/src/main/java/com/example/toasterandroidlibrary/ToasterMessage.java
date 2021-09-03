package com.example.toasterandroidlibrary;

import android.content.Context;
import android.widget.Toast;

public class ToasterMessage {


    public static void printMe(Context c, String message){

        Toast.makeText(c,"Zaid's library message="+message, Toast.LENGTH_SHORT).show();

    }
}
