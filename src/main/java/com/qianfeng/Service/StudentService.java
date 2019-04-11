package com.qianfeng.Service;

import com.qianfeng.Bean.TbStudent;
import com.qianfeng.Mapper.StudentMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StudentService {
    @Autowired
    private StudentMapper StudentMapper;
    public List<TbStudent> selectAllStu(){
        return StudentMapper.selectAllStu();
    }
    public void insertStu(TbStudent student){
        StudentMapper.insertStu(student);
    }
    public void deleteStu(Long stuId){
        StudentMapper.deleteStu(stuId);
    }
}
