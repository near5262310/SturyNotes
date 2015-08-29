package com.asher.action.student;

import javax.annotation.Resource;

import org.apache.struts2.ServletActionContext;

import com.asher.constant.Key;
import com.asher.model.Course;
import com.asher.model.Elective;
import com.asher.model.Student;
import com.asher.service.IStudentService;
import com.opensymphony.xwork2.ActionSupport;

public class ChooseCourseAction extends ActionSupport{

    private static final long serialVersionUID = 1381895181851122489L;

    private IStudentService studentService;
    private int courseId;

    @Override
    public String execute() throws Exception {
        Student student = (Student) ServletActionContext.getRequest().getSession().getAttribute(Key.CURREMT_USER);
        Course course = studentService.findCourseById(courseId);
        Elective elective = new Elective(-1, student, course, 0);
        studentService.chooseCourse(elective);
        System.out.println(elective);
        studentService.updateCourseNum(student.getId(), student.getCourseActualNumber()+1);
        Student currentStudent = studentService.findById(student.getId());
        System.out.println("ssswww1"+currentStudent);
        ServletActionContext.getRequest().getSession().setAttribute(Key.CURREMT_USER, currentStudent);
        return INPUT;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    @Resource(name="studentService")
    public void setStudentService(IStudentService studentService) {
        this.studentService = studentService;
    }
}
