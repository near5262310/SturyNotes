package com.asher.action.teacher.room;

import javax.annotation.Resource;

import com.asher.service.ITeacherService;
import com.opensymphony.xwork2.ActionSupport;

public class DeleteRoom extends ActionSupport{

    private static final long serialVersionUID = -3656331404854653343L;

    private ITeacherService teacherService;
    private int roomId;

    @Override
    public String execute() throws Exception {
        teacherService.deleteRoom(roomId);
        return SUCCESS;
    }


    @Resource(name="teacherService")
    public void setTeacherService(ITeacherService teacherService) {
        this.teacherService = teacherService;
    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }
}
