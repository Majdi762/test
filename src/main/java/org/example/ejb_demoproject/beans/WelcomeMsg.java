package org.example.ejb_demoproject.beans;

import jakarta.ejb.Remote;

@Remote
public interface WelcomeMsg {
    public String getWelcomeMsg();
}
