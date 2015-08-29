package Tests;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.asher.model.Course;
import com.asher.model.Room;
import com.asher.model.RoomTime;
import com.asher.model.Teacher;
import com.asher.model.Teaching;
import com.asher.model.Time;
import com.asher.service.ITeacherService;
import com.asher.vo.MemberInfo;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring/dao.xml",
        "classpath:spring/service.xml" })
public class TeacherTest {

    private ITeacherService teacherService;

    @Test
    public void testSave() {
        teacherService.save(new Teacher(2, "numte1", "tasher2", "52623100",
                "male", "ads", "sdaf", "sdf", 1));
    }

    @Test
    public void testUpdate() {
        teacherService.update(new Teacher(2, "numte3", "tasher2", "52623100",
                "male", "ads", "sdaf", "sdf", 1));
    }

    @Test
    public void testListCourse(){
        for(Course cour :teacherService.listCourse(""))
        {
            System.out.println(cour);
        }
    }
    @Test
    public void testFindCourseById(){
        System.out.println(teacherService.findCourseById(1));
    }

    @Test
    public void testFindTimeById(){
        System.out.println(teacherService.selectTimesById(2));
    }

    @Test
    public void testAddTeaching(){
        Teacher teacher = teacherService.login(new MemberInfo("tasher", "5262310", "teacher"));
        Course course = teacherService.findCourseById(3);
        Time time = teacherService.selectTimesById(9);
        Room room = teacherService.selectRoomsById(3);
        System.out.println(teacherService.saveRoomTime(new RoomTime(1, room, time))+"");
        teacherService.addTeaching(new Teaching(1, teacher, course, new RoomTime(1, room, time), 23, 1));
    }
    
    @Test
    public void testGetTeachingList(){
        for(Teaching teaching :teacherService.getTeachingList(1))
        {
            System.out.println(teaching);
        }
    }

    @Test
    public void testAddCourse(){
        teacherService.addCourse(new Course(1, "sss", "sss", "sadf", "asdf", 1));
    }
    
    @Test
    public void testRemoveTeaching(){
        teacherService.removeTeaching(1);
    }
    @Test
    public void testListRoomAndTime(){
       // for(Object obj : teacherService.listRooms()){
       //     System.out.println(obj);
       // }
        for(Object obj : teacherService.listTimes()){
            System.out.println(obj);
        }
    }
    
    @Test
    public void testDeleteRoomTime(){
        teacherService.deleteRoomTime(20);
    }
    
    @Resource(name = "teacherService")
    public void setTeacherService(ITeacherService teacherService) {
        this.teacherService = teacherService;
    }
}
