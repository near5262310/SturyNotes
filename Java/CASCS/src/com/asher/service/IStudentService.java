package com.asher.service;


import java.util.List;

import com.asher.model.Course;
import com.asher.model.Elective;
import com.asher.model.Student;
import com.asher.model.Teaching;
import com.asher.vo.MemberInfo;
import com.asher.vo.PageInfo;

public interface IStudentService {

    Student login(MemberInfo memberInfo);
    int save(Student student);
    void update(Student student);
    List<Student> getList(PageInfo<String> pageInfo);
    int getCount(PageInfo<String> pageInfo);
    List<Course> getCourseList(int userId);
    Student findById(int sutdentId);
    List<Course> getCourseListHasChoosed(int userId);
    void chooseCourse(Elective elective);
    Course findCourseById(int courseId);
    List<Teaching> showSyllabus(int userId);
    void updateCourseNum(int studentId, int actualNum);
}
