package com.asher.action.teacher.course;

import javax.annotation.Resource;

import com.asher.model.Course;
import com.asher.service.ITeacherService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class AddCourseAction extends ActionSupport implements ModelDriven<Course> {

    /**
     *
     */
    private static final long serialVersionUID = 5620888936926746357L;
    private Course course;
    private ITeacherService teacherService;

    @Override
    public String execute() throws Exception {
        System.out.println("addcourse");
        teacherService.addCourse(course);
        System.out.println("finish");
        return INPUT;
    }

    @Override
    public Course getModel() {
        if (null == course) {
            course = new Course();
        }
        return course;
    }

    @Resource(name = "teacherService")
    public void setTeacherService(ITeacherService teacherService) {
        this.teacherService = teacherService;
    }

}
