package com.asher.action.teacher;

import javax.annotation.Resource;

import org.apache.struts2.ServletActionContext;

import com.asher.constant.Key;
import com.asher.model.Teacher;
import com.asher.service.ITeacherService;
import com.opensymphony.xwork2.ActionSupport;

public class ChangePasswordAction extends ActionSupport{

    private static final long serialVersionUID = -8235117492716661677L;

    private String password;
    private String repassword;
    
    private ITeacherService teacherService;

    @Override
    public String execute() throws Exception {
        Teacher teacher = (Teacher) ServletActionContext.getRequest().getSession().getAttribute(Key.CURREMT_USER);
        if(password.equals(repassword)){
            teacherService.changePassword(teacher.getId(), password);
        }
         return INPUT;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRepassword(String repassword) {
        this.repassword = repassword;
    }

    @Resource(name="teacherService")
    public void setTeacherService(ITeacherService teacherService) {
        this.teacherService = teacherService;
    }
}
