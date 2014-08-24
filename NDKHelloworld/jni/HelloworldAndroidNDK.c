#include <string.h>
#include <jni.h>

jstring Java_com_example_helloworldandroidndk_MainActivity_stringTestNdk(
		JNIEnv* env, jobject thiz) {
	return (*env)->NewStringUTF(env, "Hello from JNI!");
}
