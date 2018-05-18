package com.buer.boot1.controller;

import com.buer.boot1.config.configProperties.Girl;
import com.buer.boot1.dao.StudentsDao;
import com.buer.boot1.entity.Students;
import com.buer.boot1.service.StudentService;
import com.github.pagehelper.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Autowired
    private Girl girl;


    @Autowired
    private StudentService studentService;

    @GetMapping("test")
    public String test1() {
        Students students = new Students();
        for (int i = 0; i < 50; i++) {
            students.setAge(18 + i);
            students.setName("testFromSpringBoot:" + i);
            studentService.insertStudent(students);
        }
        return girl.getCupSize();
    }

    @GetMapping("findByPage")
    public Page<Students> findByPage() {
        int pageNo = 1;
        int pageSize = 10;
        return studentService.findByPage(pageNo, pageSize);
    }
}
