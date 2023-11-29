package org.example;

public class Main {
    static {
        System.setProperty("jna.library.path", "/root/rust_lib");
    }

    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int result = RustLib.INSTANCE.add(a, b);
        System.out.println("Result: " + result);
        RustLib.INSTANCE.foo();
    }
}