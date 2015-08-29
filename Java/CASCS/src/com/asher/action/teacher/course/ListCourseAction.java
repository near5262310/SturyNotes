package com.asher.action.teacher.course;

import java.util.List;

import javax.annotation.Resource;

import org.apache.struts2.ServletActionContext;

import com.asher.model.Course;
import com.asher.model.Room;
import com.asher.model.Time;
import com.asher.service.ITeacherService;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author Jensen
 *
 */
public class ListCourseAction extends ActionSupport {

    private static final long serialVersionUID = 1L;

    private ITeacherService teacherService;
    private String keywords = "";

    @Override
    public String execute() throws Exception {
        List<Course> courseList = teacherService.listCourse(keywords);
        ServletActionContext.getRequest().setAttribute("courseList", courseList);
        List<?> roomAndTime = teacherService.listTimes();
        ServletActionContext.getRequest().setAttribute("rtList", roomAndTime);
        return INPUT;
    }

    @Resource(name = "teacherService")
    public void setTeacherService(ITeacherService teacherService) {
        this.teacherService = teacherService;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }
}
