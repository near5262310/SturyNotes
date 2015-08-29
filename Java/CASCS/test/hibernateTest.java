import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.omg.CORBA.DATA_CONVERSION;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.asher.model.Course;
import com.asher.model.Elective;
import com.asher.model.Student;
import com.asher.model.Time;
import com.asher.service.IStudentService;
import com.asher.util.HibernateSessionFactory;
import com.asher.vo.MemberInfo;
import com.asher.vo.PageInfo;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/dao.xml","classpath:spring/service.xml"})
public class hibernateTest {

    private IStudentService studentService;
    private PageInfo<String> pageInfo = new PageInfo<String>(1, 10, 10, "", "", 0, 0);
    @Test
    public void testlistStudent(){
        List<Student> listStudents = studentService.getList(pageInfo);
        System.out.println(listStudents.size());
    }

    @Test
    public void saveStudent(){
        studentService.save(new Student(0, "10060352s", "asher1", "52623100",
                "male", "asf", "a", "a","s" , 11, 2, new Date(2014, 2, 2), 
                new Date(System.currentTimeMillis()), "2", "s"));
        
        
    }
    @Test
    public void updateStudent(){
        studentService.update(new Student(2, "10060352s", "asher3", "52623100",
                "male", "asf", "a", "a","s" , 11, 2, new Date(2014, 2, 2), 
                new Date(System.currentTimeMillis()), "2", "s"));
    }
    @Test
    public void testGetCount(){
        int result = studentService.getCount(pageInfo);
        System.out.println(result);
    }
    
    @Test
    public void testListCourse(){
        List<Course> list = studentService.getCourseList(1);
        for(Course course : list){
            System.out.println(course);
        }
    }
    
    @Test
    public void testListChooseCourse(){
        List<Course> list = studentService.getCourseListHasChoosed(1);
        for(Course course : list){
            System.out.println(course);
        }
    }
    
    @Test
    public void testChooseCourse(){
            Student student = studentService.login(new MemberInfo("asher", "5262310", "student"));
            System.out.println(student);
            Course course = studentService.findCourseById(3);
            System.out.println(course);
            studentService.chooseCourse(new Elective(3, student, course, 0.0));
    }
    
    @Resource(name = "studentService")
    public void setStudentService(IStudentService studentService) {
        this.studentService = studentService;
    }
}
