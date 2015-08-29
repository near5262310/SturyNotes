package com.asher.dao;

import java.util.List;

import com.asher.action.teacher.room.UpdateRoom;
import com.asher.model.Course;
import com.asher.model.Room;
import com.asher.model.RoomTime;
import com.asher.model.Student;
import com.asher.model.Teacher;
import com.asher.model.Teaching;
import com.asher.model.Time;
import com.asher.vo.MemberInfo;

public interface ITeacherDao {
    Teacher chechUsernamAndPassword(MemberInfo memberInfo);
    void save(Teacher teacher);
    void update(Teacher teacher);
    void changePassword(int id, String password);
    void addCourse(Course course);
    Course findCourseById(int courseId);
    void removeCourse(int courseId);
    void updateCourse(Course course);

    void addTeaching(Teaching teaching);

    List<Room> listRooms();
    void addRoom(Room room);
    void deleteRoom(int roomId);
    Room selectRoomsById(int roomId);
    void UpdateRoom(Room room);
    int saveRoomTime(RoomTime roomTime);
    int deleteRoomTime(int roomTimeId);

    List<?> listTimes();
    Time selectTimesById(int timeId);

    List<Course> listCourse(String keywords);


    List<Teaching> getTeachingList(int teacherId);
    void removeTeaching(int id);
    Teaching findTeachingById(int teachingId);
    void showSyllabus(int tId);
    
    List<Student> getStudentList();
    List<Teacher> getTeacherList();
}
