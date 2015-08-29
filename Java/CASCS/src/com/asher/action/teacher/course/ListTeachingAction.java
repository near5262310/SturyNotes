package com.asher.action.teacher.course;

import java.util.List;

import javax.annotation.Resource;

import org.apache.struts2.ServletActionContext;

import com.asher.constant.Key;
import com.asher.model.Teacher;
import com.asher.model.Teaching;
import com.asher.service.ITeacherService;
import com.opensymphony.xwork2.ActionSupport;

public class ListTeachingAction extends ActionSupport {

    private static final long serialVersionUID = -8891289159591419149L;

    private ITeacherService teacherService;
    
    @Override
    public String execute() throws Exception {
        Teacher teacher = (Teacher) ServletActionContext.getRequest().getSession().getAttribute(Key.CURREMT_USER);
        List<Teaching> teachingList = teacherService.getTeachingList(teacher.getId());
        ServletActionContext.getRequest().setAttribute("teachingList", teachingList);
        return INPUT;
    }

    @Resource(name="teacherService")
    public void setTeacherService(ITeacherService teacherService) {
        this.teacherService = teacherService;
    }
}
