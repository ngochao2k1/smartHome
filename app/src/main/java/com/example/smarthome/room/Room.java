package com.example.smarthome.room;

public class Room {
    private int id_resource,switchRoom;
    private String nameRoom;
    private int numberDevices;

    public Room(int id_resource, int switchRoom, String nameRoom, int numberDevices) {
        this.id_resource = id_resource;
        this.switchRoom = switchRoom;
        this.nameRoom = nameRoom;
        this.numberDevices = numberDevices;
    }

    public int getId_resource() {
        return id_resource;
    }

    public void setId_resource(int id_resource) {
        this.id_resource = id_resource;
    }

    public int getSwitchRoom() {
        return switchRoom;
    }

    public void setSwitchRoom(int switchRoom) {
        this.switchRoom = switchRoom;
    }

    public String getNameRoom() {
        return nameRoom;
    }

    public void setNameRoom(String nameRoom) {
        this.nameRoom = nameRoom;
    }

    public int getNumberDevices() {
        return numberDevices;
    }

    public void setNumberDevices(int numberDevices) {
        this.numberDevices = numberDevices;
    }
}
