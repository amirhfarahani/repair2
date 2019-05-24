package com.example.repair2;

import android.content.Context;
import android.content.SharedPreferences;

public class PrefConfig
{

    private SharedPreferences sharedPreferences ;
    private Context context ;

    public PrefConfig(Context context)
    {
        this.context=context;
        sharedPreferences=context.getSharedPreferences(context.getString(R.string.pref_file),Context.MODE_PRIVATE);
    }
    public void writeLoginStatus(boolean status){
    sharedPreferences.Editor editor=sharedPreferences.edit();
    ((SharedPreferences.Editor) editor).putBoolean(context.getString(R.string.pref_login_status),status);
        editor.commit();
    }



}
