package com.buer.boot1.service;

import com.buer.boot1.entity.Students;
import com.github.pagehelper.Page;

public interface StudentService {

    Page<Students> findByPage(int pageNo, int pageSize);

    void insertStudent(Students students);
}
