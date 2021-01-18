package com.example.ProgH1;

import com.example.ProgH1.objects.User;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "indexServlet", urlPatterns = "/index")
public class LoginServlet extends HttpServlet {

    private static final Map<String, User> credentials = new HashMap<>();

    static {
        credentials.put("admin", new User(0, "pass"));
        credentials.put("user", new User(1, "pass"));
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

        String login = request.getParameter("login");
        String password = request.getParameter("password");

        User user = credentials.get(login);

        if (user.getPassword().equals(password)) {

            DB.user = user;

            HttpSession session = request.getSession(true);
            session.setAttribute("uid", user.getId());
            response.sendRedirect("quiz.jsp");

        } else {
            response.sendRedirect("index.jsp");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        String a = request.getParameter("a");
        HttpSession session = request.getSession(false);

        if ("exit".equals(a) && (session != null)) {
            session.removeAttribute("uid");
        }

        DB.user = null;
        response.sendRedirect("index.jsp");
    }
}