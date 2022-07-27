package com.ll.exam;

public class AppEnvContext {
    private static Container container;

    public static void init() {
        container = new Container();
    }

    public static void start() {
    }
}
