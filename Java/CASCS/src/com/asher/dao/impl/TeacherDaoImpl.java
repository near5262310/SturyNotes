package com.asher.dao.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.asher.dao.ITeacherDao;
import com.asher.model.Course;
import com.asher.model.Room;
import com.asher.model.RoomTime;
import com.asher.model.Student;
import com.asher.model.Teacher;
import com.asher.model.Teaching;
import com.asher.model.Time;
import com.asher.vo.MemberInfo;
import com.asher.vo.RoomAndTime;

@SuppressWarnings("unchecked")
public class TeacherDaoImpl implements ITeacherDao {

    private HibernateTemplate template;

    @Override
    public Teacher chechUsernamAndPassword(MemberInfo memberInfo) {
        String hql = "from Teacher where username= ? and password = ?";
        List<Teacher> list = template.find(hql, memberInfo.getUsername(),
                memberInfo.getPassword());

        if (0 != list.size()) {
            return list.get(0);
        }
        return null;
    }

    public void setTemplate(HibernateTemplate template) {
        this.template = template;
    }

    @Override
    public void save(Teacher teacher) {
        template.save(teacher);
    }

    @Override
    public void update(Teacher teacher) {
        template.getSessionFactory().openSession().
        createQuery("update Teacher t  set t.sex=?, t.major=?, t.department=?,t.title=? where t.id=?")
        .setString(0, teacher.getSex())
        .setString(1, teacher.getMajor())
        .setString(2, teacher.getDepartment())
        .setString(3, teacher.getTitle())
        .setInteger(4, teacher.getId()).executeUpdate();
    }

    @Override
    public List<Teaching> getTeachingList(int teacherId) {
        List<Teaching> teachingList = template.getSessionFactory()
                .openSession()
                .createQuery("from Teaching ti " + "where ti.teacher.id = ?")
                .setInteger(0, teacherId).list();
        return teachingList;
    }

    @Override
    public void removeTeaching(int id) {
        System.out.println("ssss   "+id);
        Teaching teaching =  (Teaching) template.find("from Teaching t where t.id = ?", id).get(0);
        System.out.println(teaching);
        template.delete(teaching);
    }

    @Override
    public void showSyllabus(int tId) {

    }

    @Override
    public void addTeaching(Teaching teaching) {
        template.save(teaching);
    }

    @Override
    public Course findCourseById(int courseId) {
        List<Course> courses = template.getSessionFactory().openSession()
                .createQuery("from Course where id = ?")
                .setInteger(0, courseId).list();
        if (courses.size() > 0) {
            return courses.get(0);
        }
        return null;
    }

    //Needs change.
    @Override
    public List<Room> listRooms() {
        return template.find("from Room");
    }

    @Override
    public Room selectRoomsById(int roomId) {
        List<Room> courses = template.getSessionFactory().openSession()
                .createQuery("from Room where id = ?").setInteger(0, roomId)
                .list();
        if (courses.size() > 0) {
            return courses.get(0);
        }
        return null;
    }

    @Override
    public List<?> listTimes() {
      SQLQuery sqlQuery = template.getSessionFactory().openSession().createSQLQuery("select room.id as rid,room.number,room.description,room.capacity,time.id as tid,time.week,time.timeperiod from room,time where room.id not in (select room_id from room_time where room_id = room.id and time_id=time.id)");

      List<Object[]> list = sqlQuery.list();
      List<RoomAndTime> rtList = new ArrayList<RoomAndTime>();
      for(Object[] objs : list){
          rtList.add(new RoomAndTime((Integer)objs[0], objs[1].toString(), objs[2].toString(), (Integer)objs[3],
                  (Integer)objs[4], objs[5].toString(), objs[6].toString()));
      }
      return rtList;
    }

    @Override
    public Time selectTimesById(int timeId) {
        Time time = null;
        List<Time> list = template.getSessionFactory().openSession()
                .createQuery("from Time where id = ?").setInteger(0, timeId)
                .list();
        if (0 < list.size()) {
            time = list.get(0);
        }
        return time;
    }

    @Override
    public Teaching findTeachingById(int teachingId) {
        return (Teaching) template.find("from Teaching ti where ti.id = ?",teachingId).get(0);
    }

    @Override
    public int saveRoomTime(RoomTime roomTime) {
        return (Integer) template.getSessionFactory().openSession().save(roomTime);
    }

    @Override
    public void addCourse(Course course) {
        template.save(course);
    }

    @Override
    public List<Course> listCourse(String keywords) {
        return template
                .find("from Course c where id not in (select t.course.id from Teaching t) and c.name like '%"+keywords+"%'");
    }

    @Override
    public void removeCourse(int courseId) {
        Course course = findCourseById(courseId);
        template.delete(course);
    }

    @Override
    public void updateCourse(Course course) {
        template.update(course);
    }

    @Override
    public void addRoom(Room room) {
        template.save(room);
    }

    @Override
    public void deleteRoom(int roomId) {
        template.delete(selectRoomsById(roomId));
    }

    @Override
    public void UpdateRoom(Room room) {
        template.update(room);
    }

    @Override
    public int deleteRoomTime(int roomTimeId) {
        template.delete(template.find("from RoomTime where id=?",roomTimeId).get(0));
        return 0;
    }

    @Override
    public List<Student> getStudentList() {
        return template.find("from Student");
    }

    @Override
    public List<Teacher> getTeacherList() {
        return template.find("from Teacher");
    }

    @Override
    public void changePassword(int id, String password) {
        template.getSessionFactory()
        .openSession()
        .createQuery("update Teacher t set t.password=? where t.id=?")
        .setString(0, password).setInteger(1, id).executeUpdate();
    }
}
