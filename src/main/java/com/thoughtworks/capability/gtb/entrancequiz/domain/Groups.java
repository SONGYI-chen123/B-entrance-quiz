package com.thoughtworks.capability.gtb.entrancequiz.domain;

import java.util.List;

// TODO GTB-工程实践: - 类名应该使用单数
public class Groups {
    // TODO GTB-工程实践: - 注意类成员的顺序，一般是字段，构造器，公共方法，私有方法
    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public Groups(String groupName, List<Student> students) {
        this.groupName = groupName;
        this.students = students;
    }

    public Groups() {
    }

    private String groupName;
    private List<Student> students;
}
