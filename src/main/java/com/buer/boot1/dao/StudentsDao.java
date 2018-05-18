package com.buer.boot1.dao;


import com.buer.boot1.entity.Students;
import com.github.pagehelper.Page;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StudentsDao {
    int insertStudent(Students student);

    Page<Students> findByPage();
}
