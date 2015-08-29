package com.asher.action.teacher.course;

import javax.annotation.Resource;

import com.asher.model.Course;
import com.asher.service.ITeacherService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class UpdateCourse extends ActionSupport implements ModelDriven<Course>{

    private static final long serialVersionUID = -4589490584097236063L;

    private Course course;
    private ITeacherService teacherService;

    @Override
    public String execute() throws Exception {
        teacherService.updateCourse(course);
        return SUCCESS;
    }

    @Override
    public Course getModel() {
        if (null == course){
            course = new Course();
        }
        return course;
    }

    @Resource(name="teacherService")
    public void setTeacherService(ITeacherService teacherService) {
        this.teacherService = teacherService;
    }
}
