package org.example;

import com.sun.jna.Library;
import com.sun.jna.Native;

public interface RustLib extends Library {

    RustLib INSTANCE = Native.load("fx_lic", RustLib.class);
    int add(int left, int right);

    void foo();
}
