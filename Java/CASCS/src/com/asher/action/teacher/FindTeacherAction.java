package com.asher.action.teacher;

import javax.annotation.Resource;

import com.asher.service.ITeacherService;
import com.opensymphony.xwork2.ActionSupport;

public class FindTeacherAction extends ActionSupport{

    private static final long serialVersionUID = 1L;

    private ITeacherService teacherService;

    @Override
    public String execute() throws Exception {
        
        return INPUT;
    }

    @Resource(name="teacherService")
    public void setTeacherService(ITeacherService teacherService) {
        this.teacherService = teacherService;
    }
    
    
}
