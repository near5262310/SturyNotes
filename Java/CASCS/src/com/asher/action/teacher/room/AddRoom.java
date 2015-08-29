package com.asher.action.teacher.room;

import javax.annotation.Resource;

import com.asher.model.Room;
import com.asher.service.ITeacherService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class AddRoom extends ActionSupport implements ModelDriven<Room>{

    private static final long serialVersionUID = 6563885068132184857L;

    private Room room;
    private ITeacherService teacherService;

    @Override
    public String execute() throws Exception {
        System.out.println(room);
        teacherService.addRoom(room);
        return INPUT;
    }

    @Override
    public Room getModel() {
        if (null == room){
            room = new Room();
        }
        return room;
    }

    @Resource(name="teacherService")
    public void setTeacherService(ITeacherService teacherService) {
        this.teacherService = teacherService;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

}
