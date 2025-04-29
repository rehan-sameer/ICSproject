package models;

public class Reservation {
    private String reservationId;
    private String roomId;
    private String userId;
    private int startTime; // in 24-hour format, e.g. 900 for 9:00 AM
    private int endTime;   // e.g. 1100 for 11:00 AM

    public Reservation(String reservationId, String roomId, String userId, int startTime, int endTime) {
        this.reservationId = reservationId;
        this.roomId = roomId;
        this.userId = userId;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public String getRoomId() { return roomId; }
    public int getStartTime() { return startTime; }
    public int getEndTime() { return endTime; }
}
