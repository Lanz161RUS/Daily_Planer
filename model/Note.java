package model;

import java.time.LocalDateTime;

public class Note {
    public LocalDateTime dateTime;
    public String description;

    public Note(LocalDateTime dateTime, String description) {
        this.dateTime = dateTime;
        this.description = description;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    @Override
    public String toString() {
        return dateTime.toString() + ": " + description;
    }
}