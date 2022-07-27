package com.ll.exam.lspring.controller;

import com.ll.exam.Util;
import com.ll.exam.lspring.controller.annotation.Controller;
import com.ll.exam.lspring.controller.annotation.GetMapping;
import com.ll.exam.lspring.controller.annotation.PostMapping;
import org.reflections.Reflections;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class ControllerManager {
    private Map<String, RouteInfo> routeInfos;

    ControllerManager() {
        routeInfos = new HashMap<>();
        collectRouteInfosByAnnotations();
    }

    private void collectRouteInfosByAnnotations() {
        Reflections ref = new Reflections("com.ll.exam");
        for (Class<?> cl : ref.getTypesAnnotatedWith(Controller.class)) {
            Method[] methods = cl.getDeclaredMethods();

            for (Method method : methods) {
                GetMapping getMapping = method.getAnnotation(GetMapping.class);
                PostMapping postMapping = method.getAnnotation(PostMapping.class);

                if (getMapping != null) {
                    String path = getMapping.value();

                    String actionPath = Util.str.beforeFrom(path, "/", 4);

                    String key = "GET___" + actionPath;

                    routeInfos.put(key, new RouteInfo(method, path, actionPath));
                }

                if (postMapping != null) {
                    String path = postMapping.value();
                }
            }
        }

        System.out.println(routeInfos);
    }
}
