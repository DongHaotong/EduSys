package com.jubilantz.services.impl;

import com.jubilantz.mappers.EasRegisterMapper;
import com.jubilantz.services.EasRegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author JubilantZ
 * @Date: 2021/4/24 17:08
 */
@Service
public class EasRegisterServiceImpl implements EasRegisterService {
    @Autowired
    private EasRegisterMapper easRegisterMapper;
}
