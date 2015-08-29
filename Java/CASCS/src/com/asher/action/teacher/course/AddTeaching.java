package com.asher.action.teacher.course;

import javax.annotation.Resource;

import org.apache.struts2.ServletActionContext;

import com.asher.model.Course;
import com.asher.model.Room;
import com.asher.model.RoomTime;
import com.asher.model.Teacher;
import com.asher.model.Teaching;
import com.asher.model.Time;
import com.asher.service.ITeacherService;
import com.asher.service.impl.TeacherServiceImpl;
import com.opensymphony.xwork2.ActionSupport;

public class AddTeaching extends ActionSupport{

    private static final long serialVersionUID = -7843813086856394501L;

    private String rtMessage;
    private int courseId;
    private ITeacherService teacherService;
    
    @Override
    public String execute() throws Exception {
        System.out.println(rtMessage);
        String[] rtmess = rtMessage.split(",");
        Room room = teacherService.selectRoomsById(Integer.parseInt(rtmess[1]));
        Time time = teacherService.selectTimesById(Integer.parseInt(rtmess[0]));
        Course course = teacherService.findCourseById(courseId);
        RoomTime roomTime = new RoomTime(1, room, time);
       int roomTimeId = teacherService.saveRoomTime(roomTime);
       roomTime.setId(roomTimeId);
       Teacher teacher = (Teacher) ServletActionContext.getRequest().getSession().getAttribute("currentUser");
       
       teacherService.addTeaching(new Teaching(1, teacher, course, roomTime, Integer.parseInt(rtmess[2]), 0));
        return INPUT;
    }

    
    public void setRtMessage(String rtMessage) {
        this.rtMessage = rtMessage;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    @Resource(name="teacherService")
    public void setTeacherService(ITeacherService teacherService) {
        this.teacherService = teacherService;
    }
    
    
    
}
