package com.norman.quickstart.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 通过@Value映射数据
 * 如何从。yml中读取数据1
 */
@Controller
public class Quick2Controller {

    @Value("${name}")
    private String name;

    @Value("${person.addr}")
    private String addr;

    @RequestMapping("/quick2")
    @ResponseBody
    public String quick2() {
        //获得配置文件的信息

        return "name:" + name + ",addr=" + addr;
    }

}
