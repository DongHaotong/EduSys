package com.jubilantz.services.impl;


import com.jubilantz.entity.EasStudent;
import com.jubilantz.mappers.EasStudentMapper;
import com.jubilantz.services.EasStudentService;
import com.jubilantz.utils.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author JubilantZ
 * @Date: 2021/4/14 10:04
 */
@Service
public class EasStudentServiceImpl implements EasStudentService {
    @Autowired
    private EasStudentMapper easStudentMapper;

    @Override
    public List<EasStudent> getList(EasStudent easStudent) throws Exception {
        return easStudentMapper.getList(easStudent);
    }

    @Override
    public List<EasStudent> findList(EasStudent easStudent) throws Exception {
        return easStudentMapper.findList(easStudent);
    }

    @Override
    public List<EasStudent> findListByUsername(String username) throws Exception {
        return easStudentMapper.findListByUsername(username);
    }

    @Override
    public EasStudent getStudentByUsername(String username) throws Exception {
        return easStudentMapper.getStudentByUsername(username);
    }

    @Override
    public void updateStudent(EasStudent easStudent) throws Exception {
        easStudentMapper.updateStudent(easStudent);
    }

    @Override
    public int getCountBytIdandcId(Integer tId, Integer baseCourseId,Integer classId) throws Exception {
        return easStudentMapper.getCountBytIdandcId(tId,baseCourseId,classId);
    }

    @Override
    public int getEndingCountBytIdandcId(Integer tId, Integer baseCourseId, Integer classId) {
        return easStudentMapper.getEndingCountBytIdandcId(tId,baseCourseId,classId);
    }

    @Override
    public List<EasStudent> getStudentScoreListByTid(Integer tId, Integer baseCourseId, Integer classId, PageUtil pageUtil) {
        return easStudentMapper.getStudentScoreListByTid(tId,baseCourseId,classId,pageUtil);
    }

    @Override
    public List<EasStudent> getStudentSelectCourseListByTid(Integer tId, Integer baseCourseId, Integer classId, PageUtil pageUtil) {
        return easStudentMapper.getStudentSelectCourseListByTid(tId,baseCourseId,classId,pageUtil);
    }

    @Override
    public int getTotal() {
        return easStudentMapper.getTotal();
    }

    @Override
    public int getTotalSex(String sex) {
        return easStudentMapper.getTotalSex(sex);
    }

    @Override
    public void addUsername(String username) throws Exception{
        easStudentMapper.addUsername(username);
    }

    @Override
    public void deleteStudent(String username) throws Exception{
        easStudentMapper.deleteStudent(username);
    }


}
