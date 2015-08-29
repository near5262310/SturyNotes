package com.asher.action.teacher;

import java.util.List;

import javax.annotation.Resource;

import org.apache.struts2.ServletActionContext;

import com.asher.model.Teacher;
import com.asher.service.ITeacherService;
import com.opensymphony.xwork2.ActionSupport;

public class ListTeacher extends ActionSupport{

    private static final long serialVersionUID = -1950352673187846126L;

    public ITeacherService teacherService;

    @Override
    public String execute() throws Exception {
        List<Teacher> teacherList = teacherService.getTeacherList();
        ServletActionContext.getRequest().setAttribute("teacherList", teacherList);
        return INPUT;
    }

    @Resource()
    public void setTeacherService(ITeacherService teacherService) {
        this.teacherService = teacherService;
    }
}
