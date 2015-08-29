package com.asher.action.teacher.room;

import java.util.List;

import javax.annotation.Resource;

import org.apache.struts2.ServletActionContext;

import com.asher.model.Room;
import com.asher.service.ITeacherService;
import com.opensymphony.xwork2.ActionSupport;

public class ListRoom extends ActionSupport{

    private static final long serialVersionUID = -1533680079593456190L;

    private ITeacherService teacherService;

    @Override
    public String execute() throws Exception {
        List<Room> roomList = teacherService.listRooms();
        System.out.println(roomList.size());
        ServletActionContext.getRequest().setAttribute("roomList", roomList);
        return INPUT;
    }

    @Resource(name="teacherService")
    public void setTeacherService(ITeacherService teacherService) {
        this.teacherService = teacherService;
    }
}
