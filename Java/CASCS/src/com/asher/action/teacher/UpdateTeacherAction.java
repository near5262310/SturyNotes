package com.asher.action.teacher;

import javax.annotation.Resource;

import org.apache.struts2.ServletActionContext;

import com.asher.constant.Key;
import com.asher.model.Teacher;
import com.asher.service.ITeacherService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class UpdateTeacherAction extends ActionSupport implements ModelDriven<Teacher>{

    private static final long serialVersionUID = 1L;

    private ITeacherService teacherService;
    private Teacher teacher;
    
    @Override
    public String execute() throws Exception {
        Teacher currentTeacher = (Teacher) ServletActionContext.getRequest().getSession().getAttribute(Key.CURREMT_USER);
        currentTeacher.setMajor(teacher.getMajor());
        currentTeacher.setDepartment(teacher.getDepartment());
        currentTeacher.setTitle(teacher.getTitle());
        System.out.println(currentTeacher);
        teacherService.update(currentTeacher);
        return INPUT;
    }

    @Override
    public Teacher getModel() {
        if (null == teacher){
            teacher = new Teacher();
        }
        return teacher;
    }

    @Resource(name="teacherService")
    public void setTeacherService(ITeacherService teacherService) {
        this.teacherService = teacherService;
    }

    
}
