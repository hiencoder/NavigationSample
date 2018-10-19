package com.example.hiennv.navigationsample.utils;

import android.content.Context;

import java.io.IOException;
import java.io.InputStream;

public class Common {
    public static String loadJsonFromAsset(Context context, String fileName) {
        try {
            String json = "";
            InputStream is = context.getAssets().open(fileName);
            int length = is.available();
            byte[] buffer = new byte[length];
            is.read(buffer);
            is.close();

            json = new String(buffer, "UTF-8");
            return json;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }

    }
}
