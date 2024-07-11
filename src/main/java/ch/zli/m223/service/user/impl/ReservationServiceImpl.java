package ch.zli.m223.service.user.impl;

import ch.zli.m223.model.Reservation;
import ch.zli.m223.repository.ReservationRepository;
import ch.zli.m223.service.user.ReservationService;
import ch.zli.m223.service.user.exception.InvalidIdException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ReservationServiceImpl implements ReservationService {

    private final ReservationService reservationService;
    private final ReservationRepository reservationRepository;

    @Override
    public List<Reservation> getReservationList() {
        return new ArrayList<>(reservationService.getReservationList());
    }

    @Override
    public Reservation getReservation(Long id) {
        if (id == null) {
            throw new InvalidIdException();
        }
        return reservationService.getReservation(id);
    }

    @Override
    public Reservation addReservation(Long userId, Long roomId, String start, String end) {
        if (userId == null || roomId == null || start == null || end == null) {
            throw new InvalidIdException();
        }
        return reservationService.addReservation(userId, roomId, start, end);
    }

    @Override
    public void deleteReservation(Long id) {
        if (id == null) {
            throw new InvalidIdException();
        }
        reservationService.deleteReservation(id);
    }

    @Override
    public Reservation updateReservation(Long id, Long userId, Long roomId, String start, String end) {
        if (id == null || userId == null || roomId == null || start == null || end == null) {
            throw new InvalidIdException();
        }
        return reservationService.updateReservation(id, userId, roomId, start, end);
    }
}
