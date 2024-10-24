package org.example.ejb_demoproject.beans;

import jakarta.ejb.Remote;
import jakarta.ejb.Stateless;

@Stateless
@Remote(WelcomeMsg.class)
public class WelcomeMsgBean implements WelcomeMsg {
    @Override
    public String getWelcomeMsg() {
        return " this is a msg from welcome message bean";
    }
}
