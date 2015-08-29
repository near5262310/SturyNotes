package com.asher.vo;

import java.io.Serializable;

public class RoomAndTime implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = -5854856992018718485L;
    private int roomId;
    private String roomNumber;
    private String roomDescription;
    private int roomCapicity;
    private int timeId;
    private String week;
    private String timeperiod;

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getRoomDescription() {
        return roomDescription;
    }

    public void setRoomDescription(String roomDescription) {
        this.roomDescription = roomDescription;
    }

    public int getRoomCapicity() {
        return roomCapicity;
    }

    public void setRoomCapicity(int roomCapicity) {
        this.roomCapicity = roomCapicity;
    }

    public int getTimeId() {
        return timeId;
    }

    public void setTimeId(int timeId) {
        this.timeId = timeId;
    }

    public String getWeek() {
        return week;
    }

    public void setWeek(String week) {
        this.week = week;
    }

    public String getTimeperiod() {
        return timeperiod;
    }

    public void setTimeperiod(String timeperiod) {
        this.timeperiod = timeperiod;
    }

    public RoomAndTime() {
        super();
    }

    @Override
    public String toString() {
        return "RoomAndTime [roomId=" + roomId + ", roomNumber=" + roomNumber
                + ", roomDescription=" + roomDescription + ", roomCapicity="
                + roomCapicity + ", timeId=" + timeId + ", week=" + week
                + ", timeperiod=" + timeperiod + "]";
    }

    public RoomAndTime(int roomId, String roomNumber, String roomDescription,
            int roomCapicity, int timeId, String week, String timeperiod) {
        super();
        this.roomId = roomId;
        this.roomNumber = roomNumber;
        this.roomDescription = roomDescription;
        this.roomCapicity = roomCapicity;
        this.timeId = timeId;
        this.week = week;
        this.timeperiod = timeperiod;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + roomCapicity;
        result = prime * result
                + ((roomDescription == null) ? 0 : roomDescription.hashCode());
        result = prime * result + roomId;
        result = prime * result
                + ((roomNumber == null) ? 0 : roomNumber.hashCode());
        result = prime * result + timeId;
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
        RoomAndTime other = (RoomAndTime) obj;
        if (roomCapicity != other.roomCapicity)
            return false;
        if (roomDescription == null) {
            if (other.roomDescription != null)
                return false;
        } else if (!roomDescription.equals(other.roomDescription))
            return false;
        if (roomId != other.roomId)
            return false;
        if (roomNumber == null) {
            if (other.roomNumber != null)
                return false;
        } else if (!roomNumber.equals(other.roomNumber))
            return false;
        if (timeId != other.timeId)
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

}
