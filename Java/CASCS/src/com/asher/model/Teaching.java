package com.asher.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "teaching")
public class Teaching implements Serializable {

    private static final long serialVersionUID = 9183456364398649115L;
    private int id;
    private Teacher teacher;
    private Course course;
    private RoomTime roomTime;
    private int maxNumber;
    private int actualNumber;

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

    @ManyToOne(targetEntity = Teacher.class)
    @JoinColumn(name = "teacher_id")
    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @ManyToOne(targetEntity = Course.class)
    @JoinColumn(name = "course_id")
    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    @ManyToOne(targetEntity = RoomTime.class)
    @JoinColumn(name = "room_time_id")
    public RoomTime getRoomTime() {
        return roomTime;
    }

    public void setRoomTime(RoomTime roomTime) {
        this.roomTime = roomTime;
    }

    @Column(name = "max_num")
    public int getMaxNumber() {
        return maxNumber;
    }

    public void setMaxNumber(int maxNumber) {
        this.maxNumber = maxNumber;
    }

    @Column(name = "actual_num")
    public int getActualNumber() {
        return actualNumber;
    }

    public void setActualNumber(int actualNumber) {
        this.actualNumber = actualNumber;
    }

    public Teaching(int id, Teacher teacher, Course course, RoomTime roomTime,
            int maxNumber, int actualNumber) {
        super();
        this.id = id;
        this.teacher = teacher;
        this.course = course;
        this.roomTime = roomTime;
        this.maxNumber = maxNumber;
        this.actualNumber = actualNumber;
    }

    public Teaching() {
        super();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + actualNumber;
        result = prime * result + ((course == null) ? 0 : course.hashCode());
        result = prime * result + id;
        result = prime * result + maxNumber;
        result = prime * result
                + ((roomTime == null) ? 0 : roomTime.hashCode());
        result = prime * result + ((teacher == null) ? 0 : teacher.hashCode());
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
        Teaching other = (Teaching) obj;
        if (actualNumber != other.actualNumber)
            return false;
        if (course == null) {
            if (other.course != null)
                return false;
        } else if (!course.equals(other.course))
            return false;
        if (id != other.id)
            return false;
        if (maxNumber != other.maxNumber)
            return false;
        if (roomTime == null) {
            if (other.roomTime != null)
                return false;
        } else if (!roomTime.equals(other.roomTime))
            return false;
        if (teacher == null) {
            if (other.teacher != null)
                return false;
        } else if (!teacher.equals(other.teacher))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Teaching [id=" + id + ", teacher=" + teacher + ", course="
                + course + ", roomTime=" + roomTime + ", maxNumber="
                + maxNumber + ", actualNumber=" + actualNumber + "]";
    }
}
