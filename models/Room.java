package models;

public class Room {
    private String roomNo;
    private boolean occupancy;

    public Room(String roomNo, boolean occupancy ){
        this.roomNo = roomNo;
        this.occupancy = occupancy;
    }

    public String getRoomNo(){
        return this.roomNo;

    }

    public boolean getOccupancy(){
        return this.occupancy;
    }

    public void setRoomNo(String RoomNo){
        this.RoomNo = RoomNo;
    }

    public void setOccupancy(boolean occupancy){
        this.occupancy = occupancy;
    }

}
