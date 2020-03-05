package com.moqi.shop.springboot.dubbo.Controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.moqi.shop.service.IUseService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author moqi
 * @date 2020/3/4 11:25
 */
@RestController
@RequestMapping("/user")
public class UserController {
    //用到dubbo注入进来
    @Reference
    private IUseService iUseService;
    @RequestMapping("/sayHello")
    public String sayHello(String name) {
        return iUseService.sayHello(name);
    }
}
