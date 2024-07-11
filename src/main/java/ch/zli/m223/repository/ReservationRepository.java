package ch.zli.m223.repository;

import ch.zli.m223.model.AppUser;
import ch.zli.m223.model.Reservation;
import ch.zli.m223.model.impl.ReservationImpl;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ReservationRepository extends JpaRepository<ReservationImpl, Long> {
    public default ReservationImpl insertReservation(String name, AppUser user, String room) {
        return save(new ReservationImpl(name, user, room));
    }

    public Optional<Reservation> findByName(String name);

    public default Reservation update(
        Reservation reservation,
        String name, AppUser user,
        String room) {
            ReservationImpl reservationImpl = (ReservationImpl) reservation;
            if (name != null) reservationImpl.setName(name);
            if (user != null) reservationImpl.setUser(user);
            if (room != null) reservationImpl.setRoom(room);
            return save(reservationImpl);
        }
}
