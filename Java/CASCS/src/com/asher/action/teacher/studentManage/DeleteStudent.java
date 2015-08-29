package com.asher.action.teacher.studentManage;

import javax.annotation.Resource;

import com.asher.service.IStudentService;
import com.opensymphony.xwork2.ActionSupport;

public class DeleteStudent extends ActionSupport {
    private int studentId;
    private IStudentService studentService;

    @Override
    public String execute() throws Exception {
        return super.execute();
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    @Resource(name = "studentService1")
    public void setStudentService(IStudentService studentService) {
        this.studentService = studentService;
    }

}
