package com.asher.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "time")
public class Time implements Serializable{

    private static final long serialVersionUID = -7073847798238239079L;
    private int id;
    private String week;
    private String timeperiod;

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

    @Column(name = "week")
    public String getWeek() {
        return week;
    }

    public void setWeek(String week) {
        this.week = week;
    }

    @Column(name = "timeperiod")
    public String getTimeperiod() {
        return timeperiod;
    }

    public void setTimeperiod(String timeperiod) {
        this.timeperiod = timeperiod;
    }

    public Time() {
        super();
    }

    public Time(int id, String week, String timeperiod) {
        super();
        this.id = id;
        this.week = week;
        this.timeperiod = timeperiod;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        result = prime * result
                + ((timeperiod == null) ? 0 : timeperiod.hashCode());
        result = prime * result + ((week == null) ? 0 : week.hashCode());
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
        Time other = (Time) obj;
        if (id != other.id)
            return false;
        if (timeperiod == null) {
            if (other.timeperiod != null)
                return false;
        } else if (!timeperiod.equals(other.timeperiod))
            return false;
        if (week == null) {
            if (other.week != null)
                return false;
        } else if (!week.equals(other.week))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Time [id=" + id + ", week=" + week + ", timeperiod="
                + timeperiod + "]";
    }

}
