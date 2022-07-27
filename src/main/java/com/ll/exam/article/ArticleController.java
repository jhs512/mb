package com.ll.exam.article;

import com.ll.exam.lspring.controller.annotation.Controller;
import com.ll.exam.lspring.controller.annotation.GetMapping;
import com.ll.exam.lspring.controller.annotation.PostMapping;

@Controller
public class ArticleController {
    @PostMapping("/usr/article/list/{code}")
    @GetMapping("/usr/article/list/{code}")
    public void showList() {

    }

    @PostMapping("/usr/article/detail/{code}/{id}")
    @GetMapping("/usr/article/detail/{code}/{id}")
    public void showDetail() {

    }
}
