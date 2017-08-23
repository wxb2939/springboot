package com.imooc.controller;

import com.imooc.properties.GirlProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by xuebing on 2017/8/22.
 */
@RestController
public class HelloController {

    @Autowired
    private GirlProperties girlProperties;


    @RequestMapping(value = {"/hello","/hi"},method = RequestMethod.GET)
    public String say() {
        return girlProperties.getCupSize();
    }


}
