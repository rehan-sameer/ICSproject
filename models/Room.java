package models;

public class Room {
    private String roomNumber;
    private int capacity;
    private String location;

    public Room(String roomNumber, int capacity, String location) {
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.location = location;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getLocation() {
        return location;
    }
}
