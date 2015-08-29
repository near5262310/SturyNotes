package com.asher.action.teacher.course;

import javax.annotation.Resource;

import com.asher.service.ITeacherService;
import com.opensymphony.xwork2.ActionSupport;

public class RemoveCourse extends ActionSupport{

    private static final long serialVersionUID = -5687800015834076694L;
    private int courseId;
    private ITeacherService teacherService;

    @Override
    public String execute() throws Exception {
        System.out.println("courseid = "+ courseId);
        teacherService.removeCourse(courseId);
        return SUCCESS;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = Integer.parseInt(courseId);
    }
    @Resource(name="teacherService")
    public void setTeacherService(ITeacherService teacherService) {
        this.teacherService = teacherService;
    }
}
