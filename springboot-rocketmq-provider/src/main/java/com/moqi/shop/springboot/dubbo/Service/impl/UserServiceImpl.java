package com.moqi.shop.springboot.dubbo.Service.impl;

import com.moqi.shop.service.IUseService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @author moqi
 * @date 2020/3/3 13:20
 */
@Component
@com.alibaba.dubbo.config.annotation.Service(interfaceClass = IUseService.class)
public class UserServiceImpl implements IUseService {
    @Override
    public String sayHello(String name) {
        return "hello:" + name;
    }
}
