package com.thoughtworks.capability.gtb.entrancequiz.service;

import com.thoughtworks.capability.gtb.entrancequiz.domain.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentService {
    public List<Student> InitializeStudents(){
       String[] name = {"成吉思汗","鲁班七号","太乙真人","钟无艳"};
       List<Student> students = new ArrayList<>();
       for(int i=1;i<= name.length;i++){
           Student student = new Student();
           student.setName(name[i-1]);
           student.setId(i);
           students.add(student);
       }

       return students;
    }

    public List<Student> showStudentDetail() {
        List<Student> students = new ArrayList<>();
        students = InitializeStudents();
        return students;
    }
}
