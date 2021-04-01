package com.codename1.androidnativetest1;

public class ActivityInfoNativeImpl {
    public String getInfo() {
        return com.codename1.impl.android.AndroidNativeUtil.getActivity().getName();
    }

    public boolean isSupported() {
        return true;
    }

}
