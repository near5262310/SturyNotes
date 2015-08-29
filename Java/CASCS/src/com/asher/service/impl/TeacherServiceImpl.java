package com.asher.service.impl;

import java.util.List;

import com.asher.dao.ITeacherDao;
import com.asher.model.Course;
import com.asher.model.Room;
import com.asher.model.RoomTime;
import com.asher.model.Student;
import com.asher.model.Teacher;
import com.asher.model.Teaching;
import com.asher.model.Time;
import com.asher.service.ITeacherService;
import com.asher.vo.MemberInfo;

public class TeacherServiceImpl implements ITeacherService{

    private ITeacherDao teacherDao;

    @Override
    public Teacher login(MemberInfo memberInfo) {
        Teacher teacher = null;
        teacher = teacherDao.chechUsernamAndPassword(memberInfo);
        return teacher;
    }

    public void setTeacherDao(ITeacherDao teacherDao) {
        this.teacherDao = teacherDao;
    }

    @Override
    public void save(Teacher teacher) {
        teacherDao.save(teacher);
    }

    @Override
    public void update(Teacher teacher) {
        teacherDao.update(teacher);
    }

    @Override
    public void addTeaching(Teaching teaching) {
        teacherDao.addTeaching(teaching);
    }

    @Override
    public Course findCourseById(int courseId) {

        return teacherDao.findCourseById(courseId);
    }

    @Override
    public List<Room> listRooms() {
        return teacherDao.listRooms();
    }

    @Override
    public Room selectRoomsById(int roomId) {
        return teacherDao.selectRoomsById(roomId);
    }

    @Override
    public List<?> listTimes() {
        return teacherDao.listTimes();
    }

    @Override
    public Time selectTimesById(int timeId) {
        return teacherDao.selectTimesById(timeId);
    }

    @Override
    public List<Teaching> getTeachingList(int teacherId) {
        return teacherDao.getTeachingList(teacherId);
    }

    @Override
    public void removeTeaching(int id) {
        int teachingId = findTeachingById(id).getRoomTime().getId();
        teacherDao.removeTeaching(id);
        deleteRoomTime(teachingId);
    }

    @Override
    public Teaching findTeachingById(int teachingId) {
        return teacherDao.findTeachingById(teachingId);
    }

    @Override
    public void showSyllabus(int tId) {
        teacherDao.showSyllabus(tId);
    }

    @Override
    public int saveRoomTime(RoomTime roomTime) {
        return teacherDao.saveRoomTime(roomTime);
    }

    @Override
    public void addCourse(Course course) {
        teacherDao.addCourse(course);
    }

    @Override
    public List<Course> listCourse(String keywords) {
        return teacherDao.listCourse(keywords);
    }

    @Override
    public void removeCourse(int courseId) {
        teacherDao.removeCourse(courseId);
    }

    @Override
    public void updateCourse(Course course) {
        teacherDao.updateCourse(course);
    }

    @Override
    public void addRoom(Room room) {
        teacherDao.addRoom(room);
    }

    @Override
    public void deleteRoom(int roomId) {
        teacherDao.deleteRoom(roomId);
    }

    @Override
    public void updateRoom(Room room) {
        teacherDao.UpdateRoom(room);
    }

    @Override
    public int deleteRoomTime(int roomTimeId) {
        System.out.println("room time id"+roomTimeId);
        teacherDao.deleteRoomTime(roomTimeId);
        return 0;
    }

    @Override
    public List<Student> geStudentList() {
        return teacherDao.getStudentList();
    }

    @Override
    public List<Teacher> getTeacherList() {
        return teacherDao.getTeacherList();
    }

    @Override
    public void changePassword(int id, String password) {
        teacherDao.changePassword(id, password);
    }

}
