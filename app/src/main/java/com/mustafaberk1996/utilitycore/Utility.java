package com.mustafaberk1996.utilitycore;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import android.widget.EditText;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Utility {

    private static String TAG = Utility.class.getSimpleName();

    private Context context;

    public Utility(Context context) {
        this.context = context;
    }


    public String getText(EditText editText) {
        if (editText != null) {
            return editText.getText().toString().trim();
        } else throw new NullPointerException();

    }

    public boolean isEmpty(EditText editText) {
        if (editText != null) {
            return getText(editText).isEmpty();
        } else throw new NullPointerException();
    }


    public static int getPercent(int maxVal, int percent) {
        return (percent * maxVal) / 100;
    }

    private void seperateWords(String text, int letterCount) {
        int bolum = text.length() / letterCount;
        List<String> list = new ArrayList<>();

        for (int i = 0; i < bolum; i++) {
            StringBuilder stringBuilder = new StringBuilder(text);
            int startIndex = i * letterCount;
            int endIndex = startIndex + letterCount;
            String txt = text.substring(startIndex, endIndex);
            Log.d(TAG, "seperateWords: " + txt);
            list.add(txt);
        }
    }
}








