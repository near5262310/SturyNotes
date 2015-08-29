package com.asher.action.student;

import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.asher.constant.Key;
import com.asher.model.Course;
import com.asher.model.Student;
import com.asher.service.IStudentService;
import com.opensymphony.xwork2.ActionSupport;

public class ListCourseAction extends ActionSupport{

    private static final long serialVersionUID = 309692216769239692L;

    private IStudentService studentService;

    @Override
    public String execute() throws Exception {
        Student studet = (Student) ServletActionContext.getRequest().getSession().getAttribute(Key.CURREMT_USER);
        List<Course> courseList = studentService.getCourseList(studet.getId());
        ServletActionContext.getRequest().setAttribute("courseList", courseList);
        return INPUT;
    }

    public void setStudentService(IStudentService studentService) {
        this.studentService = studentService;
    }
}
