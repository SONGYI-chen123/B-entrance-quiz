package com.thoughtworks.capability.gtb.entrancequiz.domain;

import java.util.List;

public class Groups {
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
