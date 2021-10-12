package com.ahmedspringlearn.learningspring.business.domain;

import java.util.Date;

public class RoomReservation {
    private long roomId;
    public long guestId;
    private String roomName;
    private String roomNumber;
    private String firstName;
    private String lastfName;
    private Date data;

    public long getRoomId() {
        return roomId;
    }

    public void setRoomId(long roomId) {
        this.roomId = roomId;
    }

    public long getGuestId() {
        return guestId;
    }

    public void setGuestId(long guestId) {
        this.guestId = guestId;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastfName() {
        return lastfName;
    }

    public void setLastfName(String lastfName) {
        this.lastfName = lastfName;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
}
