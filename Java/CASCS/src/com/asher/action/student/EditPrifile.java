package com.asher.action.student;

import com.asher.model.Student;
import com.asher.service.IStudentService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class EditPrifile extends ActionSupport implements ModelDriven<Student> {

    private static final long serialVersionUID = 8335239396686394324L;
    private Student student;
    private IStudentService studentService;

    @Override
    public String execute() throws Exception {
        studentService.update(student);
        return SUCCESS;
    }

    @Override
    public Student getModel() {
        if (null == student) {
            student = new Student();
        }
        return student;
    }

    public void setStudentService(IStudentService studentService) {
        this.studentService = studentService;
    }
}
