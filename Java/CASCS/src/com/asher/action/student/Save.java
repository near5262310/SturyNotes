package com.asher.action.student;

import com.asher.model.Student;
import com.asher.service.IStudentService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class Save extends ActionSupport implements ModelDriven<Student>{

    private static final long serialVersionUID = 903089764982002716L;
    private Student student;
    private IStudentService studentService;
    
    @Override
    public String execute() throws Exception {
        studentService.save(student);
        return SUCCESS;
    }
    public void setStudentService(IStudentService studentService) {
        this.studentService = studentService;
    }
    @Override
    public Student getModel() {
        if (null == student){
            student = new Student();
        }
        return student;
    }
}
