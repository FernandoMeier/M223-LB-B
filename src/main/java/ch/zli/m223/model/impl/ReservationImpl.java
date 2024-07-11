package ch.zli.m223.model.impl;

import ch.zli.m223.model.AppUser;
import ch.zli.m223.model.Reservation;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity(name="Reservation")
public class ReservationImpl implements Reservation {

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String room;

    private String name;

    private AppUser user;

    public ReservationImpl(String name, AppUser user, String room) {
        this.name = name;
        this.user = user;
        this.room = room;
    }

    protected ReservationImpl() {}

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public AppUser getUser() {
        return user;
    }

    @Override
    public String getRoom() {
        return room;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUser(AppUser user) {
        this.user = user;
    }

    public void setRoom(String room) {
        this.room = room;
    }
}
