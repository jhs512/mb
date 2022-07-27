package com.ll.exam.lspring.controller;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.lang.reflect.Method;

@AllArgsConstructor
@ToString
public class RouteInfo {
    @Getter
    private Method method;
    @Getter
    private String path;
    @Getter
    private String actionPath;
}
