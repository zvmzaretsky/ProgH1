package com.example.ProgH1;

import com.example.ProgH1.objects.Answer;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "quizServlet", urlPatterns = "/quiz")
public class QuizServlet extends HttpServlet {

    public static int[] answers = new int[8];

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, NullPointerException {
        resp.setContentType("text/html");

        int uid = DB.user.getId();
        int q1 = Integer.parseInt(req.getParameter("q1"));
        int q2 = Integer.parseInt(req.getParameter("q2"));

        DB.answers.add(new Answer(uid, 0, q1));
        DB.answers.add(new Answer(uid, 1, q2));

        for (Answer answer : DB.answers) {

            int type = answer.getType();

            if (answer.getUid() == uid) {
                switch (type) {
                    case 0:
                        switch (answer.getAnswer()) {
                            case 0: answers[0]++;
                            case 1: answers[1]++;
                        }
                    case 1:
                        switch (answer.getAnswer()) {
                            case 0: answers[2]++;
                            case 1: answers[3]++;
                        }
                }
            }

            switch (type) {
                case 0:
                    switch (answer.getAnswer()) {
                        case 0: answers[4]++;
                        case 1: answers[5]++;
                    }
                case 1:
                    switch (answer.getAnswer()) {
                        case 0: answers[6]++;
                        case 1: answers[7]++;
                    }
            }
        }

        resp.sendRedirect("result.jsp");
    }

    public static int[] getAnswers() {
        return answers;
    }
}
