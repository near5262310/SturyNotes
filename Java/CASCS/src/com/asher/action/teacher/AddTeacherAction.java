package com.asher.action.teacher;

import javax.annotation.Resource;

import com.asher.model.Teacher;
import com.asher.service.ITeacherService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class AddTeacherAction extends ActionSupport implements ModelDriven<Teacher>{

    private static final long serialVersionUID = -4635900241867460493L;
    private ITeacherService teacherService;
    private Teacher teacher;
    
    @Override
    public String execute() throws Exception {
        System.out.println(teacher);
        teacher.setPassword("52623100");
        teacherService.save(teacher);;
        return INPUT;
    }

    @Resource(name="teacherService")
    public void setTeacherService(ITeacherService teacherService) {
        this.teacherService = teacherService;
    }

    @Override
    public Teacher getModel() {
        if (null == teacher){
            teacher = new Teacher();
        }
        return teacher;
    }
}
