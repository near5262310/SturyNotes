package com.asher.action.teacher.studentManage;

import java.util.List;

import javax.annotation.Resource;

import org.apache.struts2.ServletActionContext;

import com.asher.model.Student;
import com.asher.service.ITeacherService;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author Jensen
 *
 */
public class ListStudentAction extends ActionSupport{

    private static final long serialVersionUID = 1625096443301502646L;

    private ITeacherService teacherService;

    @Override
    public String execute() throws Exception {
        List<Student> studentList = teacherService.geStudentList();
        System.out.println(studentList.size());
        ServletActionContext.getRequest().setAttribute("studentList", studentList);
        return INPUT;
    }

    @Resource(name="teacherService")
    public void setTeacherService(ITeacherService teacherService) {
        this.teacherService = teacherService;
    }

}
