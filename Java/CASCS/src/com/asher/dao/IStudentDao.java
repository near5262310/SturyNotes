package com.asher.dao;

import java.util.List;

import com.asher.model.Course;
import com.asher.model.Elective;
import com.asher.model.Student;
import com.asher.model.Teaching;
import com.asher.vo.MemberInfo;
import com.asher.vo.PageInfo;

public interface IStudentDao {

    Student checkUsernameAndPassword(MemberInfo memberInfo);
    int save(Student student);
    void update(Student student);
    void delete(Student student);
    Student findById(int sutdentId);
    List<Student> getList(PageInfo<String> pageInfo);
    int getStudentCount(PageInfo<String> pageInfo);
    List<Course> getCourseList(int userId);
    List<Course> getCourseListHasChoosed(int userId);
    void chooseCourse(Elective elective);
    Course findCourseById(int courseId);
    
    void updateCourseNum(int studentId, int actualNum);

    List<Teaching> showSyllabus(int userId);
}
