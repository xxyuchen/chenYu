package com.nancy.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/12/22 0022.
 */
@RestController
public class DumplingContorller {
    @RequestMapping("/eat")
    @ResponseBody
    public String home(){
        return "冬至吃饺子！";
    }
}
