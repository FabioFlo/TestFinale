package com.example.microservizioarticolo.util;

public class MessageResponse {

    private String message;
    private boolean succes;

    public MessageResponse(String message, boolean succes) {
        this.message = message;
        this.succes = succes;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isSucces() {
        return succes;
    }

    public void setSucces(boolean succes) {
        this.succes = succes;
    }
}
