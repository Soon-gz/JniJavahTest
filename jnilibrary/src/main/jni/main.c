//
// Created by Administrator on 2017/8/15.
//

#include "com_example_jnilibrary_JniLib.h"

JNIEXPORT jstring JNICALL Java_com_example_jnilibrary_JniLib_getStringFromC
  (JNIEnv *env, jclass jclz){
    return (*env)->NewStringUTF(env,"String from JNI ");
  }

int add(int a,int b){
    return a+b;
}