package controllers;
import java.util.*;

public class RegisterController {
  private List<Reservation> reservations = new ArrayList<>();

  public boolean isRoomAvailable(String roomId, int start, int end) {
        for (Reservation r : reservations) {
            if (r.getRoomId().equals(roomId)) {
                if (start < r.getEndTime() && end > r.getStartTime()) {
                    return false; // Overlap
                }
            }
        }
        return true;
    }

    public boolean reserveRoom(String roomId, String userId, int start, int end) {
        if (isRoomAvailable(roomId, start, end)) {
            String id = UUID.randomUUID().toString();
            reservations.add(new Reservation(id, roomId, userId, start, end));
            return true;
        }
        return false;
    }

    public List<Reservation> getAllReservations() {
        return reservations;
    }
}
