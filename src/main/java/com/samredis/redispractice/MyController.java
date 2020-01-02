package com.samredis.redispractice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

    @Autowired
    private StudentRepository studentRepository;
//    @Autowired
//    private GeneralRepository generalRepository;

    @GetMapping("/route1")
    @ResponseBody
    public void route1() {

        Student student = new Student(
                "kibi", "samim", Student.Gender.MALE, 1
        );

        studentRepository.save(student);

    }


    @GetMapping("/route2")
    @ResponseBody
    public void route2() {

        Student student = studentRepository.findOne("kiba");
        System.out.println(student.getName());
        // hgetall in redis-cli t get values
    }



    @GetMapping("/route3")
    @ResponseBody
    public void route3() {

//        Object ob = generalRepository.findOne("test");
//        System.out.println(ob.toString());
    }


}
