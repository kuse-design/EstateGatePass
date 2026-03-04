package data.models;

import java.time.LocalDateTime;

public class GatePass {
    private int id;
    private int residentId;
    private int visitorId;
    private LocalDateTime createdAt =  LocalDateTime.now();
    private LocalDateTime expiresAt;
    private boolean isValid = true;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getResidentId() {
        return residentId;
    }

    public void setResidentId(int residentId) {
        this.residentId = residentId;
    }

    public int getVisitorId() {
        return visitorId;
    }

    public void setVisitorId(int visitorsId) {
        this.visitorId = visitorsId;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getExpiresAt() {
        return expiresAt;
    }

    public void setExpiresAt(LocalDateTime expiresAt) {
        this.expiresAt = expiresAt;
    }

    public boolean isValid() {
        return isValid;
    }

    public void setValid(boolean valid) {
        isValid = valid;
    }
}