package org.example.ejb_demoproject.beans;

import jakarta.ejb.Remote;
import jakarta.ejb.Stateless;

@Stateless
@Remote(WelcomeMsg.class)
public class WelcomeMsg2Bean implements WelcomeMsg {
    @Override
    public String getWelcomeMsg() {
        return "message from welcome message bean 2";
    }
}
