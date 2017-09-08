package com.example.jnilibrary;

/**
 * Created by ShuWen on 2017/8/15.
 */

public class JniLib {
    static {
        System.loadLibrary("nativeUtil");
    }
    public native static String getStringFromC();

}
