package com.asher.action.teacher.studentManage;

import java.util.Date;

import javax.annotation.Resource;

import com.asher.model.Student;
import com.asher.service.IStudentService;
import com.asher.service.ITeacherService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class AddStudent extends ActionSupport implements ModelDriven<Student>{

    private static final long serialVersionUID = -2512303681689977425L;

    private Student student;
    private IStudentService studentService;
    @Override
    public String execute() throws Exception {
        System.out.println("adsadfsdfasd"+student);
        student.setInTime(new Date(System.currentTimeMillis()));
        student.setCourseMaxNumber(100);
        student.setCourseActualNumber(0);
        studentService.save(student);
        return INPUT;
    }

    @Resource(name="studentService")
    public void setStudentService(IStudentService studentService) {
        this.studentService = studentService;
    }

    @Override
    public Student getModel() {
        if(null == student){
            student = new Student();
        }
        return student;
    }
}
