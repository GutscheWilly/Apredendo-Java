package model.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import model.exceptions.DomainException;

public class Reservation {
    
    private Integer roomNumber;
    private LocalDate checkIn;
    private LocalDate checkOut;
    
    public Reservation(Integer roomNumber, LocalDate checkIn, LocalDate checkOut) {
        if (checkOut.isBefore(checkIn)) {
            throw new DomainException("Check-out date must be after check-in date");
        }
        this.roomNumber = roomNumber;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public LocalDate getCheckIn() {
        return checkIn;
    }

    public LocalDate getCheckOut() {
        return checkOut;
    }

    public int duration() {
        return (int) (checkOut.toEpochDay() - checkIn.toEpochDay());
    }

    public void updateDates(LocalDate checkIn, LocalDate checkOut) {
        LocalDate todayDate = LocalDate.now();
        if (checkIn.isBefore(todayDate) || checkOut.isBefore(todayDate)) {
            throw new DomainException("Reservation dates for update must be future dates");
        }
        if (checkOut.isBefore(checkIn)) {
            throw new DomainException("Check-out date must be after check-in date");
        }
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    @Override
    public String toString() {
        return String.format("Reservation: Room %d, check-in: %s, check-out: %s, %d nights",
        roomNumber,
        checkIn.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")),
        checkOut.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")),
        duration());
    }
}
