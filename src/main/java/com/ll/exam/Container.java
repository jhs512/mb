package com.ll.exam;

import lombok.Getter;

public class Container {
    @Getter
    private App app;

    public Container() {
        app = new App();
    }
}
