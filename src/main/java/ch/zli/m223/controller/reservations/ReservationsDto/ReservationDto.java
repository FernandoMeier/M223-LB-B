package ch.zli.m223.controller.reservations.ReservationsDto;

import ch.zli.m223.model.AppUser;
import ch.zli.m223.model.Reservation;

public class ReservationDto {
    public Long id;
    public String name;
    public String room;
    public AppUser user;

    public ReservationDto(Reservation reservation) {
        id = reservation.getId();
        name = reservation.getName();
        room = reservation.getRoom();
        user = reservation.getUser();
    }
}