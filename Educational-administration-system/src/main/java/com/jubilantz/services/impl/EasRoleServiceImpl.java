package com.jubilantz.services.impl;

import com.jubilantz.entity.EasRole;
import com.jubilantz.mappers.EasRoleMapper;
import com.jubilantz.services.EasRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.management.relation.Role;
import java.util.List;

/**
 * @Author JubilantZ
 * @Date: 2021/4/13 17:07
 */
@Service
public class EasRoleServiceImpl implements EasRoleService {
    @Autowired
    private EasRoleMapper easRoleMapper;

    @Override
    public List<EasRole> getAll() {
       return easRoleMapper.getAll();
    }

    @Override
    public String findRoleNameByRoleId(Integer roleid) throws Exception {
        return easRoleMapper.findRoleNameByRoleId(roleid);
    }
}
