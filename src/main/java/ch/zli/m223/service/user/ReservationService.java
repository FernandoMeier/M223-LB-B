package ch.zli.m223.service.user;

import ch.zli.m223.controller.reservations.ReservationsDto.ReservationDto;
import ch.zli.m223.model.Reservation;
import ch.zli.m223.model.impl.ReservationImpl;

import java.util.List;

public interface ReservationService {
    List<ReservationImpl> getReservationList();

    Reservation getReservation(Long id);

    Reservation addReservation(
        Long userId, Long roomId, String start, String end
    );

    void deleteReservation(Long id);

    Reservation updateReservation(
        Long id,
        Long userId, Long roomId,
        String start, String end
    );
}
