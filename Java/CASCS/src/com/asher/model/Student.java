package com.asher.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "student")
public class Student implements Serializable {

    private static final long serialVersionUID = -7153993079523825628L;
    private int id;
    private String number;
    private String username;
    private String password;
    private String sex;
    private String className;
    private String type;
    private String department;
    private String major;
    private int courseMaxNumber;
    private int courseActualNumber;
    private Date birthday;
    private Date inTime;
    private String grade;
    private String note;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @GenericGenerator(name = "persistenceGenerator", strategy = "increment")
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "number")
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Column(name = "username")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Column(name = "sex")
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Column(name = "class_name")
    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Column(name = "type")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Column(name = "department")
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Column(name = "major")
    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Column(name = "course_max_num")
    public int getCourseMaxNumber() {
        return courseMaxNumber;
    }

    public void setCourseMaxNumber(int courseMaxNumber) {
        this.courseMaxNumber = courseMaxNumber;
    }

    @Column(name = "course_actual_num")
    public int getCourseActualNumber() {
        return courseActualNumber;
    }

    public void setCourseActualNumber(int courseActualNumber) {
        this.courseActualNumber = courseActualNumber;
    }

    @Column(name = "birthday")
    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Column(name = "in_time")
    public Date getInTime() {
        return inTime;
    }

    public void setInTime(Date inTime) {
        this.inTime = inTime;
    }

    @Column(name = "grade")
    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Column(name = "note")
    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Student() {
        super();
    }

    public Student(int id, String number, String username, String password,
            String sex, String className, String type, String department,
            String major, int courseMaxNumber, int courseActualNumber,
            Date birthday, Date inTime, String grade, String note) {
        super();
        this.id = id;
        this.number = number;
        this.username = username;
        this.password = password;
        this.sex = sex;
        this.className = className;
        this.type = type;
        this.department = department;
        this.major = major;
        this.courseMaxNumber = courseMaxNumber;
        this.courseActualNumber = courseActualNumber;
        this.birthday = birthday;
        this.inTime = inTime;
        this.grade = grade;
        this.note = note;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", number=" + number + ", username="
                + username + ", password=" + password + ", sex=" + sex
                + ", className=" + className + ", type=" + type
                + ", department=" + department + ", major=" + major
                + ", courseMaxNumber=" + courseMaxNumber
                + ", courseActualNumber=" + courseActualNumber + ", birthday="
                + birthday + ", inTime=" + inTime + ", grade=" + grade
                + ", note=" + note + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result
                + ((birthday == null) ? 0 : birthday.hashCode());
        result = prime * result
                + ((className == null) ? 0 : className.hashCode());
        result = prime * result + courseActualNumber;
        result = prime * result + courseMaxNumber;
        result = prime * result
                + ((department == null) ? 0 : department.hashCode());
        result = prime * result + ((grade == null) ? 0 : grade.hashCode());
        result = prime * result + id;
        result = prime * result + ((inTime == null) ? 0 : inTime.hashCode());
        result = prime * result + ((major == null) ? 0 : major.hashCode());
        result = prime * result + ((note == null) ? 0 : note.hashCode());
        result = prime * result + ((number == null) ? 0 : number.hashCode());
        result = prime * result
                + ((password == null) ? 0 : password.hashCode());
        result = prime * result + ((sex == null) ? 0 : sex.hashCode());
        result = prime * result + ((type == null) ? 0 : type.hashCode());
        result = prime * result
                + ((username == null) ? 0 : username.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Student other = (Student) obj;
        if (birthday == null) {
            if (other.birthday != null)
                return false;
        } else if (!birthday.equals(other.birthday))
            return false;
        if (className == null) {
            if (other.className != null)
                return false;
        } else if (!className.equals(other.className))
            return false;
        if (courseActualNumber != other.courseActualNumber)
            return false;
        if (courseMaxNumber != other.courseMaxNumber)
            return false;
        if (department == null) {
            if (other.department != null)
                return false;
        } else if (!department.equals(other.department))
            return false;
        if (grade == null) {
            if (other.grade != null)
                return false;
        } else if (!grade.equals(other.grade))
            return false;
        if (id != other.id)
            return false;
        if (inTime == null) {
            if (other.inTime != null)
                return false;
        } else if (!inTime.equals(other.inTime))
            return false;
        if (major == null) {
            if (other.major != null)
                return false;
        } else if (!major.equals(other.major))
            return false;
        if (note == null) {
            if (other.note != null)
                return false;
        } else if (!note.equals(other.note))
            return false;
        if (number == null) {
            if (other.number != null)
                return false;
        } else if (!number.equals(other.number))
            return false;
        if (password == null) {
            if (other.password != null)
                return false;
        } else if (!password.equals(other.password))
            return false;
        if (sex == null) {
            if (other.sex != null)
                return false;
        } else if (!sex.equals(other.sex))
            return false;
        if (type == null) {
            if (other.type != null)
                return false;
        } else if (!type.equals(other.type))
            return false;
        if (username == null) {
            if (other.username != null)
                return false;
        } else if (!username.equals(other.username))
            return false;
        return true;
    }

}
