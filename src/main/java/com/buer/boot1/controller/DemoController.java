package com.buer.boot1.controller;

import com.buer.boot1.config.configProperties.Girl;
import com.buer.boot1.dao.StudentsDao;
import com.buer.boot1.entity.Students;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Autowired
    private Girl girl;

    @Autowired
    private StudentsDao studentsDao;

    @GetMapping("test")
    public String test1() {
        Students students=new Students();
        students.setAge(19);
        students.setName("testFromSpringBoot");
        studentsDao.insertStudent(students);
        return girl.getCupSize();
    }
}
