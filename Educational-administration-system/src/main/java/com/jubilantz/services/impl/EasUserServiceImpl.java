package com.jubilantz.services.impl;

import com.jubilantz.entity.EasUser;
import com.jubilantz.mappers.EasUserMapper;
import com.jubilantz.services.EasUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author JubilantZ
 * @Date: 2021/4/12 16:27
 */
@Service
public class EasUserServiceImpl implements EasUserService {

    @Autowired
    private EasUserMapper easUserMapper;

    @Override
    public void addUser(EasUser user) throws Exception{
        easUserMapper.add(user);
    }

    @Override
    public String findUsernameById(int userid) throws Exception {
        return easUserMapper.findUsernameById(userid);
    }

    @Override
    public void addUserRole(EasUser user, Integer[] ids) throws Exception{
        easUserMapper.addUserRole(user.getId(),ids);
    }

    @Override
    public void deleteUserRole(Integer id) throws Exception {
        easUserMapper.deleteUserRole(id);
    }

    @Override
    public void updateUser(EasUser user) throws Exception {
        easUserMapper.updateUser(user);
    }

    @Override
    public List<EasUser> findUserName(String username) throws Exception{
        return easUserMapper.findUserName(username);
    }

    @Override
    public Integer findRoleIdByUserId(Integer userid) throws Exception {
        String val=userid +"";
        if(!"".equals(val)){
            return easUserMapper.findRoleIdByUserId(userid);
        }else{
            return 1000;
        }

    }

    @Override
    public int getCount() {
        return easUserMapper.getCount();
    }

    @Override
    public List<Integer> findRoleIdByUserId2(Integer id) {
        return easUserMapper.findRoleIdByUserId2(id);
    }

    @Override
    public int getRoleCountByUid(Integer Uid) throws Exception {
        return easUserMapper.getRoleCountByUid(Uid);
    }


}
