package com.briup.shixun.web.controller;

import com.briup.shixun.bean.person;
import com.briup.shixun.util.Message;
import com.briup.shixun.util.MessageUtil;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class student {
    @PostMapping("/add")
    public Message add(person p){
        return MessageUtil.success("你真好看");

    }
}
