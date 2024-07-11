package ch.zli.m223.controller.reservations;

import ch.zli.m223.controller.reservations.ReservationsDto.ReservationDto;
import ch.zli.m223.service.user.ReservationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/v1/admin/reservations")
@RequiredArgsConstructor
public class ReservationAdminController {
    private final ReservationService reservationService;

    @GetMapping()
    List<ReservationDto> getReservationList() {
        return reservationService.getReservationList().stream()
        .map( reservation -> new ReservationDto(reservation))
        .collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    ReservationDto getReservationById(Long id) {
        return new ReservationDto(reservationService.getReservation(id));
    }

    @DeleteMapping("/{id}")
    void deleteReservationById(Long id) {
        reservationService.deleteReservation(id);
    }


}
