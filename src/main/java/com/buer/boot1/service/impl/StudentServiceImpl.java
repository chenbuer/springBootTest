package com.buer.boot1.service.impl;

import com.buer.boot1.dao.StudentsDao;
import com.buer.boot1.entity.Students;
import com.buer.boot1.service.StudentService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentsDao studentsDao;

    @Override
    public Page<Students> findByPage(int pageNo, int pageSize) {
        PageHelper.startPage(pageNo, pageSize);
        return studentsDao.findByPage();

    }

    @Override
    public void insertStudent(Students students) {
        studentsDao.insertStudent(students);
    }
}
