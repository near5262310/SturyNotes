package com.asher.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.asher.dao.IStudentDao;
import com.asher.model.Course;
import com.asher.model.Elective;
import com.asher.model.Student;
import com.asher.model.Teaching;
import com.asher.service.IStudentService;
import com.asher.vo.MemberInfo;
import com.asher.vo.PageInfo;

public class StudentServiceImpl implements IStudentService{

    IStudentDao studentDao;

    @Override
    public Student login(MemberInfo memberInfo) {
        Student result = null;
        result = studentDao.checkUsernameAndPassword(memberInfo);
        return result;
    }

    public void setStudentDao(IStudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    public int save(Student student) {
        studentDao.save(student);
        return 0;
    }

    @Override
    public void update(Student student) {
        studentDao.update(student);
    }

    @Override
    public List<Student> getList(PageInfo<String> pageInfo) {
        List<Student> studentList = new ArrayList<Student>();
        studentList = studentDao.getList(pageInfo);
        return studentList;
    }

    @Override
    public int getCount(PageInfo<String> pageInfo) {
        int result = -1;
        result = studentDao.getStudentCount(pageInfo);
        return result;
    }

    @Override
    public List<Course> getCourseList(int userId) {
        return studentDao.getCourseList(userId);
    }

    @Override
    public List<Course> getCourseListHasChoosed(int userId) {
        return studentDao.getCourseListHasChoosed(userId);
    }

    @Override
    public void chooseCourse(Elective elective) {
        studentDao.chooseCourse(elective);
    }

    @Override
    public Course findCourseById(int courseId) {
        return studentDao.findCourseById(courseId);
    }

    @Override
    public List<Teaching> showSyllabus(int userId) {
        return studentDao.showSyllabus(userId);
    }

    @Override
    public void updateCourseNum(int studentId, int actualNum) {
        studentDao.updateCourseNum(studentId, actualNum);
    }

    @Override
    public Student findById(int sutdentId) {
        return studentDao.findById(sutdentId);
    }
}
