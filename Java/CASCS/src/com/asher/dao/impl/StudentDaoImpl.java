package com.asher.dao.impl;


import java.util.List;

import org.hibernate.Query;
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.asher.dao.IStudentDao;
import com.asher.model.Course;
import com.asher.model.Elective;
import com.asher.model.Student;
import com.asher.model.Teaching;
import com.asher.vo.MemberInfo;
import com.asher.vo.PageInfo;
@SuppressWarnings("unchecked")
public class StudentDaoImpl implements IStudentDao{

    HibernateTemplate template;

    @Override
    public Student checkUsernameAndPassword(MemberInfo memberInfo) {
        String hql = "from Student where username = ? and password = ?";

        List<Student> list = template.find(hql, memberInfo.getUsername(), memberInfo.getPassword());

        if (1 == list.size()){
            return (Student) list.get(0);
        }

        return null;
    }

    public void setTemplate(HibernateTemplate template) {
        this.template = template;
    }

    public HibernateTemplate getTemplate() {
        return template;
    }

    @Override
    public int save(Student student) {
        template.save(student);
        return 0;
    }

    @Override
    public void update(Student student) {
        template.update(student);
    }

    @Override
    public List<Student> getList(PageInfo<String> pageInfo) {
        Query query = template.getSessionFactory().openSession().createQuery("from Student where number like ?").setString(0, "%"+pageInfo.getKeywords()+"%");
        query.setFirstResult((pageInfo.getCurrentPage()-1)*pageInfo.getPageRows());
        query.setMaxResults(pageInfo.getPageRows());
        return query.list();
    }

    @Override
    public int getStudentCount(PageInfo<String> pageInfo) {
        List<Student> studentList = template.find("from Student where number like '%"+pageInfo.getKeywords()+"%'");;
        return studentList.size();
    }

    @Override
    public List<Course> getCourseList(int userId) {
        String hql = "from Course where id not in(select e.course.id from Elective e where e.student.id = ?)";
        List<Course> courseList = template.getSessionFactory().openSession().createQuery(hql).setInteger(0, userId).list();
        return courseList;
    }

    @Override
    public List<Course> getCourseListHasChoosed(int userId) {
        String hql = "select e.course from Elective e where e.student.id = ?";
        List<Course> courseList = template.getSessionFactory().openSession().createQuery(hql).setInteger(0, userId).list();
        return courseList;
    }

    @Override
    public void chooseCourse(Elective elective) {
        template.getSessionFactory().openSession().save(elective);
    }

    @Override
    public Course findCourseById(int courseId) {
        Course course = null;
        List<Course> list = template.getSessionFactory().openSession().createQuery("from Course where id =?").setInteger(0, courseId).list();
        if(list.size()>0){
            return list.get(0);
        }
        return course;
    }

    @Override
    public List<Teaching> showSyllabus(int userId) {
        String hql = "from Teaching t,Elective e where e.student.id=? and t.course.id = e.course.id";
        List<Teaching> teachingList = template.find(hql,userId);
        return teachingList;
    }

    @Override
    public void delete(Student student) {
        template.delete(student);
    }

    @Override
    public Student findById(int sutdentId) {
        Student student = null;
        student = (Student) template.find("from Student s where s.id=?",sutdentId).get(0);;
        return student;
    }

    @Override
    public void updateCourseNum(int studentId, int actualNum) {
        System.out.println(studentId+"sss"+actualNum);
        template.getSessionFactory().openSession().createQuery("update Student s set s.courseActualNumber=? where s.id=?").setInteger(0, actualNum).setInteger(1, studentId).executeUpdate();
    }
}
