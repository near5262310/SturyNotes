package com.asher.action.teacher.room;

import com.asher.model.Room;
import com.asher.service.ITeacherService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class UpdateRoom extends ActionSupport implements ModelDriven<Room>{

    private static final long serialVersionUID = 2370604182166430609L;
    
    private ITeacherService teacherService;
    private Room room;
   
    @Override
    public String execute() throws Exception {
        teacherService.updateRoom(room);
        return SUCCESS;
    }
    
    @Override
    public Room getModel() {
        if (null == room){
            room = new Room();
        }
        return room;
    }

    public Room getRoom() {
        return room;
    }
    
    public void setRoom(Room room) {
        this.room = room;
    }
    
    public void setTeacherService(ITeacherService teacherService) {
        this.teacherService = teacherService;
    }

    
}
