package com.qianfeng.Mapper;

import com.qianfeng.Bean.TbStudent;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface StudentMapper {
    List<TbStudent> selectAllStu();
    void insertStu(@Param("student") TbStudent student);
    void deleteStu(@Param("stuId") Long stuId);
}
