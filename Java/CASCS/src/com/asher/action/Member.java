package com.asher.action;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.asher.constant.Key;
import com.asher.model.Student;
import com.asher.model.Teacher;
import com.asher.service.IStudentService;
import com.asher.service.ITeacherService;
import com.asher.vo.MemberInfo;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class Member extends ActionSupport implements ModelDriven<MemberInfo> {

    private static final long serialVersionUID = -2901242169342905941L;

    private MemberInfo memberInfo;
    private IStudentService studentService;
    private ITeacherService teacherService;
    private Student student = null;
    private Teacher teacher = null;

    public String login() {
        HttpSession session = ServletActionContext.getRequest().getSession();

        if (Key.STUDENT.equals(memberInfo.getType())) {
            student = studentService.login(memberInfo);

            if (null == student) {
                ServletActionContext.getRequest().setAttribute(Key.ERROR_MESSAGE,
                        "username or passowrd error");
                return Key.ERROR;
            }
        }

        if (Key.TEACHER.equals(memberInfo.getType())) {
            teacher = teacherService.login(memberInfo);

            if (null == teacher) {
                ServletActionContext.getRequest().setAttribute(Key.ERROR_MESSAGE,
                        "username or passowrd error");
                return Key.ERROR;
            }
        }

        if (null != student) {
            System.out.println(student);
            session.setAttribute(Key.CURREMT_USER, student);
        } else {
            System.out.println(teacher);
            session.setAttribute(Key.CURREMT_USER, teacher);
        }

        return Key.SUCCESS;
    }

    @Override
    public MemberInfo getModel() {
        if (null == memberInfo) {
            memberInfo = new MemberInfo();
        }
        return memberInfo;
    }

    public void setStudentService(IStudentService studentService) {
        this.studentService = studentService;
    }

    public void setTeacherService(ITeacherService teacherService) {
        this.teacherService = teacherService;
    }

    public MemberInfo getMemberInfo() {
        return memberInfo;
    }

    public void setMemberInfo(MemberInfo memberInfo) {
        this.memberInfo = memberInfo;
    }
}
