package com.jubilantz.services.impl;

import com.jubilantz.entity.EasCourse;
import com.jubilantz.entity.EasScore;
import com.jubilantz.mappers.EasCourseMapper;
import com.jubilantz.mappers.EasScoreMapper;
import com.jubilantz.services.EasScoreService;
import com.jubilantz.utils.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @Author JubilantZ
 * @Date: 2021/4/25 20:12
 */
@Service
public class EasScoreServiceImpl implements EasScoreService {
    @Autowired
    private EasScoreMapper easScoreMapper;
    @Autowired
    private EasCourseMapper easCourseMapper;

    @Override
    public int choiceCourse(EasScore easScore) {
        // 选课过程为一个事务
        EasCourse c = easCourseMapper.getCourseById(easScore.getcId());
        if (c.getStudentNum().equals(c.getChoiceNum())) {
            // 此课程学生人数已满，选课失败
            return 0;
        }
//        System.out.println(c.toString());

        // 对所选课程中，choiceNum（已选人数+1）
        c.setChoiceNum(c.getChoiceNum() + 1);
        easCourseMapper.updateCourseById(c);

        return easScoreMapper.insertSelective(easScore);
    }

    @Override
    public int deleteScore(EasScore easScore) {

        EasCourse c = easCourseMapper.getCourseById(easScore.getcId());
//        if(c.getChoiceNum() <= 1){
//            c.setChoiceNum(null);
//        }else if(c.getChoiceNum() > 1){
//            c.setChoiceNum(c.getChoiceNum() - 1);
//        }
        //此处存在 人数为1时 -1不能等于0的bug
        c.setChoiceNum(c.getChoiceNum() - 1);

        easCourseMapper.updateCourseById(c);

        return easScoreMapper.deleteScore(easScore);
    }

    @Override
    public int updateScore(EasScore easScore) throws Exception{

       try{
           int scoreId = easScore.getId();
           EasScore s = new EasScore();
           s = easScoreMapper.getcIdById(scoreId);
           int courseId = s.getcId();
           Integer complete =  easCourseMapper.findCompleteByCourseId(courseId);


//           System.out.println("我是成绩表id:"+scoreId);
//           System.out.println("我是课程id:"+courseId);
//           System.out.println("我是complete:"+complete);
           //课程结束 可以评分
           if(complete == 1){
               return easScoreMapper.updateScore(easScore);
           }else{
               return -1;
           }
       }catch (Exception e){
           e.printStackTrace();
           return -1;
       }


    }

    @Override
    public int updateScoreByScoreList(List<EasScore> scoreList) throws Exception {
        return easScoreMapper.updateScoreByScoreList(scoreList);
    }

    @Override
    public int getTotalItemsCount(int sId, Integer result) {
        return easScoreMapper.getTotalItemsCount(sId,result);
    }

    @Override
    public List<EasCourse> getCourseListBySid(int sId, Integer result, PageUtil pageUtil) {
        return easScoreMapper.getCourseListBySid(sId,result,pageUtil);
    }

    @Override
    public Date getStartDateByCourseId(Integer courseId) throws Exception {
        return easScoreMapper.getStartDateByCourseId(courseId);
    }
}
