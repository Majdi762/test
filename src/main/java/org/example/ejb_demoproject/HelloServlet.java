package org.example.ejb_demoproject;

import java.io.*;

import jakarta.ejb.EJB;
import jakarta.inject.Inject;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import org.example.ejb_demoproject.beans.WelcomeMsg;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
//    @Inject
    @EJB(beanName = "WelcomeMsg2Bean")
    WelcomeMsg welcomeMsg;
    private String message;

    public void init() {}

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        message = welcomeMsg.getWelcomeMsg();
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}