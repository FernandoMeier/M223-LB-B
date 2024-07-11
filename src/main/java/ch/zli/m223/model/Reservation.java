package ch.zli.m223.model;

public interface Reservation {
    Long getId();
    String getName();
    AppUser getUser();
    String getRoom();
}
