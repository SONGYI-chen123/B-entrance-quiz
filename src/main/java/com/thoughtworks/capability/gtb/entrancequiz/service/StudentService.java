package com.thoughtworks.capability.gtb.entrancequiz.service;

import com.thoughtworks.capability.gtb.entrancequiz.domain.GroupRequest;
import com.thoughtworks.capability.gtb.entrancequiz.domain.Student;
import com.thoughtworks.capability.gtb.entrancequiz.domain.Groups;

import java.util.ArrayList;
import java.util.List;

public class StudentService {

    public List<Student> students = new ArrayList<>();
    public List<Groups> groups = new ArrayList<>();

    public List<Student> InitializeStudents(){
       String[] name = {"成吉思汗","鲁班七号","太乙真人","钟无艳"};
       for(int i=1;i<= name.length;i++){
           Student student = new Student();
           student.setName(name[i-1]);
           student.setId(i);
           students.add(student);
       }

       return students;
    }

    public List<Student> showStudentDetail() {
        return students;
    }

    public void divideGroups(GroupRequest groupRequest) {
        int MinNum = students.size()/groupRequest.getGroupNum();
        int overNum = students.size()% groupRequest.getGroupNum();
        for(int i =0;i<groupRequest.getGroupNum();i++){
            Groups group = new Groups();
            String groupName = getGroupName(i+1);
            group.setGroupName(groupName);
            int a;
            for(int j=0;j<overNum;j++){
                int memberNum = MinNum+1;
                a = a + memberNum;
                List<Student> member = new ArrayList<>();
                member = getStudents(memberNum,a);
                group.setStudents(member);
            }
        }
    }

    private List<Student> getStudents(int memberNum,int a) {
        for(int i=0;i<memberNum;i++ ){
            Student student = new Student();
            student.setId(students.get(i+a).getId());
            student.setName(students.get(i+a).getName());
        }
    }

    private String getGroupName(Integer groupNum) {
        String str1 = groupNum.toString();
        String str2 = "组";
        String groupName = str1+str2;
        return groupName;
    }
}
