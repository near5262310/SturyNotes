package com.asher.action.teacher.course;

import javax.annotation.Resource;

import com.asher.service.ITeacherService;
import com.opensymphony.xwork2.ActionSupport;

public class DeleteTeaching extends ActionSupport{

    private static final long serialVersionUID = 2576469496236281783L;

    private int teachingId;

    private ITeacherService teacherService;
    @Override
    public String execute() throws Exception {
        teacherService.removeTeaching(teachingId);
        return INPUT;
    }

    public void setTeachingId(int teachingId) {
        this.teachingId = teachingId;
    }

    @Resource(name="teacherService")
    public void setTeacherService(ITeacherService teacherService) {
        this.teacherService = teacherService;
    }
}
