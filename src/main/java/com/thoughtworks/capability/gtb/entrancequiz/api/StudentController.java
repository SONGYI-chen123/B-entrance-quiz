package com.thoughtworks.capability.gtb.entrancequiz.api;

import com.thoughtworks.capability.gtb.entrancequiz.domain.GroupRequest;
import com.thoughtworks.capability.gtb.entrancequiz.domain.Student;
import com.thoughtworks.capability.gtb.entrancequiz.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
public class StudentController {
    // TODO GTB-知识点: - 推荐使用构造器注入
    @Autowired
    StudentService studentService;

    // TODO GTB-知识点: - 违反Restful实践, url不合理
    @GetMapping("/student")
    // TODO GTB-知识点: - 没有使用泛型
    public ResponseEntity showStudentDetail(){
        // TODO GTB-工程实践: - 无用的初始化值
        List<Student> students = new ArrayList<>();
        students = studentService.showStudentDetail();
        return ResponseEntity.ok(students);
    }

    @PostMapping("/groups")
    public ResponseEntity divideGroups(@RequestBody GroupRequest groupRequest){
        studentService.divideGroups(groupRequest);
        return ResponseEntity.ok(null);
    }
}
